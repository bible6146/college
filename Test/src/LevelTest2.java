import java.util.*;
public class LevelTest2 {//�����׽�Ʈ 2��° ���� �ҿ�ð� 20��

	public static void main(String[] args) {
		Random ra=new Random();
		Scanner sc=new Scanner(System.in);
		while(true) {
			int num,sum=0;
			System.out.println("N���� �����ÿ�");
			int n=sc.nextInt();//100��
			
			for(int i=0;i<n;i++) {
				//*************************0.0~1.0 Math.random �Ẹ��****************************
				//num=ra.nextInt(201)-100;//random���� Ʃ��
				num=(int)(Math.random()*200)-100;
				if(num==6)sum++;//�p�����Դ��� üũ
			}
			if(sum==0) {
				while(true) {
					n++;//n�� ���⼭ count����~
					num=ra.nextInt(201)-100;
					if(num==6) {
						sum++;//����ѹ��� ���͵� �Ǽ� sum=1�Ҷ�ٰ� ���̰��� 
						break;
					}
				}
			}
			System.out.printf("%d���õ� 6�� ����Ƚ��:%d\n",n,sum);
			System.out.println("Ȯ���� "+sum/(double)n);//�ٽ��ѹ� ������**********************
		}
	}

}
