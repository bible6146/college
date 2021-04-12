package ch10;

class Student{//object 클래스를 무조건 상속
	 int num=10;
	private String name="이진은";
	private int age=21;
	
	public void go() {
		System.out.println("Student의 매소드");
	}
}

public class StudentTest extends Student {

	int ha=10;
	@Override
	public void go() {
		System.out.println("StudentTest의 메소드");
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
