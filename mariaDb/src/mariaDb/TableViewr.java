package mariaDb;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TableViewr extends JFrame implements ActionListener{
	
	private JTextField idField,titleField,publisherField,yearField,priceField;
	private JButton b1,b2,b3,b4;
	
	String url = "jdbc:mariadb://localhost:3306/oop2";
	String name="root";
	String pw="bi700523";
	
	private static String JDBC_name="org.mariadb.jdbc.Driver";
	Connection con;
	String firstSql="select * from book order by book_id desc";
	//order by 절이 없으면 어떤 순서로 나올지 모른다 대이터 적을때는 순서 대로 나오지만 적으면 얘기가 다름
	
	
	
	ResultSet rs;

	
	public TableViewr() {
		try {
			Class.forName(JDBC_name);
			con= DriverManager.getConnection(url,name,pw);
			PreparedStatement pstmt= con.prepareStatement(firstSql);
			rs=pstmt.executeQuery();
			
		}catch(Exception e){
			System.out.println(e.getMessage()+"드라이버 못찾은 오류");
			System.exit(1);
		}
		
		this.setLayout(new GridLayout(0,2));
		
		this.add(new JLabel("ID",JLabel.CENTER));
		idField=new JTextField(10);
		this.add(idField);
		
		this.add(new JLabel("Title",JLabel.CENTER));
		titleField=new JTextField();
		this.add(titleField);
		
		this.add(new JLabel("publisher",JLabel.CENTER));
		publisherField=new JTextField();
		this.add(publisherField);
		
		
		this.add(new JLabel("year",JLabel.CENTER));
		yearField=new JTextField();
		this.add(yearField);
		
		this.add(new JLabel("price",JLabel.CENTER));
		priceField=new JTextField();
		this.add(priceField);
		
		
		b1=new JButton("privious");
		b1.addActionListener(this);
		this.add(b1);
		
		b2=new JButton("next");
		b2.addActionListener(this);
		this.add(b2);
		
		b3=new JButton("insert");
		b3.addActionListener(this);
		this.add(b3);
		
		b4=new JButton("finish");
		b4.addActionListener(this);
		this.add(b4);
		
		this.setSize(350,200);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String qr=publisherField.getText();
		try {
			if(e.getSource()==b1||e.getSource()==b2) {
				if(e.getSource()==b1) {
					rs.previous();
				}
				if(e.getSource()==b2) {
					rs.next();
				}
				int bookId=rs.getInt("book_id");
				idField.setText(String.valueOf(bookId));
				String title=rs.getString("title");
				titleField.setText(title);
				String publi=rs.getString("publisher");
				publisherField.setText(publi);
				Date year=rs.getDate("year");
				yearField.setText(year.toString());
				int price=rs.getInt("price");
				priceField.setText(String.valueOf(price));
			}
			else if(e.getSource()==b3) {
				String sql="insert into book(title,publisher,year,price) values(?,?,?,?)";
				PreparedStatement pstmt= con.prepareStatement(sql);
				
				pstmt.setString(1, titleField.getText().toString());
				pstmt.setString(2, publisherField.getText().toString());
				
				//String을 -> date로 바꾸는법
				String dateStr=yearField.getText();

				SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
				//자바 util date랑 자바 sql date랑 달라서 타입캐스팅 오류
				//안헷갈리게 하려면
				java.util.Date date= format.parse(dateStr);
				java.sql.Date sqldate=new java.sql.Date(date.getTime());
				
				long add=30;
//				Date date=new Date(format.parse(dateStr).getTime());
				pstmt.setDate(3,sqldate);
				
				pstmt.setDate(3,sqldate);
				
//				pstmt.setDate(3, Date.valueOf(dateStr));//더간단하게도 가능
	
				pstmt.setInt(4, Integer.parseInt(priceField.getText()));
				
				pstmt.executeUpdate();
	
				
				pstmt= con.prepareStatement(firstSql);
				rs=pstmt.executeQuery();
				JOptionPane.showMessageDialog(this,"등록성공");
			}
			else if(e.getSource()==b4) {
				System.err.println("프로그램종료!");
				con.close();
				this.dispose();
				System.exit(1);
			}
			
			
		}
		catch(Exception e1) {
			JOptionPane.showMessageDialog(this,e1.getMessage());
			
		}
		
	}
	public static void main(String agrs[]) {
		new TableViewr();
	}

}
