import java.util.*;
public class Test6 {//�迭 ũ������ ����

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int[] check=new int[10];//���⼭ check[0]°�� �Ⱦ���
		System.out.println("����10�� �Է��ϼ���");
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
			if(num[i]<=0||num[i]>=10) {
				System.out.println("Error Msg");
				i--;//�������� ���� �ƴϸ� ���������� �̷�����
			}
		}
		System.out.print("�Է°�");
		for(int i=0;i<10;i++) {
			System.out.printf("%d,",num[i]);
			check[num[i]]++;//üũ���� �ε����� üũ�ϴ°Ŷ� �̷�����
			
		}
		System.out.println();
		System.out.println("�Էº�");
		int a=1;
		for(int i=0;i<10;i++) {
			if(check[i]!=0) {
				System.out.printf("%d)%d : %dȸ\n",a,(i),check[i]);
				a++;
			}
		}
		   String[][] histogram = {
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {" 8", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {" 6", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {" 4", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {" 2", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {"  ", "\t|", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t ", "\t "},
		            {" -", "\t-", "\t-", "\t-", "\t-", "\t-", "\t-", "\t-", "\t-", "\t-", "\t-"},
		            {"  ", "\t|", "\t1", "\t2", "\t3", "\t4", "\t5", "\t6", "\t7", "\t8", "\t9"}
		      };
		   
		   	for(int i=0;i<check.length;i++) {
		   		for(int j=0,k=9;j<check[i];j++,k--) {
		   			histogram[k][i+1]="\t$";
		   		}
		   			
		   	}
		   	
		   
		   	for(int i=0;i<histogram.length;i++) {
		   		for(int j=0;j<histogram[i].length;j++) {
		   			System.out.print(histogram[i][j]);
		   		}
		   		System.out.println();
		   	}
		
		
		
		
		
		
//a=1;
//		for(int i=0;i<12;i++) {
//			for(int j=0;j<24;j++) {
//				if(j==2)System.out.print("|");
//				else if(i!=0 && i%2==0 && j==0 && i<10) {
//					System.out.print(10-i);
//				}
//				else if(i==10 && j%2==0) {
//					System.out.print("-");
//				}
//				
//				else if(i==11 && j>3 && j%2==0 && j<21) {
//					System.out.print(a);
//					a++;
//				}
//				else System.out.print(" ");
//				
//			}
//			System.out.println();
//		}
	}

}
