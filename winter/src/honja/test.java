package honja;

public class test  {
	public void eat() {
		System.out.println("�θ�Դ´�");
	}
	public static void sound() {
		System.out.println("�θ� �Ҹ�ģ��");
	}
}
class test1 extends test{

	@Override
	public void eat() {
		System.out.println("�ڽ��� �Դ´�");
	}
	public static void sound() {
		System.out.println("�ڽ��̼Ҹ�ģ��");
	}
	
}
