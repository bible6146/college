package mariaDb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonPaserTest {
	
	String url = "jdbc:mariadb://localhost:3306/oop2";
	String name="root";
	String pw="bi700523";
	
	Connection conn;
	private static String JDBC_name="org.mariadb.jdbc.Driver";

	public static void main(String[] args) {
		new JsonPaserTest();
	}
	
	public JsonPaserTest() {
		try {
			Class.forName(JDBC_name);
			conn=DriverManager.getConnection(url,name,pw);
			URL url=new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			InputStream input=conn.getInputStream();
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(input));
			
			String ss=null;
			String result="";
			while((ss=reader.readLine())!=null) {
				result+=ss;
			}

			JsonParser json=new JsonParser();
			JsonArray obj=(JsonArray)json.parse(result);
			dbcreate();
			for(int i=0;i<obj.size();i++) {
				dbInsert((JsonObject)obj.get(i));
			}
		}catch(Exception e) {
			
		}
	}
	public void dbcreate() {
		try {
			PreparedStatement pre=conn.prepareStatement("create table users2 as select * from users where 1=2");
			pre.execute();
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	
	public void dbInsert(JsonObject obj) {
		try {
			
			PreparedStatement pre=conn.prepareStatement("insert into users2 values(?,?,?,?)");
			pre.setInt(1, Integer.parseInt(obj.get("userId").toString()));
			pre.setInt(2, Integer.parseInt(obj.get("id").toString()));
			pre.setString(3, obj.get("title").toString());
			if(obj.get("completed").toString().equals("true")) {
				pre.setInt(4,1);					
			}else pre.setInt(4, 0);
			pre.executeUpdate();
			pre.close();
			
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
