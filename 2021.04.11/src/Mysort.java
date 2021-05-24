import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Mysort {
	public static void main(String agrs[]) {
		test1();
	}
	
	private static void test1() {
		ArrayList<MyStudent> list=new ArrayList<>();
		Random ra=new Random(); 
		for(int i=0;i<10;i++) {
			list.add(new MyStudent("이름"+i,ra.nextInt(100)+1));
		}
		System.out.println(list);
//		Collections.sort(list,new Comparator<MyStudent>() {
//
//			@Override
//			public int compare(MyStudent o1, MyStudent o2) {
//				return o1.grade-o2.grade;
//			}
//		});
		sort2(list);
		System.out.println(list);
	}
	private static void sort(List<MyStudent> list) {
		for(int i=0;i<list.size();i++) {
			int min=i;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(min).grade>list.get(j).grade) {
					min=j;
				}		
			}
			swap(list,min,i);
		}
	}
	private static void sort2(List<MyStudent> list) {
		for(int i=0;i<list.size();i++) {
			int min=i;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(min).compareTo(list.get(j))>0) {
					min=j;
				}		
				swap(list,min,i);
			}
			
		}
	}
	private static void swap(List<MyStudent> list,int i,int j) {
		MyStudent temp=list.get(i);
		list.set(i,list.get(j));
		list.set(j, temp);
	}
}
class MyStudent implements Comparable<MyStudent>{
	public String name;
	public int grade;
	
	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", grade=" + grade + "]";
	}

	public MyStudent(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}

	@Override			//인수가 외부 임
	public int compareTo(MyStudent o) {
		return this.grade-o.grade;
	}
}
