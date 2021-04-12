import java.util.Scanner;
public class TestNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		boolean last;
		System.out.println("주민등록번호 입력하세요");
		String num=sc.next();
						//마지막 자리는 계산안함으로 변수크기-1 해준다
		for(int i=0;i<num.length()-1;i++) {
			int check=Character.getNumericValue(num.charAt(i));//메소드

			if(i<8)check=check*(i+2);
			else check=check*(i-6);
			sum+=check;
		}
		System.out.println(sum);
		System.out.println((11-(sum%11))%10);
	
		last=((11-(sum%11))%10)==Character.getNumericValue(num.charAt(12));//수식에 대입한 값이랑 마지막 값이 맞는지 비교한다.
		
		if(last) {
			System.out.println("유효한 주민 번호 입니다.");
		}
		else System.out.println("잘못된 주민번호 입니다.");

	}

}
