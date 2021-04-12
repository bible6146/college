package ch08;

public class Tv implements Control {

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끝니다");
		
	}
	
}
