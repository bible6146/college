import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=null;
		int[] check=new int[26];
		
		System.out.println("���ڿ� �Է��ϼ��� ^^");
		input=sc.nextLine();
		
		int size=input.length();
		
		char[] charArray=new char[size];
		
		input.getChars(0, size ,charArray, 0);
		int max=0;
		for(int i=0;i<size;i++) {
			System.out.print(charArray[i]);
			if(charArray[i]!=' ') {
				check[((int)charArray[i])-97]++; //a==97 b==98 ���� �޳� �ñ���������
				if(max<((int)charArray[i])-97)// ���� ū�ƽ�Ű �ڵ� �ñ���
					max=((int)charArray[i])-97;
					}
		}// ���� if���� ������ �ƽ�Ű�ڵ�char->int �κ�ȯ�ɶ� ���鰪�� ������ 26 
		                             //�׷��� �������� �ѽð����� ��� index 0 1 2 3 4 5 ....
														//    index A b c d e 
		System.out.println();							//          3     4
		for(int j=0;j<check.length;j++) {//�ƽ�Ű�ڵ�� !
			if(check[j]>0) {
				System.out.print((char)(j+97)+":"+check[j]);
				if(j!=max)System.out.print(",");
			}//��ǥ ����
			
		}

	}

}
