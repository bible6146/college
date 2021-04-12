import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int MAX=30;//상수값의 변수는 대문자로
		String input=null;
		char[] charArray= new char[MAX];//[]괄호 위치는 상관없음
		System.out.println("문자열 입력하세요");
		input=sc.nextLine();//nextLine은 공백포함 line은 공백전까지 입력됨
		String[] word=new String[MAX];
		input.getChars(0, input.length(), charArray, 0);
	
		print(input,charArray);
		
		System.out.println("찾을 문자열 입력하세여");
		String search=sc.nextLine();
		
		boolean go=false;
		for(int i=0;i<input.length();i++) {// 변수를 상수로 정한것은 다이유가 있다
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
			System.out.println("바꿀문자는?");
		}
		else System.out.println("찾는 문자가 없습니다");
		
		
		
		
	}
	public static void print(String a,char[] b) {//클래스가 생성되기 전이라 static으로 해줌
		for(int i=0;i<a.length();i++) {
			System.out.print(b[i]);
		}
	}
}
