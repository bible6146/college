import java.util.Scanner;
public class levelTest {//�����׽�Ʈ 1��° �ҿ�ð�20��

	public static void main(String[] args) {//ctrl+i ����
		int sum = 0, check = 100;//100���� ������ �����ϱ� ������ ū���ڸ� �־��
		Scanner sc=new Scanner(System.in);
		while(true) {
			sum=0;
			System.out.println("���ڸ� �Է��ϼ���");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(i%7==0)sum+=i;
				if(sum>100&&i<check)check=i;//ó�����ԵǴ� ���� ���� �۱� ������
			}								//�ѹ������� �����ǰ� ������ �ɾ��
			if(sum<100) {
				System.out.printf("0���� %d���� ��� ����:%d\n",n,sum);
				continue;//100�̸��϶� �ؿ� ������� ������� �ʱ� ���� �ۼ�
			}
			System.out.printf("0���� %d���� ��� ����:%d\n",n,sum);
			System.out.printf("������ ���� ó������ 100�� �ѱ�� 7�� ����� %d\n",check);
		}
	}

}
