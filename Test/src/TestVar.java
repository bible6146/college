import java.util.*;
public class TestVar {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� �ӵ��� �Է��ϼ���");
		double speed=sc.nextInt();
		System.out.println("����Ÿ� �Է��ϼ���");
		double road=sc.nextInt();
		double sum=(int)((road/speed)*10000);
		System.out.println("����ð�: "+sum/10000);
	}*/

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.printf("@@----------------------@@\n 3x^5+7x+11 "
//				+ "���׽� ������α׷�\n@@----------------------@@"
//				+ "\nx���� �Է��Ͻÿ�");
//		int x=sc.nextInt();
//		//int sum=3(x*x*x*x*x)+7*x+11;
//		int sum=(int)Math.pow(x, 5)*3+7*x+11;
//		System.out.println(sum);
//	}
	
	public static void main(String[] agrs) {//\n \t ������ ������� ��밡�� 
		Scanner sc=new Scanner(System.in);
		int money,tax;
		System.out.print("��ǰ�Ѿ�:");
		int product=sc.nextInt();
		while(true) {
			System.out.print("\n������:");
			money=sc.nextInt();
			tax=product/10;
			if(product+tax>money) {
				System.out.println("\n���� ���� ���� �մϴ� �ٽ� �Է��ϼ���");
				continue;
			}
			else break;
		}
		int sum=money-(product+tax);
		System.out.print("\n�ΰ���:");
		System.out.printf("%d\n",tax);
		System.out.println("�Ž����� "+sum);
	}
	
	
//	public static void main(String[] agrs) {
//		Scanner sc=new Scanner(System.in);
//		//���� ǥ��� ����� final ���� �Ӱ� ������, ������ �ʴ°� �ٸ�����ڰ� ������ϰ�
//		//�� int ���� e������ �ȵǴ���
//		final int road=(int)15e7;
//		final int speed=(int)3e5;//
//		int sum=road/speed;
//		int count=0;
//		while(true) {
//			if(sum%10==0) {
//				count++;
//				sum=sum/10;
//			}
//			else break;
//		}
//		
//		System.out.println(sum+"e"+count);//5e2
//		
//	}
	
	
	
	
	
	
}
