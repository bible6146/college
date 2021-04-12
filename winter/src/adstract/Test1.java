package adstract;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Panel1());
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}

class Panel1 extends JPanel{
	private int x=50;
	private int y=50;
	private int width=20;
	private int height=20;
	
	public Panel1() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				moveSquare(e.getX(),e.getY());
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				moveSquare(e.getX(),e.getY());
			}
			
		});
		
	}
	
	public void moveSquare(int x,int y) {
		this.x=x;
		this.y=y;
		repaint();
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("마우스ㄹ를 클릭하면 사각형이 그려집니다",10,20);
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}
	
	
	
}