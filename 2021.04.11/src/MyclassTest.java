
public class MyclassTest {
	public static void main(String agrs[]) {
		B b=new B();
		b.print();
		}
}
abstract class A{//�߻� Ŭ������ �߻�޼ҵ带 �ϳ��̻� �����ؼ� 
				//�߻� �޼ҵ尡 �ִ°� �˷��ִ°���
	abstract void move();
	 void print() {
		 System.out.println("a �޼ҵ�");
	 }
	int y=10;
	
}

class B extends A{

	@Override
	void move() {
		
		
	}
	 
	
}
