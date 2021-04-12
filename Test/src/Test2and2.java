import java.util.*;
public class Test2and2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int a;
			System.out.println("성별을 입력하세요 남자(1) 여자(2)");
			a=sc.nextInt();
			if(a<1||a>2) {
				System.out.println("올바른 숫자입력하세요");
				continue;
			}
				
			else if(a==1) {
				System.out.println("체중을 입력하세요");
				a=sc.nextInt();
				if(85<=a)System.out.println("과체중입니다 운동하세요");
				else if(50<=a&&a<85)System.out.println("정상체중입니다 유지하세요");
				else System.out.println("헬스하세요");
			}
			else if(a==2) {
				System.out.println("체중을 입력하세요");
				a=sc.nextInt();
				if(68<=a)System.out.println("과체중입니다 운동하세요");
				else if(40<=a&&a<68)System.out.println("정상체중입니다 유지하세요");
				else System.out.println("헬스하세요");
			}
			
			
			System.out.println("계속 하시려면 아무키나 누르세요");
			sc.nextLine();
			sc.nextLine();
			
		}
	}

}
