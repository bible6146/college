package honja;

public interface MyInterface {
	public void myMethod();
	
	public static void myMethod2() {
		System.out.println("���� �޼ҵ�");
	}
	
	default void myMethod1() {
		System.out.println("����Ʈ �޼ҵ�");
	}
	
}
