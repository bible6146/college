import java.io.IOException;

public class ExcePtionTest1 {
	
	public static void main(String args[]) {
		System.out.println(readString());
	}
	public static String readString() {
		byte[] buf=new byte[1];
		try{
			System.out.println("���ڿ��� �Է��ϼ���");
			System.in.read(buf);
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("����");
		}
		return new String(buf);
	}
}
