package honja;

public class Car{
	private String model;
	
	public Car(String a) {
		this.model=a;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	@Override// 주소 값이나 인스터스값을 비교하는것이 아니라 객체 타입을 비교하는것
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return this.model.equals(((Car) obj).model);
		}		//여기서는 같은 모델인지 비교하느것
		return false;
		
	}
	public static void main (String[] agrs) {
		Car c1=new Car("소나타");
		Car c2=new Car("소나");
		if(c1.equals(c2)) {
			System.out.println("같은차");
		}
		else System.out.println("다른차");
	}
}