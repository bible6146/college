import java.util.*;
public class Test {

	public static void main(String[] args) {//do���������Ƿν� ������ Ȥ�� �ѹ����� ������ ��츦 ����ؼ�
		Scanner sc=new Scanner(System.in);//������ ��� ��������.
		int count=1;
	do {
			int num=sc.nextInt();//�ǵ����̸� ���ٷ� ��ġ��.
			String value=count+"��° �Է� ����= "+num+"\n";
			if(num<=0) {
				System.out.println("0����ū�� �Է��ϼ���");
				continue;
			}
			if(num==20000)break;
				
			if(num%2==0) {
				value+="   ¦���Դϴ�.\n";
			}
			else {//�ٷ����� �ִ� if������ !!!
				value+="   Ȧ���Դϴ�.\n";
			}
			if(num%3==0) {
				value+="   3�ǹ���Դϴ�.\n"; 
			}
			if(num%7==0) {
				value+="   7�ǹ���Դϴ�.\n";
			}
			System.out.print(value);
			count++;
		}while(true);
		System.out.println("�ý����� ����Ǿ����ϴ�.");
	}

}
