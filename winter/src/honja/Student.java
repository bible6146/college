package honja;
import java.util.*;
public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int grade;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	public Student(String name,int age,int grade) {
		this.name=name;
		this.age=age;
		this.grade=grade;
		
	}
	@Override
	public int compareTo(Student o) {
		return this.grade-o.grade;
		
	}

	public static void main(String[] args) {
		Student s1=new Student("±èÁ¤¼¼",12,100);
		Student s2=new Student("±è»õº°",12,33);
		Student s3=new Student("±è¿¹Âù",23,44);
		Student[] s= {s1,s2,s3};
		Arrays.sort(s);
		for(Student i:s) {
			System.out.println(i);
		}
	}
}
