import java.util.*;
public class Test11 {
	static int out=0;

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		boolean gameover=false;
		int count=1;//�ݺ�Ƚ��
		int[] ai=new int[3];//���Ǽ���
		int[] my=new int[3];//���� ���ϴ� ����
		int[] point=new int[5];//�� �ƿ� ��Ʈ����ũ
		while(true) {
			for(int i=0;i<3;i++) {
			ai[i]=(int)(Math.random()*10)+1;//0.0�ʰ� 1.0�̸��� �׷��� //0~���� ������
		}							//�׷��� 1�� �ȴ����ָ� 10�� ���ص� 1�� �ڸ��� �ȳ��´� 
			if(check(ai))break;//3,0,0 �϶��� �����ϼ���//���Ǽ��� �ߺ�üũ
		}

		while(true) {
			while(true) {
				System.out.printf("\n�õ�Ƚ��:%d\n���� 3���� �Է��ϼ���\n",count);
				String input=sc.nextLine()+" ";
				for(int i=0;i<input.length();i+=2) {
				my[i/2]=Integer.parseInt(input.substring(i,i+1));
				}
				//System.out.println(my[0]+" "+my[1]+" "+my[2] );
				if(check(my)) {//���� ������ ���� �ߺ�üũ
					break;
					}
				else System.out.println("�ߺ��Դϴ� �ٽ� �Է��ϼ���");
			}
			for(int i=0;i<ai.length;i++) {//ai.length!!
				for(int j=0;j<my.length;j++) {
					if(i==j && ai[i]==my[j]) {
						point[0]++;
						my[j]=0;
						break;
					}
					else if(i!=j&&ai[i]==my[j]) {
						point[1]++;break;
					}
				}
				//System.out.println(point[0]+" "+point[1]+" "+point[2]);
			}
			if(point[0]==0&&point[1]==0) {
				point[2]++;
				System.out.printf("out: �ƿ� %d ��\n",point[2]);
			}
			
		
			if(point[0]!=0) {
					System.out.printf("%d strike\n ",point[0]);
				}
			if(point[1]!=0) {
					System.out.printf("%d ball\n",point[1]);
				}
			
			count++;
			if(point[0]>=3||count==6||point[2]==3)break;
			point[0]=0;
			point[1]=0;
		}
		if(point[0]>=3) {
			System.out.println("�̰���ϴ�");
		}
		else System.out.println("�Ʊ�� ���׿�  ���׿� ");
		System.out.println("������"+ai[0]+" "+ai[1]+" "+ai[2] );//for������ �س���

	}
public static boolean check(int a[]) {//�ߺ� üũ �޼ҵ�
	if(a[0]==a[1]||a[0]==a[2]||a[1]==a[2])
		return false;
	else return true;
}

}
