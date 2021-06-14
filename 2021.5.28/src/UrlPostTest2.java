import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlPostTest2 {
	
	public static void main(String agrs[]) {
		try {
			String site="http://localhost:9090/todos";
			
			URL url=new URL(site);
			
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
//			System.out.println(con.getResponseCode());
			con.setRequestMethod("POST");
//			con.setDoInput(true);
			con.setDoOutput(true);
			
			con.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			
			String data="id=scpark&pw=222";

		
			OutputStream ostream=con.getOutputStream();
			
			OutputStreamWriter owr=new OutputStreamWriter(ostream,"UTF-8");
			
			PrintWriter writer=new PrintWriter(owr);
			writer.println(data);
			writer.flush();//혹시 안갔으면 비워라
			
			StringBuffer buffer=new StringBuffer();
			
			InputStream input =con.getInputStream();
			InputStreamReader st=new InputStreamReader(input);
			
			BufferedReader reder=new BufferedReader(st);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
