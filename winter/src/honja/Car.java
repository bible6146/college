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
	@Override// �ּ� ���̳� �ν��ͽ����� ���ϴ°��� �ƴ϶� ��ü Ÿ���� ���ϴ°�
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return this.model.equals(((Car) obj).model);
		}		//���⼭�� ���� ������ ���ϴ���
		return false;
		
	}
	public static void main (String[] agrs) {
		Car c1=new Car("�ҳ�Ÿ");
		Car c2=new Car("�ҳ�");
		if(c1.equals(c2)) {
			System.out.println("������");
		}
		else System.out.println("�ٸ���");
	}
}