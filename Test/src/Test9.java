import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start,last;
		while (true) {
			System.out.println("���۰��� �Է��ϼ���");
			start = sc.nextInt();
			if (start > 53 || start <= 0) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}
			System.out.println("�� ���� �Է��ϼ���");
			last = sc.nextInt();
			if (start + last > 53) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}
			break;
		}
		System.out.println("��� ��:");
		for(int i=start;i<start+last;i++) {
			if(i+64<91)System.out.print((char)(i+64));
			else System.out.print((char)(i+64+6));
		}
	}
}