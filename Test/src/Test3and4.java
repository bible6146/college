
public class Test3and4 {//´Ù½ÃÇÏ±â

	public static void main(String[] args) {
		for(int i=0;i<11;i++) {
			if(i<6) {
				for(int j=i;j<5;j++) {//¶ç¿ì±â
					System.out.print(" ");
				}
				for(int j=10-i*2;j<11;j++) {//º°Âï±â
					System.out.print("*");
				}
			}
			else {
				for(int j=11;j<6+i;j++) {//¶ç¿ì±â
					System.out.print(" ");
				}
				for(int j=21-i*2;j>0;j--) {//º°Âï±â
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
