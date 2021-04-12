package honja;

import javax.swing.Timer;

public class Callback {

	public static void main(String[] args) {
		final int a=0;
		Timer t1=new Timer(1000,e->System.out.println(a+"beep"));
		t1.start();
		
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			
			}catch(InterruptedException e) {
				
			}
		}

	}

}
