package honja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerTest implements ActionListener {
	public static void main(String[] agrs) {
		TimerTest t1=new TimerTest();
		Timer t=new Timer(1000,t1);//�����̾ȵǼ� ���⿡ this ���� �����ڿ��� ��������
		
		t.start();
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1�ʰ� �����׿�");
		
	}
}
