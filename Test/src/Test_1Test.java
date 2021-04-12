import java.util.*;
public class Test_1Test {

	//문제 1번!!!!!!!!!!1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n;
//		do {
//			System.out.println("입력값");
//			n=sc.nextInt();
//			if(n<1) {
//				System.out.println("1이상 양수를 입력하세요");
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
	//문제 2번!!!!!!!!
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("1이상 N까지의 정수 중, 5또는 3의 배수를출력\nN갑을 입력하세요");
//		
//		int n;
//		do {
//			n=sc.nextInt();
//			if(n<=0) {
//				System.out.println("1이상 양수를 입력하세요");
//			}
//		}while(n<=0);
//		for(int i=1;i<=n;i++) {
//			if(i%3==0) {
//				System.out.printf("3의배수 :%d",i);
//				if(i<n||i%5==0)System.out.println();
//			} 
//			if(i%5==0) {
//				System.out.printf("5의배수 :%d",i);
//				if(i<n)System.out.println();
//			}
//		}
//		
//	}

		//문제 3번!!!!!!!!!!!1
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		int[] sum=new int[3];
		while(true) {
			int ai=ra.nextInt(3)+1;
			System.out.println("가위(1), 바위(2), 보(3)를 입력 하세요");
			int my=sc.nextInt();
			if(my<=0||my>3) {
				System.out.println("1, 2, 3 세 가지 중 하나를 입력하세요!");
				my=sc.nextInt();
			}
			result(my,ai,sum);
			
			System.out.println("계속 하시겠습니까? (예 :1, 아니오2)");
			if(sc.nextInt()==2)break;
			
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	public static void result(int my,int ai,int[] sum) {
		if(my==ai) {
			sum[0]++;
			System.out.print("결과 : 무");
		}
		else if((my==1&&ai==3)||(my==2&&ai==1)||(my==3&&ai==2)) {
			sum[1]++;
			System.out.print("결과 : 승");
		}
		else {
			sum[2]++;
			System.out.print("결과 : 패");
		}
		print(my,ai,sum);
	}
	public static void print(int my,int ai,int[] sum) {
		System.out.printf("[ 컴퓨터 : %s, 사용자 :%s]",sub(ai),sub(my));
		System.out.printf("\n%d승 %d패 %d무\n",sum[1],sum[2],sum[0]);
	}
	public static String sub(int num) {
			if(num==1) return "가위";
			if(num==2) return "바위";
			if(num==3) return "보";
			else  return null;
	}
	
}
