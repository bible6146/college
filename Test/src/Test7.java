import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int MAX=30;//������� ������ �빮�ڷ�
		String input=null;
		char[] charArray= new char[MAX];//[]��ȣ ��ġ�� �������
		System.out.println("���ڿ� �Է��ϼ���");
		input=sc.nextLine();//nextLine�� �������� line�� ���������� �Էµ�
		String[] word=new String[MAX];
		input.getChars(0, input.length(), charArray, 0);
	
		print(input,charArray);
		
		System.out.println("ã�� ���ڿ� �Է��ϼ���");
		String search=sc.nextLine();
		
		boolean go=false;
		for(int i=0;i<input.length();i++) {// ������ ����� ���Ѱ��� �������� �ִ�
			if(search.charAt(0)==charArray[i]) {
				for(int j=0;j<search.length();j++) {
					if(charArray[j+i]==search.charAt(j)) {
						go=true;
					}else {
						go=false;
						break;
					}
					i=j;
				}
				if(go)break;
			}
			
		}
		if(go) {
			System.out.println("�ٲܹ��ڴ�?");
		}
		else System.out.println("ã�� ���ڰ� �����ϴ�");
		
		
		
		
	}
	public static void print(String a,char[] b) {//Ŭ������ �����Ǳ� ���̶� static���� ����
		for(int i=0;i<a.length();i++) {
			System.out.print(b[i]);
		}
	}
}
