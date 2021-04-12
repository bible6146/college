package winter;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class carPanel extends JPanel implements MouseListener{
	Image img;
	int x,y;
	public carPanel() {
		try {
			img=ImageIO.read(new File("./image/OIP.jfif"));
		}catch(IOException e) {
			System.out.println("no");
			System.exit(1);
		}
		this.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	
	}
	@Override
	public void mouseExited(MouseEvent e) {
	
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,x,y,null);
	}
}

public class Move extends JFrame {
	public Move() {
		this.setSize(500,500);
		this.add(new carPanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Move();

	}

}
