package adstract;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class Tree extends JFrame{
	public Tree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,700);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		treeDraw(g,400,600,-90,10);
	}
	
	public void treeDraw(Graphics g,int x,int y,double angle,int index) {
		Random ra=new Random();
		if(index==0)return;
		int x2=x+(int)(ra.nextInt(340));
		int y2=y+(int)(ra.nextInt(1));
		g.drawLine(x, y, x2, y2);
		treeDraw(g,x2,y2,angle-20,index-1);
		treeDraw(g,x2,y2,angle+20,index-1);
	}
	
	
	
	public static void main(String[] args) {
		new Tree();
	}

}
