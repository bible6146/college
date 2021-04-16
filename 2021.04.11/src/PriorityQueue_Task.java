import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Task {

	public static void main(String[] args) {
		TaskTest();
	}

	static void TaskTest() {
	
//		���ٽ�
//		Queue<Task> q = new PriorityQueue<>((s1,s2)-> s1.pri-s2.pri);
//		
		
		//�켱 ����ť�� �� ���Ҹ� �����ϴ� ����� 2����������
		//1. �׿����� Ŭ���� comparable �������̽��� �����ϴ°�
		//2. �켱���� ť���� �׿��Ҹ� ���ϴ� ����� ���� �˷��ִ°�
		//=>comparator �������̽��� ���� �ϴ°�
		//����� ���Ұ� comparable �������̽��� ������ ��ü�̰� 
		//�켱���� ť���� ���Ҹ� ���ϴ� ����� ���� �˷��ָ� ���� ������ ����?
		
		//comparable => ��ü�� ���� ����� ������ �ο�
		//compatator=> ���� ����� �ִ� ��ü�� ���Ĺ�� ������
		
		
		MyTaskComparator comp=new MyTaskComparator();
		
		//comparble�� �����ϰ� �־ ���� ������ ��ü�� �ָ� ��������
		Queue<Task> q = new PriorityQueue<>(comp);
		
		q.add(new Task(1, "�۾�"));
		q.add(new Task(3, "�۾�"));
		q.add(new Task(5, "�۾�"));
		q.add(new Task(2, "�۾�"));
		q.add(new Task(10, "�۾�"));
		
		
		//for���� ���� size�� ��� �پ� �� ����� �ȵ�
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
	//���� �����ѰŴϱ� �ϳ��� �޾Ƶ���
	@Override
	public int compareTo(Task o1) {//�μ��� �� ��ü
		return o1.pri-this.pri;
	}
	
}
//comparable Ŭ������ �ϳ����� �̰��� ������ ���� ������ ���� 2�� �޾ƾߵ� 
//								�׷��� Comparator�� ��
class MyTaskComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
//		return o1.desc.compareTo(o2.desc);
		//��Ʈ�� ���̸� ��Ʈ���� comparable�� �����ϰ� �־ ����
		return o1.pri-o2.pri;
	}
	

}	


