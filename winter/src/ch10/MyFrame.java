package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Panel extends JPanel implements ActionListener{
	int index=100;
	JButton[] bu;
	JPanel j2;
	JButton party;
	public Panel() {
		party=new JButton("party");
		party.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				while(true) {
					for(int i=0;i<3;i++) {
						index=i;
						repaint();
						 try{
							 Thread.sleep(500);
				                 
				            }catch(Exception e1){
				            	System.out.println(e1.getMessage());
				            }
					}
				}
				
			}
		});
		this.setLayout(new BorderLayout());
		this.add(party,BorderLayout.NORTH);
		j2=new JPanel();
		bu=new JButton[3];
		for(int i=0;i<3;i++) {
			bu[i]=new JButton("change"+i);
			j2.add(bu[i]);
			bu[i].addActionListener(this);
		}
		this.add(j2,BorderLayout.SOUTH);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		Random ra=new Random();
		int[] r=new int[3];
		for(int i=0; i<3;i++) {
			r[i]=ra.nextInt(250)+1;
		}
		if(index==0) {
			g.setColor(new Color(r[0], r[1], r[2]));
			g.fillOval(100, 100, 100, 100);
		}
		if(index==1) {
			g.setColor(new Color(r[0], r[1], r[2]));
			g.fillOval(100, 200, 100, 100);
		}
		if(index==2) {
			g.setColor(new Color(r[0], r[1], r[2]));
			g.fillOval(100, 300, 100, 100);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton go=(JButton)e.getSource();
		String str=go.getText();
		for(int i=0;i<3;i++) {
			if(str.equals(bu[i].getText())) {
				index=i; break;
			}
		}
		repaint();
		
	}
}

public class MyFrame extends JFrame {

	public MyFrame(){
		this.setSize(300,500);
		this.add(new Panel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();

	}

}
