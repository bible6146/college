package ch08;

public class Tv implements Control {

	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
		
	}
	
}
