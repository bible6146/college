package honja;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

class point{
	int x,y;
	public point(int x,int y) {
		this.x=x;
		this.y=y;
	}
}

class gogo extends JPanel implements MouseMotionListener{
	ArrayList<point> all=new ArrayList<>();
	
	public gogo() {
		//this.addMouseMotionListener(this);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(point i:all) {
			g.drawRect(i.x,i.y, 1, 1);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		all.add(new point(e.getX(),e.getY()));
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class More extends JFrame{
	public More() {
		this.setSize(400,500);
		this.add(new gogo());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		More go=new More();
	}

}
