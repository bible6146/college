import java.util.Scanner;
public class TestNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		boolean last;
		System.out.println("�ֹε�Ϲ�ȣ �Է��ϼ���");
		String num=sc.next();
						//������ �ڸ��� ���������� ����ũ��-1 ���ش�
		for(int i=0;i<num.length()-1;i++) {
			int check=Character.getNumericValue(num.charAt(i));//�޼ҵ�

			if(i<8)check=check*(i+2);
			else check=check*(i-6);
			sum+=check;
		}
		System.out.println(sum);
		System.out.println((11-(sum%11))%10);
	
		last=((11-(sum%11))%10)==Character.getNumericValue(num.charAt(12));//���Ŀ� ������ ���̶� ������ ���� �´��� ���Ѵ�.
		
		if(last) {
			System.out.println("��ȿ�� �ֹ� ��ȣ �Դϴ�.");
		}
		else System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");

	}

}
