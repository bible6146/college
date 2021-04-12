import java.util.*;
public class Test4 {//소요시간 30분

	public static void main(String[] args) {//같은조건 if문을 하나로 합치기
		Scanner sc=new Scanner(System.in);
		int line,copy;
		System.out.println("역피라미드의 높이를 입력하세요");
		line=sc.nextInt();//이놈이 카운터 역할을함
		copy=line;//띄우기할때 쓰이는변수
		while(true) {
			if(0<line) {
				for(int i=line;i<copy;i++) {//띄우기 할때 copy는 고정 line값은 동적인값
					System.out.print(" ");
				}
				for(int i=0;i<(line*2)-1;i++) {//크기가 무쟈게커도 다시A가나올수있게 튜닝
					System.out.printf("%c",(char)(65+(i%26)));
				}
				line--;
				System.out.println();
			}
			if(0<line) {
				for(int i=line;i<copy;i++) {
					System.out.print(" ");
				}
				for(int i=1;i<=(line*2)-1;i++) {//10을넘어가도 1의자리숫자가 나올수있게 튜닝
					System.out.printf("%d",i%10);
				}
				line--;
				System.out.println();
			}
			if(0<line) {
				for(int i=line;i<copy;i++) {
					System.out.print(" ");
				}
				for(int i=0;i<(line*2)-1;i++) {
					System.out.printf("%c",(char)(97+(i%26)));
				}
				line--;
				System.out.println();
			}
			if(line==0)break;
			
		}
	}

}
