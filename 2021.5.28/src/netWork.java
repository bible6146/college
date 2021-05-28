import java.net.InetAddress;

public class netWork {

	public static void main(String[] args) {
		String name="www.naver.com";
		String my="localhost";
		try {
			InetAddress address=InetAddress.getByName(my);
			System.out.println(address.getHostAddress());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
