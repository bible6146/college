import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JdbcTestDemo extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5; 
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3,b4;
	
	String url = "jdbc:mariadb://localhost:3306/oop2";
	String name="root";
	String pw="bi700523";
	
	
	private static String JDBC_name="org.mariadb.jdbc.Driver";
	
	ResultSet set;
	Connection conn;
	
	String sql="insert into temp(book_id,title) values(?,?)";
	
	public JdbcTestDemo() {
		try {
			Class.forName(JDBC_name);
			conn=DriverManager.getConnection(url,name,pw);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		db();
		
		this.setLayout(new GridLayout(0,2));
	
		l1=new JLabel("id");
		this.add(l1);
		t1=new JTextField();
		this.add(t1);
		
		l2=new JLabel("title");
		this.add(l2);
		t2=new JTextField();
		this.add(t2);
		
		l3=new JLabel("publisher");
		this.add(l3);
		t3=new JTextField();
		this.add(t3);
		
		l4=new JLabel("year");
		this.add(l4);
		t4=new JTextField();
		this.add(t4);
		
		l5=new JLabel("price");
		this.add(l5);
		t5=new JTextField();
		this.add(t5);
		
		b1=new JButton("next");
		b1.addActionListener(this);
		this.add(b1);
		
		b2=new JButton("previous");
		b2.addActionListener(this);
		this.add(b2);
		
		b3=new JButton("삽입");
		b3.addActionListener(this);
		this.add(b3);
		
		b4=new JButton("종료");
		b4.addActionListener(this);
		this.add(b4);
		
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				set.next();
				System.out.println(set.getString("title"));
			} catch (SQLException e1) {
				JOptionPane.showConfirmDialog(this,"마지막입니다");
			}
		}
		if(e.getSource()==b2) {
			try {
				set.previous();
				System.out.println(set.getString("title"));
			}catch (Exception e2) {
				JOptionPane.showConfirmDialog(this,"마지막입니다");
			}
		}
		if(e.getSource()==b3) {
			
			try {
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1,Integer.parseInt(t1.getText().toString()));
				pst.setString(2,t2.getText().toString());
				pst.executeUpdate();
				
				t1.setText("");
				t2.setText("");
				db();
				
			}catch (SQLException e1) {
				e1.getStackTrace();
			}
		}
		
	}
	public void db() {
		try {
		
			PreparedStatement pst=conn.prepareStatement("select * from temp");
			set=pst.executeQuery();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String agrs[]) {
		new JdbcTestDemo();
	}
}
