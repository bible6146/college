
import java.net.*;
import java.io.*;

public class UrlPostTest {

	public static void main(String[] args) {
		try {
			String site="https://www.google.com/search?q=java";
			URL url=new URL(site);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
//			URLConnection con2=url.openConnection();//�̰Ŵ� ������ �ڵ�� ������Ƽ ����
			
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			
			int code=con.getResponseCode();
			System.out.println(code);
			
			InputStream sp=con.getInputStream();
			
			InputStreamReader StrinmReader=new InputStreamReader(sp,"UTF-8");
			
			BufferedReader reader=new BufferedReader(StrinmReader);
			
			String line=null;
			//����� �������µ� �������� ���� �˾Ƽ� ������
			while((line=reader.readLine())!=null) {
				System.out.println(line);
				
			}
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
