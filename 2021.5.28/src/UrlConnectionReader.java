
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
		//����� �������µ� �������� ���� �˾Ƽ� ������
		while((line=reader.readLine())!=null) {
			System.out.println(line);
			
		}
	}
	catch(Exception e) {
		
	}
	}
}
