package ch08;
import java.util.Arrays;
public class Student implements Comparable{
	private String name;
	private int avg;
	private int age;
	
	public Student(String name,int avg,int age) {
		this.name=name;
		this.age=age;
		this.avg=avg;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		int result= this.getName().compareTo(s.getName());
		return result;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public static void main (String[] agrs) {
		Student s1=new Student("±èÁ¤¼¼",25,100);
		Student s2=new Student("±è»õº°",21,90);
		Student s3=new Student("±è¿¹Âù",23,98);
		Student[] s= {s1,s2,s3};
		
		s1.name="±èÁö¸¸";
		Arrays.sort(s);
		for(Student i:s ) {
			System.out.println(i);
		}
	}
	


	
	
}
