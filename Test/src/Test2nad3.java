import java.util.Scanner;
public class Test2nad3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String result;
			System.out.print("성적을 입력하세요");
			int input=sc.nextInt();
			if(input>=90)result="A";
			else if(input>=80)result="B";
			else if(input>=70)result="C";
			else if(input>=60)result="D";
			else result="F";
			if(result!="F"&&input==100||input%10>=5)result+="+";
			System.out.println("축하합니다. "+result+"입니다.");
			System.out.println("계속하시려면 아무키나 누르십시오...");
			sc.nextLine();
			
		}
	}

}
