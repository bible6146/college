import java.sql.Connection;
import java.sql.DriverManager;

public class TestDataBase {
	private static String JDBC_name="org.mariadb.jdbc.Driver";

	public static void main(String[] args) {
		Connection conn;
		
		try {
			Class.forName(JDBC_name);
			try {
				conn=DriverManager.getConnection("https://eatx.shop/phpMyAdmin/server_databases.php/users_db",
						"jung","jung123");
				System.out.println("���Ἲ��");
				conn.close();
			}catch(Exception e) {
				System.out.println("�������");
				System.exit(1);
				
			}
		}catch(Exception e) {
			
		}
		

	}

}
