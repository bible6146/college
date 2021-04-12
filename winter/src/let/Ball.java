package let;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JFrame{
	public Ball() {
		this.add(new Panel3(),BorderLayout.CENTER);
		//this.add(new PowerBar(),BorderLayout.WEST);
		this.setSize(672,392);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ball();

	}

}
class Panel3 extends JPanel implements ActionListener,KeyListener{
	BufferedImage newimg;
	Image imagBack;
	Image img2;
	int x=10,y=300;
	Timer timer;
	int index=0;
	JButton b1=new JButton("공던지기");
	JLabel l=new JLabel("ggg");	
	public Panel3() {
		this.setOpaque(true);
	//	this.setSize(420,688);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		 imagBack = toolkit.getImage("C:\\Users\\jungse\\Downloads\\1zno.GIF");
		 img2 = toolkit.getImage("C:\\Users\\jungse\\Downloads\\bb1.GIF");
//		 img2= img2.getScaledInstance(400, 500,Image.SCALE_SMOOTH);
//		 imagBack  = imagBack.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		 timer=new Timer(100,this);
		 timer.start();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(index<10) {
			y=y-10;
		}
		if(index>10) y=y+10;
		index++;
		repaint();
		
		
	}
	@Override 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img2, 0, 0, this);
		g.drawImage(imagBack, 10,y, this);
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class PowerBar extends JPanel {
	int p=30;
	public PowerBar() {
		this.setSize(400,300);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(30, 100, 30, 100);
		g.fillRect(30, 100, 30, p);
	}
}
















