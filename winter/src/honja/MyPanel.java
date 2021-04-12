package honja;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	BufferedImage img=null;
	int img_x=100,img_y=100;
	
	public MyPanel() {
		try {
			img=ImageIO.read(new File("./image/OIP.jfif"));
		}catch(IOException e) {
			System.out.println("이미지 없음");
			System.exit(1);
		}
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				int c=e.getKeyCode();
				switch(c) {
				case KeyEvent.VK_UP: img_y+=10; break;
				case KeyEvent.VK_DOWN: img_y-=10; break;
				case KeyEvent.VK_LEFT: img_x-=10; break;
				case KeyEvent.VK_RIGHT: img_x+=10; break;
				}
				repaint();
				
			}
		});
		this.requestFocus();
		setFocusable(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
	
	public static void main(String[] args) {
		

	}

}
