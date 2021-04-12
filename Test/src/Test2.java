import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int a,b=10000;
			int[] sum=new int[5];
			System.out.println("다섯자리 정수를 입력하시오");
			a=sc.nextInt();
			for(int i=0;i<5;i++) {
				sum[i]=a/b;
				a=a-sum[i]*b;
				b/=10;
			}
			a=0;
			for(int i=0;i<5;i++){
				a+=sum[i];
				System.out.print(sum[i]+" + ");
				if(i==4)System.out.println(sum[i]+"="+a);
			}
			System.out.println("계속 하시려면 아무키나 누르세요");
			sc.nextLine();
			sc.nextLine();
		}
	}

}
