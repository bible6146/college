package MyThread;

public class ThreadTest1 {
	
	public static void main(String agrs[]) {
		Thread c1=new Counter(10);
		Counter c2=new Counter(1);
		//Runnable �������̽� �����ϰų�
		//������ ��ӹ�����ȴ� ������ ������ٰ� ������� ���ư��°� �ƴ�
		//start�� �������
		
//		c1.run();//�Ӹ��� ������ �ؿ��� �����
//		c2.run();
		
		c1.start();//�޼ҵ带 ���� �θ��� �ȵǰ� start�� ������Ѵ�
		c2.start();
		
		System.out.println("main ������ ����");
	}
}
class Counter extends Thread{
	private int start;
	
	public Counter(int start) {
		this.start=start;
	}
	
	public void run() {
		for(int i=start;i<start+10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
		}
	}
}