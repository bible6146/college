package ch10;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Car extends JPanel{
	int x,y;
	Image img;
	
	public Car(){
		this.setSize(30,30);
		try{
			img= ImageIO.read(new File("./image/varee.png"));
		}catch (IOException e) {
			System.exit(1);
		}
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				repaint();
			}
		});
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,x, y,null);
	}
}


public class CarMove extends JFrame {
	public CarMove() {
		this.setSize(1000,1000);
		this.add(new Car());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CarMove();

	}

}
