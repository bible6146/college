import java.util.*;
public class Test2and2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int a;
			System.out.println("������ �Է��ϼ��� ����(1) ����(2)");
			a=sc.nextInt();
			if(a<1||a>2) {
				System.out.println("�ùٸ� �����Է��ϼ���");
				continue;
			}
				
			else if(a==1) {
				System.out.println("ü���� �Է��ϼ���");
				a=sc.nextInt();
				if(85<=a)System.out.println("��ü���Դϴ� ��ϼ���");
				else if(50<=a&&a<85)System.out.println("����ü���Դϴ� �����ϼ���");
				else System.out.println("�ｺ�ϼ���");
			}
			else if(a==2) {
				System.out.println("ü���� �Է��ϼ���");
				a=sc.nextInt();
				if(68<=a)System.out.println("��ü���Դϴ� ��ϼ���");
				else if(40<=a&&a<68)System.out.println("����ü���Դϴ� �����ϼ���");
				else System.out.println("�ｺ�ϼ���");
			}
			
			
			System.out.println("��� �Ͻ÷��� �ƹ�Ű�� ��������");
			sc.nextLine();
			sc.nextLine();
			
		}
	}

}
