package honja;

public class test  {
	public void eat() {
		System.out.println("부모먹는다");
	}
	public static void sound() {
		System.out.println("부모 소리친다");
	}
}
class test1 extends test{

	@Override
	public void eat() {
		System.out.println("자식이 먹는다");
	}
	public static void sound() {
		System.out.println("자식이소리친다");
	}
	
}
