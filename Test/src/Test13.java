import java.util.*;
public class Test13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String selectedWord="yeungjin";
		
		int sizeOfString=selectedWord.length();
		char answerWord[]=new char[sizeOfString];
		
		selectedWord.getChars(0, sizeOfString, answerWord, 0);
		
		char inputValue[]=new char[sizeOfString];
		
		for(int i=0;i<sizeOfString;i++) {
			inputValue[i]='_';
			
		}
		for(int i=0;i<sizeOfString;i++) {
			System.out.print(inputValue[i]+" ");
			
		}
		System.out.println("\nGiven word(level5):");
		for(int i=0;i<sizeOfString;i++) {
			System.out.print(inputValue[i]+" ");
		}
		
		char[] wordAll=new char[52];
		for(int i=0;i<26;i++) {
			wordAll[i]=(char)(i+65);
		}
		for(int i=0;i<26;i++) {
			wordAll[26+i]=(char)(i+97);
		}
		int count=1;
		while(true) {
			String str=" is wrong";
			System.out.print("\n\n%input your guess:");
			String select=sc.nextLine();
			int index=0;
			loop:
			for(index=0;index<53;index++) {
				if(index<26) {
					if(select.equals(String.valueOf(wordAll[index]))) {
						break loop;
					}
				}
				else {
					if(select.equals(String.valueOf(wordAll[index]))) {
						break loop;
					}
					
				}
			}
			if(index==53) {
				System.out.println("잘못된 문자 재입력");
				continue;
			}
			for(int i=0;i<selectedWord.length();i++) {
				if(selectedWord.substring(i,i+1).equals(select)) {
					inputValue[i]=wordAll[index];
					str=" is good";
				}
			}

			System.out.print("%Your guess (at"+count+"nd attempt),"
			+wordAll[index]+str+"\n%Given Word ");
			for(int i=0;i<inputValue.length;i++) {
				System.out.print(inputValue[i]+" ");
			}
			count++;
			int check=0;
			for(int i=0;i<inputValue.length;i++) {
				if(inputValue[i]!='_') {
					check++;
				}
			}
			if(check==inputValue.length)break;
			
		}
		System.out.println("\nCongratulation! "+count+"th attempth");
	}

}
