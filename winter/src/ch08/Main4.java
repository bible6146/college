package ch08;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main4 {
	private int mi=0;
	public static void main(String[] args) {
		Main4 li =new Main4();
//		Timer time=new Timer(1000, new ActionListener() {
//			private int hi;
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(hi++);
//				
//			}
//			
//		});
		Timer time=new Timer(1000,new ActionListener(){
			public int a=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(a++);
				
			}
			
		});
		//Timer time=new Timer(1000, li);
		time.start();// main �����尡 ������ ���μ��� ��ü�� ����
		for(int i=0;i<30;i++) {//2���� �����尡 ����ǰ� ���� 
			try {
				Thread.sleep(1000);
			}	catch (InterruptedException ie) {
				System.out.println("�μ��� �߻�");
			}
		}
	}

	
	

}
