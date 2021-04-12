package winter;
import java.util.Scanner;
public class proc {
	Scanner sc=new Scanner(System.in);
	
	
	public void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println("점수를 입력하세요");
			a[i]=sc.nextInt();
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
