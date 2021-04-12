
public class Test5and2 {

	public static void main(String[] args) {
		for(int i=1;i<=26;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j));
			}
			System.out.println();
		}
		for(int i=25;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j));
			}
			System.out.println();
			
		}
	}

}
