package winter;

import java.util.Random;

public class haha {

	public static void main(String[] args) {
		Random r1=new Random();
		int[] random=new  int[9];
		int[] randomcopy=new int[9];
		for(int i=0;i<9;i++) {
			int a=r1.nextInt(9);
			if(randomcopy[a]==0) {
				random[i]=a+1;
				randomcopy[a]=1;
			}
			else i--;
		}
		for(int i=0;i<9;i++) {
			System.out.println(random[i]);
		}
		

	}

}
