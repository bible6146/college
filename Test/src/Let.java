import java.util.*;
public class Let {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		String h;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자입력");
		String sum=sc.next()+"  ";
		int[] haha=new int[sum.length()];
		
		for(int i=0;i<sum.length();i++) {
			if(
			sum.substring(i).equals("+")||sum.substring(i).equals("-")||
			sum.substring(i).equals("*")||sum.substring(i).equals("/"))
			{
				h=sum.substring(i,i+2);
				haha[b]=Integer.parseInt(h);
				b++;
				
			}
		}
		System.out.println(haha[0]);
		for(int i=0;i<haha.length;i++) {
			a+=haha[i];
		}
		System.out.println(a);
	}

}
