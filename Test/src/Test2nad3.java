import java.util.Scanner;
public class Test2nad3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String result;
			System.out.print("������ �Է��ϼ���");
			int input=sc.nextInt();
			if(input>=90)result="A";
			else if(input>=80)result="B";
			else if(input>=70)result="C";
			else if(input>=60)result="D";
			else result="F";
			if(result!="F"&&input==100||input%10>=5)result+="+";
			System.out.println("�����մϴ�. "+result+"�Դϴ�.");
			System.out.println("����Ͻ÷��� �ƹ�Ű�� �����ʽÿ�...");
			sc.nextLine();
			
		}
	}

}
