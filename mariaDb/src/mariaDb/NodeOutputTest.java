package mariaDb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

public class NodeOutputTest {

	public static void main(String[] args) {
		try {
			String urlString="http://localhost:9090/todos";
			
			HttpURLConnection conn=(HttpURLConnection)new URL(urlString).openConnection();
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			
			OutputStream str=conn.getOutputStream();
			
			PrintWriter pr=new PrintWriter(new OutputStreamWriter(str));
			String data="id=kim&pw=1111";
			pr.println(data);
			pr.flush();
			
			InputStream input=conn.getInputStream();
			BufferedReader bur=new BufferedReader(new InputStreamReader(input));
			bur.readLine();
			
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
