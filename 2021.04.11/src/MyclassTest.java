
public class MyclassTest {
	public static void main(String agrs[]) {
		B b=new B();
		b.print();
		}
}
abstract class A{//추상 클래스는 추상메소드를 하나이상 포함해서 
				//추상 메소드가 있는걸 알려주는거임
	abstract void move();
	 void print() {
		 System.out.println("a 메소드");
	 }
	int y=10;
	
}

class B extends A{

	@Override
	void move() {
		
		
	}
	 
	
}
