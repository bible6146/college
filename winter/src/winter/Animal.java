package winter;

public class Animal {
	private double weight;
	private String picture;
	
	protected void eat() {
		System.out.println("eat()�� ȣ��Ǿ���");
	}
	void sleep() {
		System.out.println("sleep�� ȣ��Ǿ���");
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setPicture(String Picture) {
		this.picture=Picture;
	}
	public String getPicture() {
		return picture;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}	
