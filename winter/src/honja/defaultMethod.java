package honja;

public class defaultMethod implements MyInterface{

	public static void main(String[] args) {
		//Object j1=new defaultMethod();//�̷������� �ϸ� Ÿ���� ������Ʈ�� ���� ���� �޼ҵ尡 ����
		defaultMethod j1=new defaultMethod();
		j1.myMethod1();
		MyInterface.myMethod2();//��� ���� �޼ҵ�� ��ü�� �������� �ʰ� �޼ҵ�ȣ���̰�����

	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

}
