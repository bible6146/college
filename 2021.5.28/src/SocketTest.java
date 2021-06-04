import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketTest {

	public static void main(String[] args) {
		try {
			Socket soket=new Socket("time-c.nist.gov",13);
			InputStream stream=soket.getInputStream();
			BufferedReader read=new BufferedReader(new InputStreamReader(stream));
			String line=null;
			while((line=read.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
