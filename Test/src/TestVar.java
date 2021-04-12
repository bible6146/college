import java.util.*;
public class TestVar {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("평균 속도를 입력하세요");
		double speed=sc.nextInt();
		System.out.println("주행거리 입력하세요");
		double road=sc.nextInt();
		double sum=(int)((road/speed)*10000);
		System.out.println("주행시간: "+sum/10000);
	}*/

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.printf("@@----------------------@@\n 3x^5+7x+11 "
//				+ "다항식 계산프로그램\n@@----------------------@@"
//				+ "\nx값을 입력하시오");
//		int x=sc.nextInt();
//		//int sum=3(x*x*x*x*x)+7*x+11;
//		int sum=(int)Math.pow(x, 5)*3+7*x+11;
//		System.out.println(sum);
//	}
	
	public static void main(String[] agrs) {//\n \t 은형식 상관없이 사용가능 
		Scanner sc=new Scanner(System.in);
		int money,tax;
		System.out.print("상품총액:");
		int product=sc.nextInt();
		while(true) {
			System.out.print("\n받은돈:");
			money=sc.nextInt();
			tax=product/10;
			if(product+tax>money) {
				System.out.println("\n받은 돈이 부족 합니다 다시 입력하세요");
				continue;
			}
			else break;
		}
		int sum=money-(product+tax);
		System.out.print("\n부가세:");
		System.out.printf("%d\n",tax);
		System.out.println("거스름돈 "+sum);
	}
	
	
//	public static void main(String[] agrs) {
//		Scanner sc=new Scanner(System.in);
//		//지수 표기법 물어보기 final 쓰면 머가 좋은지, 변하지 않는값 다른사용자가 변경못하게
//		//왜 int 에는 e제곱이 안되는지
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
