import java.util.*;
public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int Max=50;
		int a,value,count=0;
		int[] random = new int[Max];
		int[] check = new int[201];//�� üũ�迭
		
		for(int i=0;i<Max;i++) {
			a=(int)(Math.random()*200+1);
			if(check[a]!=1) {
				random[i]=a;
				check[a]++;
			}
			else i--;
		}
		for(int i=0;i<Max;i++) {
			System.out.printf("\t%d",random[i]);//tab \t ����ϱ�
			if((i+1)%7==0||i==Max-1)System.out.println();
		}
		System.out.println("����� �˻� �� ������ �Է��ϼ���(1�̻� ����)");
		value=sc.nextInt();
		System.out.println(value+"��� ��");
		for(int i=0;i<Max;i++) {
			if(random[i]%value==0) {
				System.out.printf("\t%d",random[i]);
				count++;
				if((count)%5==0)System.out.println();
			}
			
		}
		//System.out.println();
		System.out.printf("\n%d ��� �� ���� : %d",value,count);
	}

}
