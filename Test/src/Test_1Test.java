import java.util.*;
public class Test_1Test {

	//���� 1��!!!!!!!!!!1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n;
//		do {
//			System.out.println("�Է°�");
//			n=sc.nextInt();
//			if(n<1) {
//				System.out.println("1�̻� ����� �Է��ϼ���");
//				continue;
//			}
//		}while(n<0);
//
//		for(int i=0;n>0;i++) {
//			char a=(char)((i%26)+65);
//			if(a=='C'||a=='H'||a=='K'||a=='P');
//			else {
//				System.out.print(a);
//				n--;
//				if(n>0) {
//					System.out.print(",");
//				}
//			}
//		}
//
//	}
	//���� 2��!!!!!!!!
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("1�̻� N������ ���� ��, 5�Ǵ� 3�� ��������\nN���� �Է��ϼ���");
//		
//		int n;
//		do {
//			n=sc.nextInt();
//			if(n<=0) {
//				System.out.println("1�̻� ����� �Է��ϼ���");
//			}
//		}while(n<=0);
//		for(int i=1;i<=n;i++) {
//			if(i%3==0) {
//				System.out.printf("3�ǹ�� :%d",i);
//				if(i<n||i%5==0)System.out.println();
//			} 
//			if(i%5==0) {
//				System.out.printf("5�ǹ�� :%d",i);
//				if(i<n)System.out.println();
//			}
//		}
//		
//	}

		//���� 3��!!!!!!!!!!!1
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		int[] sum=new int[3];
		while(true) {
			int ai=ra.nextInt(3)+1;
			System.out.println("����(1), ����(2), ��(3)�� �Է� �ϼ���");
			int my=sc.nextInt();
			if(my<=0||my>3) {
				System.out.println("1, 2, 3 �� ���� �� �ϳ��� �Է��ϼ���!");
				my=sc.nextInt();
			}
			result(my,ai,sum);
			
			System.out.println("��� �Ͻðڽ��ϱ�? (�� :1, �ƴϿ�2)");
			if(sc.nextInt()==2)break;
			
		}
		System.out.println("�̿����ּż� �����մϴ�.");
	}
	public static void result(int my,int ai,int[] sum) {
		if(my==ai) {
			sum[0]++;
			System.out.print("��� : ��");
		}
		else if((my==1&&ai==3)||(my==2&&ai==1)||(my==3&&ai==2)) {
			sum[1]++;
			System.out.print("��� : ��");
		}
		else {
			sum[2]++;
			System.out.print("��� : ��");
		}
		print(my,ai,sum);
	}
	public static void print(int my,int ai,int[] sum) {
		System.out.printf("[ ��ǻ�� : %s, ����� :%s]",sub(ai),sub(my));
		System.out.printf("\n%d�� %d�� %d��\n",sum[1],sum[2],sum[0]);
	}
	public static String sub(int num) {
			if(num==1) return "����";
			if(num==2) return "����";
			if(num==3) return "��";
			else  return null;
	}
	
}
