import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
public class PriorityQueueTest2 {
		
	public static void main(String agrs[]) {
		test1();
	}
	static void test1() {
		Queue<Integer> queue =new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		Random ra=new Random();
		//�������� 1~10���� ������ ����.
		
		for(int i=0;i<10;i++) {
			queue.add(ra.nextInt(100)+1);
		}
		
		System.out.println(queue);
		
		for(int i=0;i<10;i++) {
			System.out.print(queue.poll()+"  ");
		}
		
		//ť �ȿ� ������ ��� �غ���.
		
		//ť�� ���Ҹ� �ϳ��� ������� ������
		
		
	}
	
	
	

}
