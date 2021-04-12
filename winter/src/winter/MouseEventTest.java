package winter;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rectangle {
	   int x, y, w, h;
	}

	class MyPanelMouse extends JPanel implements MouseListener { // MyPanel => JPanel (상속받고 있으므로);

	   BufferedImage img = null;
	   int imgx = 0, imgy = 0;
	//   ArrayList<Rectangle> list = new ArrayList<>();
	   Rectangle[] list = new Rectangle[100];
	   int index = 0;

	   public MyPanelMouse() {
	      this.addMouseListener(this);
	   }
	   @Override
	   public void paintComponent(Graphics g) {
	      System.out.println("호출");
	      super.paintComponent(g);
	      for (Rectangle r : list) {
	         if (r != null) {
	            g.drawRect(r.x, r.y, r.w, r.h);
	         }
	      }
	   }

	   @Override
	   public void mouseClicked(MouseEvent e) {

	   }

	   @Override
	   public void mousePressed(MouseEvent e) {
	      if (index > 100)
	         return;
//	      list.add(new Rectangle());
//	      list.get(index).x = e.getX();
//	      list.get(index).y = e.getY();
//	      list.get(index).w = 50;
//	      list.get(index).h = 50;
	      list[index] = new Rectangle();
	      list[index].x = e.getX();
	      list[index].y = e.getY();
	      list[index].w = 50;
	      list[index].h = 50;
	      
	      index++;
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

	}

	public class MouseEventTest extends JFrame{
	   public MouseEventTest() {
	      this.setSize(300, 300);
	      this.setTitle("마우스로 사각형 그리기");
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.add(new MyPanelMouse());
	      this.setVisible(true);
	      this.setLocationRelativeTo(null);
	   }
	   
	   public static void main(String[] args) {
	      MouseEventTest frame = new MouseEventTest();
	   }
	}