import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class DateClient {
	/* cmd 명령어 링크
	 * https://velog.io/@gillog/CMD-%EB%AA%85%EB%A0%B9%EC%96%B4%EB%A1%9C
	 * -%EC%82%AC%EC%9A%A9%EC%A4%91%EC%9D%B8-port-%EC%A2%85%EB%A3%8C%ED%95%98%EA%B8%B0*/

	public static void main(String agrs[]) {
		try(Socket socket=new Socket("localhost",9100)){
			InputStream istr=socket.getInputStream();
			InputStreamReader reder=new InputStreamReader(istr);
			BufferedReader bufReader=new BufferedReader(reder);
			
			String line=bufReader.readLine();
			System.out.println(line);
			String line2=bufReader.readLine();
			System.out.println(line2);
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
