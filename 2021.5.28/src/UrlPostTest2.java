import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlPostTest2 {
	
	public static void main(String agrs[])throws Exception {
		String site="http://localhost:8080";
		
		URL url=new URL(site);
		
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		
		con.setDoInput(true);
		con.setDoOutput(true);
		
		con.setRequestProperty("content-type", "application/x-www/form-urlencoded");
		
		String data="id=scpark&pw=1111";
//		StringBuffer buffer=new StringBuffer();
	
		OutputStream ostream=con.getOutputStream();
		
		OutputStreamWriter owr=new OutputStreamWriter(ostream,"UTF-8");
		
		PrintWriter writer=new PrintWriter(owr);
		writer.println(data);
		writer.flush();//혹시 안갔으면 비워라
	}

}
