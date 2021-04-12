import java.util.*;
public class ikik {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ch=new int[2];
		System.out.print("몆줄출력?");
		int a=sc.nextInt();
		int[][] go=new int[a][2];
		
		for(int i=0;i<go.length;i++) {
			System.out.println("좌표입력하세요");
			go[i][0]=sc.nextInt();
			go[i][1]=sc.nextInt();
		}
		for(int i=0;i<go.length;i++ ) {
			for(int j=0;j<go.length-1;j++) {
				if(go[i][0]<go[j][0]) {
					ch=go[i];
					go[i]=go[j];
					go[j]=ch;
					
				}
				if(go[i][0]==go[j][0]) {
					if(go[i][1]<go[j][1]) {
						ch=go[i];
						go[i]=go[j];
						go[j]=ch;
						
					}
				}
			}
		}
			
		for(int i=0;i<go.length;i++) {
			System.out.print("["+go[i][0]+","+go[i][1]+"]");
		}
	}
	

}
