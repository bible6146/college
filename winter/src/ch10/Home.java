package ch10;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class yy extends JPanel {
	int x,y;
	public yy() {
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				repaint();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(x, y, 50, 50);
	}
}

public class Home extends JFrame{
	public Home() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new yy());
		this.setSize(400,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Home();

	}

}
