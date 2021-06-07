package MyThread;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class MutilDateServer {

	public static void main(String args[]) {
		
		try(ServerSocket server=new ServerSocket(9100)){
			while(true) {
				System.out.println("클라이언트 요청을 기다림");
				Socket socket=server.accept();//여기서 멈춰있음
				System.out.println("클라이언트 접속"+socket.getRemoteSocketAddress());
				
				
				NetSocket2 thread =new NetSocket2(socket);
				thread.start();
				
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		
	}

}
class NetSocket2 extends Thread{
	Socket socket;
	
	public NetSocket2(Socket socket) {
		this.socket=socket;
	}
	
	public void run() {
		try {
			OutputStream stream=socket.getOutputStream();
			
			PrintWriter wir=new PrintWriter(stream,true);
			wir.println("hellow");
			
			Thread.sleep(5000);
//			OutputStream stream2=socket.getOutputStream();
//			PrintWriter wir2=new PrintWriter(stream2,true);
			wir.println("Bye"); //클라이언트도 있어야 한다
			System.out.println("소캣 종료");
			socket.close();
			
		}catch(Exception e) {
			
		}
	}
}

