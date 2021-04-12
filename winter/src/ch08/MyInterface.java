package ch08;

public interface MyInterface {
	//굳이 public abstract 아써도됨
	void sound();
	int money();
	int go=4;//기본적으로 static으로됨 final이라서 값 변경불가느 
			//인터페이스는 객체만드는게 불가능이라서 그런가봄

}
