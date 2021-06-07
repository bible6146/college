import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class DateServer {
	//싱글 스레드라서 하나씩 밖에 못받음
	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(9100)){
			while(true) {
				System.out.println("클라이언트 요청을 기다림");
				Socket socket=server.accept();//여기서 멈춰있음
				System.out.println("클라이언트 접속"+socket.getRemoteSocketAddress());
				
				OutputStream stream=socket.getOutputStream();
				
				PrintWriter wir=new PrintWriter(stream,true);
				wir.println(Calendar.getInstance().getTime());
				
				Thread.sleep(10000);
				
				socket.close();
				System.out.println("연결 종료");
				
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
			
		

	}

}
