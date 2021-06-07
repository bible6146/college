package MyThread;

public class ThreadTest1 {
	
	public static void main(String agrs[]) {
		Thread c1=new Counter(10);
		Counter c2=new Counter(1);
		//Runnable 인터페이스 구현하거나
		//스레드 상속받으면된다 스레드 만들었다고 스레드로 돌아가는거 아님
		//start를 해줘야함
		
//		c1.run();//임마가 끝나야 밑에꺼 실행됨
//		c2.run();
		
		c1.start();//메소드를 직접 부르면 안되고 start를 해줘야한다
		c2.start();
		
		System.out.println("main 쓰레드 종료");
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