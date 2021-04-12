import java.util.*;
public class Test6_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] num=new int[10][2];
		int[] value=new int[10];
		System.out.println("숫자를 입력하세요");
		
		for(int i=0;i<10;i++) {
			value[i]=sc.nextInt();
			if(value[i]>9||value[i]<=0) {
				System.out.println("Error Msg");
				i--;
			}
			else num[value[i]][1]++;
		}
		System.out.print("입력값: ");
		for(int i=0;i<10;i++) {
			System.out.print(value[i]+",");
		}
		System.out.println("입력빈도");
		for(int i=0;i<10;i++) {
			if(num[i][1]!=0) {
				System.out.printf("%d : %d\n",i,num[i][1]);
			}
		}
	}	

}
