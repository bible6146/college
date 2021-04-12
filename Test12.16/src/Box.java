import java.util.*;
public class Box {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("두수입력");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0&&b%i==0) {
				max=i;
			}
		}
		System.out.println(max);
}
}