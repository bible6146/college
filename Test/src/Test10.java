import java.util.Scanner;
public class Test10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=null;
		int[] check=new int[26];
		
		System.out.println("문자열 입력하세요 ^^");
		input=sc.nextLine();
		
		int size=input.length();
		
		char[] charArray=new char[size];
		
		input.getChars(0, size ,charArray, 0);
		int max=0;
		for(int i=0;i<size;i++) {
			System.out.print(charArray[i]);
			if(charArray[i]!=' ') {
				check[((int)charArray[i])-97]++; //a==97 b==98 제일 뒷놈 궁금하지않음
				if(max<((int)charArray[i])-97)// 제일 큰아스키 코드 궁금함
					max=((int)charArray[i])-97;
					}
		}// 위애 if문이 없으면 아스키코드char->int 로변환될때 공백값이 들어가버림 26 
		                             //그래서 오류나서 한시간동안 헤멤 index 0 1 2 3 4 5 ....
														//    index A b c d e 
		System.out.println();							//          3     4
		for(int j=0;j<check.length;j++) {//아스키코드라서 !
			if(check[j]>0) {
				System.out.print((char)(j+97)+":"+check[j]);
				if(j!=max)System.out.print(",");
			}//쉼표 쓰기
			
		}

	}

}
