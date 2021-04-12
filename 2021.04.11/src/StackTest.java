import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackTest {

	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
		
	}
	private static void  test1() {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<10;i++) {
			//character  오토 박싱 되서 들어감  char가
			stack.push((char)('A'+i));
		}
//		System.out.println(stack);
//		//다음에 인출될 원소 엿보기 
//		System.out.println(stack.peek());
		
		//이터랙터는 이구조와 적합하지 않다
//		Iterator<Character> input=stack.iterator();
//		while(input.hasNext()) {
//			System.out.print(input.next());
//		}
//		System.out.println(stack);

		while(stack.size()>0) {
			Character c1=stack.pop();
			System.out.print(c1);
			
		}
		
		System.out.println(stack);
	}
	private static void  test2() {
		String str="appele,Grape,Ban!nada, mellon,watermellon";
		StringTokenizer st=new StringTokenizer(str,"!,");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
	}
	private static void test3() {
		System.out.println("수식을 입력하시오");
		Scanner input=new Scanner(System.in);
		String exp=input.nextLine();
		Stack<String> stack=new Stack<>();
		
		StringTokenizer st=new StringTokenizer(exp," ");
		while(st.hasMoreTokens()) {
			//스택이 empty인지 확인 , empty가 아니면 pop
			//empty이면 잘못된 식인거지
			//잘못된 식임을 출력하고 retrun
			//stack이 empty이면 유효한 식임을 출력
			//그렇지 empty이면 잘못된 식임을 출력
			String temp=st.nextToken();
			if(temp.equals("(")) {
				stack.push(st.nextToken());
			}else if(temp.equals(")")) {
				if(stack.empty()) {
					System.out.println("잘못된 식입니다");
					return;
				}
				else {
					stack.pop();
				}
			}
		}if(stack.empty()) {
			System.out.println("유요한 식입니다");
		}else {
			System.out.println("잘못된 식입니다");
		}
	}

}
