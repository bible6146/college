import java.util.*;
public class Test4 {//�ҿ�ð� 30��

	public static void main(String[] args) {//�������� if���� �ϳ��� ��ġ��
		Scanner sc=new Scanner(System.in);
		int line,copy;
		System.out.println("���Ƕ�̵��� ���̸� �Է��ϼ���");
		line=sc.nextInt();//�̳��� ī���� ��������
		copy=line;//�����Ҷ� ���̴º���
		while(true) {
			if(0<line) {
				for(int i=line;i<copy;i++) {//���� �Ҷ� copy�� ���� line���� �����ΰ�
					System.out.print(" ");
				}
				for(int i=0;i<(line*2)-1;i++) {//ũ�Ⱑ �����Ŀ�� �ٽ�A�����ü��ְ� Ʃ��
					System.out.printf("%c",(char)(65+(i%26)));
				}
				line--;
				System.out.println();
			}
			if(0<line) {
				for(int i=line;i<copy;i++) {
					System.out.print(" ");
				}
				for(int i=1;i<=(line*2)-1;i++) {//10���Ѿ�� 1���ڸ����ڰ� ���ü��ְ� Ʃ��
					System.out.printf("%d",i%10);
				}
				line--;
				System.out.println();
			}
			if(0<line) {
				for(int i=line;i<copy;i++) {
					System.out.print(" ");
				}
				for(int i=0;i<(line*2)-1;i++) {
					System.out.printf("%c",(char)(97+(i%26)));
				}
				line--;
				System.out.println();
			}
			if(line==0)break;
			
		}
	}

}
