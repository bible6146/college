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
				System.out.println("Ŭ���̾�Ʈ ��û�� ��ٸ�");
				Socket socket=server.accept();//���⼭ ��������
				System.out.println("Ŭ���̾�Ʈ ����"+socket.getRemoteSocketAddress());
				
				
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
			wir.println("Bye"); //Ŭ���̾�Ʈ�� �־�� �Ѵ�
			System.out.println("��Ĺ ����");
			socket.close();
			
		}catch(Exception e) {
			
		}
	}
}

