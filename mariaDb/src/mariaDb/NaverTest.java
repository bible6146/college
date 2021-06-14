package mariaDb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class NaverTest {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.naver.com");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//			conn.setRequestMethod("GET");
			
			System.out.println(conn.getResponseCode());
			BufferedReader bu=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String ss;
			while((ss=bu.readLine())!=null) {
				System.out.println(ss);
			}
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
