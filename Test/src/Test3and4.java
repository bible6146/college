
public class Test3and4 {//�ٽ��ϱ�

	public static void main(String[] args) {
		for(int i=0;i<11;i++) {
			if(i<6) {
				for(int j=i;j<5;j++) {//����
					System.out.print(" ");
				}
				for(int j=10-i*2;j<11;j++) {//�����
					System.out.print("*");
				}
			}
			else {
				for(int j=11;j<6+i;j++) {//����
					System.out.print(" ");
				}
				for(int j=21-i*2;j>0;j--) {//�����
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
