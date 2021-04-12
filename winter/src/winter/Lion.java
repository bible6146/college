package winter;

public class Lion extends Animal {
	private int leg=4;
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg=leg;
	}
	public void arar() {
		System.out.println("arar이 호출되었습니다.");
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
