package let;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


class MyPanel1 extends JPanel implements ActionListener{
	BufferedImage img;
	int h=500;
	int w=300;
	int s_x=0;
	int s_y=250;
	Timer timer;
	int x,y;
	
	public MyPanel1() {
		this.setBackground(Color.BLACK);
		this.setPreferredSize(new Dimension(h,w));
		this.setDoubleBuffered(true);
		File input=new File("C:\\Users\\jungse\\Downloads\\ship.jpg");
		try {
			img=ImageIO.read(input);
		}catch(IOException e) {
			System.out.println("이미지오류");
			e.printStackTrace();
		}
		x=s_x;
		y=s_y;
		
		timer=new Timer(10,this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x+=1;
		y-=1;
		if(x>h) {
			x=s_x;
			y=s_y;
		}
		repaint();
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,x,y,this);
	}
	
}




public class Space extends JFrame {
	public Space() {
		this.add(new MyPanel1());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Space();

	}

}
