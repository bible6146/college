import java.util.*;
public class ff54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String go,sum;
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ���");
			go=sc.next();
			sum=go.substring(0,3);
			if(go.equals("stop"))break;
			if(sum.equals("www")) {
				System.out.println(go+"�� www�ν����մϴ�");
			}
			else System.out.println(go+"�� www�� �������� �ʽ��ϴ�");
		}
		System.out.println("�ý�������");
		

	}

}
