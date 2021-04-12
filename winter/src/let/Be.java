package let;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Be extends JFrame {
	public Be() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.add(new Panel2());
		this.setVisible(true);
	}
	
	class Panel2 extends JPanel implements MouseListener, MouseMotionListener{
		int index=0;
		int xs[]= {50,150,400,450};
		int ys[]= {200,50,300,200};
		public Panel2() {
			
			this.addMouseListener(this);
		}
		
		@Override
		public void paintComponent(Graphics g) {//2D랑 일반 그래픽 객체랑 다른점은 2D는 그릴 객체를 넘겨주면 그린다
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0;i<4;i++) {
				g.drawRect(xs[i], ys[i], 16, 16);
			}
			Graphics2D g2=(Graphics2D)g;
			g2.setColor(Color.RED);
			GeneralPath path=new GeneralPath();
			path.moveTo(xs[0],ys[0]);
			path.curveTo(xs[1],ys[1], xs[2], ys[2], xs[3], ys[3]);
			g2.draw(path);
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			xs[index]=e.getX();
			ys[index]=e.getY();
			index++;
			if(index==4)repaint();
			if(index==4)index=0;
			
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		new Be();

	}

}






