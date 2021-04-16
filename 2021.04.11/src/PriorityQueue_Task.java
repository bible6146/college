import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Task {

	public static void main(String[] args) {
		TaskTest();
	}

	static void TaskTest() {
	
//		람다식
//		Queue<Task> q = new PriorityQueue<>((s1,s2)-> s1.pri-s2.pri);
//		
		
		//우선 수위큐에 들어갈 원소를 정렬하는 방법은 2가지가있음
		//1. 그원소의 클래스 comparable 인터페이스를 구현하는것
		//2. 우선순위 큐에게 그원소를 비교하는 방법을 따로 알려주는것
		//=>comparator 인터페이스를 구현 하는것
		//참고로 원소가 comparable 인터페이스를 구현한 객체이고 
		//우선순위 큐에서 원소를 비교하는 방법도 따로 알려주면 무슨 순서를 쓸까?
		
		//comparable => 객체에 정렬 방법이 없을때 부여
		//compatator=> 정렬 방법이 있는 객체에 정렬방법 재정의
		
		
		MyTaskComparator comp=new MyTaskComparator();
		
		//comparble을 구현하고 있어도 따로 구현한 객체를 주면 정렬해줌
		Queue<Task> q = new PriorityQueue<>(comp);
		
		q.add(new Task(1, "작업"));
		q.add(new Task(3, "작업"));
		q.add(new Task(5, "작업"));
		q.add(new Task(2, "작업"));
		q.add(new Task(10, "작업"));
		
		
		//for문을 쓰면 size가 계속 줄어 들어서 제대로 안됨
//		for (int i = 0; i < q.size(); i++) {
//			Task t=q.poll();
//			System.out.println(t);
//		}
		while(q.size()>0) {
			Task t=q.poll();
			System.out.println(t);
		}

	}

}

class Task implements Comparable<Task> {
	int pri;
	String desc;

	public Task(int a, String b) {
		this.pri = a;
		this.desc = b;
	}

	@Override
	public String toString() {
		return "Task [pri=" + pri + ", desc=" + desc + "]";
	}
	//내가 구현한거니까 하나만 받아도됨
	@Override
	public int compareTo(Task o1) {//인수는 옆 객체
		return o1.pri-this.pri;
	}
	
}
//comparable 클래스를 하나만듬 이것은 내값이 없기 때문에 값을 2개 받아야됨 
//								그래서 Comparator를 씀
class MyTaskComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
//		return o1.desc.compareTo(o2.desc);
		//스트링 값이면 스트링이 comparable을 구현하고 있어서 가능
		return o1.pri-o2.pri;
	}
	

}	


