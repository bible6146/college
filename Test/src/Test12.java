import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		String input=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ���");
		
		input=sc.nextLine();
		
		int size=input.length();
		
		char Array[]=new char[size];
		
		input.getChars(0, size, Array, 0);
		
		int[] count=new int[2];
		for(int i=0;i<size;i++) {
			System.out.print(Array[i]);
			char a=Array[i];
			if(a==' ')count[0]++;
			else if(((int)a>96&&(int)a<123)||((int)a>64&&(int)a<91)) count[1]++;
			//System.out.println((int)a);
		}
		//System.out.println("\n-----------------");
		System.out.printf("\n-----------------\n�ܾ��%d, �����ڴ�%d�� �Դϴ�\n",(count[0]+1),count[1]);
		System.out.println("���� �Ϻ� ������ ������ ȭ����!!");

	}

}
