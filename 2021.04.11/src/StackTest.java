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
			//character  ���� �ڽ� �Ǽ� ��  char��
			stack.push((char)('A'+i));
		}
//		System.out.println(stack);
//		//������ ����� ���� ������ 
//		System.out.println(stack.peek());
		
		//���ͷ��ʹ� �̱����� �������� �ʴ�
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
		System.out.println("������ �Է��Ͻÿ�");
		Scanner input=new Scanner(System.in);
		String exp=input.nextLine();
		Stack<String> stack=new Stack<>();
		
		StringTokenizer st=new StringTokenizer(exp," ");
		while(st.hasMoreTokens()) {
			//������ empty���� Ȯ�� , empty�� �ƴϸ� pop
			//empty�̸� �߸��� ���ΰ���
			//�߸��� ������ ����ϰ� retrun
			//stack�� empty�̸� ��ȿ�� ������ ���
			//�׷��� empty�̸� �߸��� ������ ���
			String temp=st.nextToken();
			if(temp.equals("(")) {
				stack.push(st.nextToken());
			}else if(temp.equals(")")) {
				if(stack.empty()) {
					System.out.println("�߸��� ���Դϴ�");
					return;
				}
				else {
					stack.pop();
				}
			}
		}if(stack.empty()) {
			System.out.println("������ ���Դϴ�");
		}else {
			System.out.println("�߸��� ���Դϴ�");
		}
	}

}
