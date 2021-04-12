import java.util.*;
public class Text11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ch=new ArrayList<Integer>();
		int a=sc.nextInt();
		int max=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				ch.add(i);
				max+=i;
			}
		}
		for(int i=0;i<ch.size();i++) {
			System.out.print(ch.get(i));
		}
		System.out.print(max);
	}

}
