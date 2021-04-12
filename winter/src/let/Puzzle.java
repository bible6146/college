package let;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Puzzle extends JFrame {
	BufferedImage img;
	int piece=4;
	int[] piecenumber;
	
	public Puzzle() {
		try {
			img=ImageIO.read(new File("C:\\Users\\jungse\\Downloads\\goto.jpg"));
		}catch(IOException e) {
			System.out.println("¿À·ù");
			System.exit(0);
		}
		piecenumber=new int[piece*piece];
		for(int i=0;i<piecenumber.length;i++) {
			piecenumber[i]=i;
		}
		
		this.add(new MyPanel(),BorderLayout.CENTER);
		JButton b=new JButton("divide");
		this.add(b,BorderLayout.SOUTH);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				divide();
				repaint();
				
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setSize(img.getWidth(),img.getHeight()+b.getHeight()*2);
		this.setVisible(true);
		
	}
	
	void divide() {
		Random ra=new Random();
		int r;
		for(int i=0;i<piece*piece;i++) {
			r=ra.nextInt(piece*piece);
			int temp=piecenumber[i];
			piecenumber[i]=piecenumber[r];
			piecenumber[r]=temp;
		}
	}
	
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int	w=img.getWidth(null)/piece;
			int h=img.getHeight(null)/piece;
			for(int i=0;i<piece;i++) {
				int sx=i*w;
				for(int j=0;j<piece;j++) {
					int number=piecenumber[i*piece+j];
					int	sy=j*h;
					int dx=(number/piece)*w;
					int dy=(number%piece)*h;
					g.drawImage(img, dx, dy, dx+w, dy+h, sx, sy, sx+w, sy+h, null);
				}
			}
			
		}
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		new Puzzle();

	}

}
