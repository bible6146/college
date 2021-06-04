import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.google.gson.Gson;

public class RemoteJson {
	

	
	public static void main(String agrs[]) {
		try {
			String site="https://jsonplaceholder.typicode.com/users";
			
			URL url=new URL(site);
			
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			
			InputStream in=conn.getInputStream();
			
			BufferedReader bu=new BufferedReader(new InputStreamReader(in));
			
			String sd=null;
			String result="";
			while((sd=bu.readLine())!=null) {
				result+=sd;
			}
			
			Gson gson=new Gson();
			
			Post[] posts=gson.fromJson(result, Post[].class);
			
			for(Post post:posts) {
				System.out.println(post.getId()+post.getName());
			}
		
			insertIntoDB(posts);
			
//			JsonParser par=new JsonParser();
//			
//			JsonArray json=(JsonArray) par.parse(result);
//			
//			for(int i=0;i<json.size();i++) {
//				JsonObject ob=(JsonObject)json.get(i);
//				System.out.println(ob.get("name"));
//			}
			
//			Gson gson=new Gson();
//			Person person=gson.fromJson("{'name':kim,'age':10,'grad':'true'}", Person.class);
//			
//			
//			System.out.println(person.getName());
//			System.out.println(person.getAge());
//			System.out.println(person.getName());
//			/*
//			 * */
			
		
		}catch(Exception e) {
			
		}
		
	}
	private static void insertIntoDB(Post[] posts) {
		
//		private static String JDBC_name="org.mariadb.jdbc.Driver";
//		
		String url = "jdbc:mariadb://localhost:3306/oop2";
		String name="root";
		String pw="bi700523";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,name,pw);
			String sql="insert into USER(id,NAME) values(?, ?)";
			
			PreparedStatement pstmt= conn.prepareStatement(sql);
			System.out.println("1");
			System.out.println(posts.length);
			for(Post post:posts) {
				System.out.println("2");
				pstmt.setInt(1, post.getId());
				System.out.println("2-1");
				pstmt.setString(2, post.getName());
				System.out.println("2-2");
				pstmt.executeUpdate();
				System.out.println("3");
			}
			
		}catch (Exception e) {
			System.out.println("WERRWEREWRWEERR");
			System.out.println(e.getMessage());
			e.getStackTrace();
			
			// TODO: handle exception
		}
	}
}

class Person{
	//javabean 형태로 클래스를정의
	//private memver 변수에 대한 getter setter를가짐
	//default 생성자를 가진다
	private String name;
	private int age;
	private boolean grad;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGrad() {
		return grad;
	}
	public void setGrad(boolean grad) {
		this.grad = grad;
	}
	
}
