import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class DateServer {
	//�̱� ������� �ϳ��� �ۿ� ������
	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(9100)){
			while(true) {
				System.out.println("Ŭ���̾�Ʈ ��û�� ��ٸ�");
				Socket socket=server.accept();//���⼭ ��������
				System.out.println("Ŭ���̾�Ʈ ����"+socket.getRemoteSocketAddress());
				
				OutputStream stream=socket.getOutputStream();
				
				PrintWriter wir=new PrintWriter(stream,true);
				wir.println(Calendar.getInstance().getTime());
				
				Thread.sleep(10000);
				
				socket.close();
				System.out.println("���� ����");
				
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
			
		

	}

}
