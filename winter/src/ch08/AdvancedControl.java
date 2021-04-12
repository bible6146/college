package ch08;

public interface AdvancedControl extends Control {
	//인터 페이스가 인터페이스를 확장할때는 extends 써야됨 
	void volumeup();
	void volumedown();
}
