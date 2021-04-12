package honja;
import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main4 extends JFrame implements ActionListener{
	private JButton b1;
	private JButton b2;
	JPanel p;
	public Main4() {
		b1=new JButton("·£´ý»ö±ò º¯ÇÏ±â");
		b2=new JButton("·£´ý»ö±ò º¯ÇÏ±â");
		p=new JPanel();
//		b1.setBackground(Color.black);
//		b2.setBackground(Color.black);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setSize(200,100);
		b2.setSize(200,100);
		p.add(b1);
		p.add(b2);
		this.add(p);
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Main4 m1=new Main4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random r1=new Random();
		int a=r1.nextInt(250);
		int b=r1.nextInt(250);
		int c=r1.nextInt(250);
		//JButton b=(JButton)e.getSource();
		p.setBackground(new Color(a,b,c));
//		if(a==0) {
//			p.setBackground(new Color(a,b,c));
//		}
//		if(a==1) {
//			p.setBackground(Color.blue);
//		}
//		if(a==2) {
//			p.setBackground(Color.green);
//		}
		
	}

}

