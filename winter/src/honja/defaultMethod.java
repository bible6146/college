package honja;

public class defaultMethod implements MyInterface{

	public static void main(String[] args) {
		//Object j1=new defaultMethod();//이런식으로 하면 타입이 오브젝트라서 내가 만든 메소드가 없음
		defaultMethod j1=new defaultMethod();
		j1.myMethod1();
		MyInterface.myMethod2();//얘는 정적 메소드라서 객체를 생성하지 않고도 메소드호출이가능함

	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

}
