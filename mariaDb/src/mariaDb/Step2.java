package mariaDb;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Step2 extends JPanel implements ActionListener{
	JTextField t1=new JTextField(40);
	JButton add=new JButton("추가");
	JButton del=new JButton("삭제");
	JButton serach=new JButton("검색");
	Properties prop;
	private String file="dict.props";
	
	private static String JDBC_name="org.mariadb.jdbc.Driver";
	
	String url = "jdbc:mariadb://localhost:3306/oop2";
	String name="root";
	String pw="bi700523";
	
	String sql="select * from dict";
	
	Connection con;
	
	//한영사전 : 한글단어와 대응되는 영어단어의 쌍을 저장 
	
	private Map<String,String> dict=new HashMap<>();
	
	public Step2 () {
		
		this.add(t1);
		this.add(add);
		this.add(serach);
		this.add(del);
		
		
		add.addActionListener(this);
		serach.addActionListener(this);
		del.addActionListener(this);
		
		this.setPreferredSize(new Dimension(600,50));
		
		
		//jdbc 드라이버를 메모리에 적재하기 
		//jdbc 드라이버 클래스 이름은 dbms마다 다르다
		try {
			Class.forName(JDBC_name);
			buildDictionaryDB();
			Connection con= DriverManager.getConnection(url,name,pw);
		}catch(Exception e) {
			System.out.println(e.getMessage()+"드라이버 못찾은 오류");
			System.exit(1);
		}
		buildDictionary();
		
		
		
		
	}
	private void buildDictionaryDB() {
		//데이터 베이스 연결							//conenection 객체를 리턴함
		try {
			System.out.println("연결완료");
			
			//객체는 실행준비가 완료된 객체
			PreparedStatement pstmt= con.prepareStatement(sql);
			
			
			//insert, delete ,update 실행은
			//executeupate() 호출하고
			//select 문의 실행은 exxcuteQuery() 를 호출
			ResultSet rs=pstmt.executeQuery(); //반환값은 결과집합
			
			//칼람하나씩 빼오기
			while(rs.next()) {
//				System.out.println(rs.getString(1));
				
				//순서로 호출하던가 칼람 이름으로 호출가능
				String key=rs.getString("kor");
				String value=rs.getString("eng");
				dict.put(key, value);
				dict.put(value, key);
				System.out.println(key+":"+value);
			}
		}catch(SQLException e) {
			System.out.print(e.getMessage()+"아이디 주소 비번 오류");
		}
	}

	private void buildDictionary() {
		prop=new Properties();
		try(FileReader reader=new FileReader(file)){
			prop.load(reader);	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		Set<Object> set=prop.keySet();
		
		for(Object s: set) {
			Object value=prop.get(s);
			dict.put((String)s,(String) value);
			dict.put((String) value,(String)s);
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp=(JButton)e.getSource();
		String key=t1.getText();
		String sum=dict.get(key);
		if(0==key.trim().length())return;
		
		
		if(temp==serach) {
			String value=dict.get(key);
			if(value==null) {
				JOptionPane.showMessageDialog(this,"단어를 찾을 수없습니다", key,JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this,value+"입니다", key,JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(temp==add){
			String value=JOptionPane.showInputDialog(this,key+" 에 대응 하는 단어를 입력 하세요");
			if(0==key.trim().length())return;
			JOptionPane.showMessageDialog(this,"영어 단어가 추가 되었습니다", "성공",JOptionPane.INFORMATION_MESSAGE);
			prop.put(key, value);
			try(PrintWriter out=new PrintWriter(file)){
				prop.store(out, "My Dictionary");
			}catch(Exception e1){
				System.out.println(e1.getMessage());
			}
			addDB(key,value);
			dict.put(key, value);
			dict.put(value,key);
		}
		else if(temp==del) {
			dict.remove(dict.get(key));
			dict.remove(key);
			prop.clear();
			Set<String> set=dict.keySet();
			for(String s:set) {
				prop.put(s,dict.get(s));
			}
			
			try(PrintWriter out=new PrintWriter(file)){
				prop.store(out, "My Dictionary");
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				System.exit(1);
			}
			System.out.println("지우기");
		}
		t1.setText("");
		t1.requestFocus();
	}
	
	private void addDB(String key,String value) {
		//드라이버를 메모리에 적해하는것은 한번만 하면 되고 이미 생성자에서 하면됨
		//db에 연결해서 connection 객체를 반환 받는다
		//connection 객체에게 preparedStatement 객체를 요처한다
		//호출해서 db에 저장한다.
		try{
			//? 는 place holder 
			String sql="insert into dict values(?, ?)";
			//실행 준비 1.문법검사 2.정당성 검사 (테이블 ,칼럼 등이 실제로 있는지, 있다면 이사용자가 레코드를 삽입할권환이 있는지
			//3.실행 계획을 세운다.(execution plan)
			PreparedStatement pstmt= con.prepareStatement(sql);
			//? 자리의 칼럼 데이터 타입에 따라 적절한 setxxx() 메소드를 호출해야 한다
			//예를 들어 칼럼이 char 또는 varchar 타입이면 setString()
			//칼럼이 TimeStamp 타입이면 setDate(),
			//칼럼이 int 타입이면 setInt()
			
			pstmt.setString(1, key);
			pstmt.setString(2, value);
			
			pstmt.executeUpdate();//세팅해노은값들을 실행하는 코드 반환값은 int , 몆개나 업대이트 삭제 됫는지
			
		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.add(new Step1());
		f1.setTitle("나의 한영 사전");
		f1.setLocation(500,300);
		f1.setResizable(false);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
}