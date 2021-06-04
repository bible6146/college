import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NodeTest {

	public static void main(String[] args) {
		try {
			//http : // localhost : 8080 /? year = 2017 & month = July
			URL url=new URL("http://localhost:8080");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//			System.out.println(conn.getResponseCode());
			conn.setRequestMethod("GET");
			conn.setRequestProperty("year", "2021");
			conn.setRequestProperty("month", "12");
			conn.setDoInput(true);
			
			InputStream instr=conn.getInputStream();
			BufferedReader bustr=new BufferedReader(new InputStreamReader(instr));
			
			String str;
			while((str=bustr.readLine())!=null) {
				System.out.println(str);
			}
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
