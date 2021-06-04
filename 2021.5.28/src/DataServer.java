import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class DataServer {

	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(9100)){
			Socket socket=null;
			while(true) {
				System.out.println("클라이언트 요청을 기다림");
				socket=server.accept();//여기서 멈춰있음
				System.out.println("클라이언트 접속"+socket.getRemoteSocketAddress());
				
				OutputStream stream=socket.getOutputStream();
				
				PrintWriter wir=new PrintWriter(stream,true);
				wir.println(Calendar.getInstance().getTime());
			}
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			
		}

	}

}
