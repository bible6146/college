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
	JButton add=new JButton("�߰�");
	JButton del=new JButton("����");
	JButton serach=new JButton("�˻�");
	Properties prop;
	private String file="dict.props";
	
	private static String JDBC_name="org.mariadb.jdbc.Driver";
	
	String url = "jdbc:mariadb://localhost:3306/oop2";
	String name="root";
	String pw="bi700523";
	
	String sql="select * from dict";
	
	Connection con;
	
	//�ѿ����� : �ѱ۴ܾ�� �����Ǵ� ����ܾ��� ���� ���� 
	
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
		
		
		//jdbc ����̹��� �޸𸮿� �����ϱ� 
		//jdbc ����̹� Ŭ���� �̸��� dbms���� �ٸ���
		try {
			Class.forName(JDBC_name);
			buildDictionaryDB();
			Connection con= DriverManager.getConnection(url,name,pw);
		}catch(Exception e) {
			System.out.println(e.getMessage()+"����̹� ��ã�� ����");
			System.exit(1);
		}
		buildDictionary();
		
		
		
		
	}
	private void buildDictionaryDB() {
		//������ ���̽� ����							//conenection ��ü�� ������
		try {
			System.out.println("����Ϸ�");
			
			//��ü�� �����غ� �Ϸ�� ��ü
			PreparedStatement pstmt= con.prepareStatement(sql);
			
			
			//insert, delete ,update ������
			//executeupate() ȣ���ϰ�
			//select ���� ������ exxcuteQuery() �� ȣ��
			ResultSet rs=pstmt.executeQuery(); //��ȯ���� �������
			
			//Į���ϳ��� ������
			while(rs.next()) {
//				System.out.println(rs.getString(1));
				
				//������ ȣ���ϴ��� Į�� �̸����� ȣ�Ⱑ��
				String key=rs.getString("kor");
				String value=rs.getString("eng");
				dict.put(key, value);
				dict.put(value, key);
				System.out.println(key+":"+value);
			}
		}catch(SQLException e) {
			System.out.print(e.getMessage()+"���̵� �ּ� ��� ����");
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
				JOptionPane.showMessageDialog(this,"�ܾ ã�� �������ϴ�", key,JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this,value+"�Դϴ�", key,JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(temp==add){
			String value=JOptionPane.showInputDialog(this,key+" �� ���� �ϴ� �ܾ �Է� �ϼ���");
			if(0==key.trim().length())return;
			JOptionPane.showMessageDialog(this,"���� �ܾ �߰� �Ǿ����ϴ�", "����",JOptionPane.INFORMATION_MESSAGE);
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
			System.out.println("�����");
		}
		t1.setText("");
		t1.requestFocus();
	}
	
	private void addDB(String key,String value) {
		//����̹��� �޸𸮿� �����ϴ°��� �ѹ��� �ϸ� �ǰ� �̹� �����ڿ��� �ϸ��
		//db�� �����ؼ� connection ��ü�� ��ȯ �޴´�
		//connection ��ü���� preparedStatement ��ü�� ��ó�Ѵ�
		//ȣ���ؼ� db�� �����Ѵ�.
		try{
			//? �� place holder 
			String sql="insert into dict values(?, ?)";
			//���� �غ� 1.�����˻� 2.���缺 �˻� (���̺� ,Į�� ���� ������ �ִ���, �ִٸ� �̻���ڰ� ���ڵ带 �����ұ�ȯ�� �ִ���
			//3.���� ��ȹ�� �����.(execution plan)
			PreparedStatement pstmt= con.prepareStatement(sql);
			//? �ڸ��� Į�� ������ Ÿ�Կ� ���� ������ setxxx() �޼ҵ带 ȣ���ؾ� �Ѵ�
			//���� ��� Į���� char �Ǵ� varchar Ÿ���̸� setString()
			//Į���� TimeStamp Ÿ���̸� setDate(),
			//Į���� int Ÿ���̸� setInt()
			
			pstmt.setString(1, key);
			pstmt.setString(2, value);
			
			pstmt.executeUpdate();//�����س��������� �����ϴ� �ڵ� ��ȯ���� int , �p���� ������Ʈ ���� �̴���
			
		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.add(new Step1());
		f1.setTitle("���� �ѿ� ����");
		f1.setLocation(500,300);
		f1.setResizable(false);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}
}