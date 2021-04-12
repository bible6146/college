import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start,last;
		while (true) {
			System.out.println("시작값을 입력하세요");
			start = sc.nextInt();
			if (start > 53 || start <= 0) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			System.out.println("끝 값을 입력하세요");
			last = sc.nextInt();
			if (start + last > 53) {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			break;
		}
		System.out.println("결과 값:");
		for(int i=start;i<start+last;i++) {
			if(i+64<91)System.out.print((char)(i+64));
			else System.out.print((char)(i+64+6));
		}
	}
}