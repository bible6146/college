package ch10;

class Student{//object Ŭ������ ������ ���
	 int num=10;
	private String name="������";
	private int age=21;
	
	public void go() {
		System.out.println("Student�� �żҵ�");
	}
}

public class StudentTest extends Student {

	int ha=10;
	@Override
	public void go() {
		System.out.println("StudentTest�� �޼ҵ�");
	}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		StudentTest a=new StudentTest();
		Student v=new StudentTest();
		//System.out.println(v.num);
		//v.go();
//		s.go();
		//a.go();
	}

}
