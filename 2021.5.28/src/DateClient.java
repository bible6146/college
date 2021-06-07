import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class DateClient {

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
