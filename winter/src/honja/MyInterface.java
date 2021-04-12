package honja;

public interface MyInterface {
	public void myMethod();
	
	public static void myMethod2() {
		System.out.println("정적 메소드");
	}
	
	default void myMethod1() {
		System.out.println("디폴트 메소드");
	}
	
}
