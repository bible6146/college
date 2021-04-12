import java.util.*;
public class Test {

	public static void main(String[] args) {//do를먼저쓰므로써 무조건 혹시 한번쓰고 못쓰는 경우를 대비해서
		Scanner sc=new Scanner(System.in);//조건을 어디서 보냐차이.
		int count=1;
	do {
			int num=sc.nextInt();//되도록이면 한줄로 합치기.
			String value=count+"번째 입력 값은= "+num+"\n";
			if(num<=0) {
				System.out.println("0보다큰수 입력하세요");
				continue;
			}
			if(num==20000)break;
				
			if(num%2==0) {
				value+="   짝수입니다.\n";
			}
			else {//바로위에 있는 if만본다 !!!
				value+="   홀수입니다.\n";
			}
			if(num%3==0) {
				value+="   3의배수입니다.\n"; 
			}
			if(num%7==0) {
				value+="   7의배수입니다.\n";
			}
			System.out.print(value);
			count++;
		}while(true);
		System.out.println("시스템이 종료되었습니다.");
	}

}
