import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
		System.out.println("정수5개 입력하시오");
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
			if(num[i]<=0) {//만약 0보다 작으면 한번더반복
				System.out.println("Error mag");
				i--;
			}
		}
		System.out.print("inserted values:");
		for(int i=0;i<5;i++) {
			System.out.print(num[i]);
			sum+=num[i];
			if(i!=4)System.out.print(",");
		}
		
		Arrays.sort(num);
		if(sum%2!=0)sum=sum+1;
		System.out.printf("\nmaximum value:%d\n",num[num.length-1]);
		System.out.printf("maximum value:%d\n",num[0]);
		System.out.printf("medi:%d\n",sum/num.length);
	}

}
