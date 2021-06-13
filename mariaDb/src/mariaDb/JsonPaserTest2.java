package mariaDb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;



public class JsonPaserTest2 {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.setDoInput(true);
			
			InputStream input=conn.getInputStream();
			BufferedReader buffer=new BufferedReader(new InputStreamReader(input));
			
			String ss=null;
			String result="";
			while((ss=buffer.readLine())!=null) {
				result+=ss;
			}
			System.out.println(result);
			Gson g1=new Gson();
			System.out.println("dd");
			MyJson[] m1=g1.fromJson(result, MyJson[].class);
			for(int i=0;i<10;i++) {
				System.out.println(m1[i].getTitle());
				System.out.println(i);
			}
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
}
class MyJson {
	private int userid;
	private String id;
	private String title;
	private boolean completed;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "MyJson [userid=" + userid + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	
	
	
}
