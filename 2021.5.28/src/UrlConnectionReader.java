
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionReader {
	
	public static void main(String agrs[]) {
	try {
		
		URL site=new URL("https://www.naver.com");
		
		URLConnection con=site.openConnection();
//		System.out.println(c);
		
		InputStream sp=con.getInputStream();
		
		InputStreamReader StrinmReader=new InputStreamReader(sp);
		
		BufferedReader reader=new BufferedReader(StrinmReader);
		
		String line=null;
		//덩어리로 가져오는데 다읽으면 지가 알아서 가져옴
		while((line=reader.readLine())!=null) {
			System.out.println(line);
			
		}
	}
	catch(Exception e) {
		
	}
	}
}
