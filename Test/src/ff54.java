import java.util.*;
public class ff54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String go,sum;
		while(true) {
			System.out.println("문자열을 입력하세요");
			go=sc.next();
			sum=go.substring(0,3);
			if(go.equals("stop"))break;
			if(sum.equals("www")) {
				System.out.println(go+"는 www로시작합니다");
			}
			else System.out.println(go+"는 www로 시작하지 않습니다");
		}
		System.out.println("시스템종료");
		

	}

}
