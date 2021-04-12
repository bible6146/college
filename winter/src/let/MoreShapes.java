package let;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoreShapes extends JFrame {
	public MoreShapes(){
		this.setSize(600,130);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		new MoreShapes();
	}

}
class MyPanel extends JPanel{
	ArrayList<Shape> sList=new ArrayList<Shape>(); 
	public MyPanel() {
		
		Shape s;
		s= new Rectangle2D.Float(10,10,70,80);
		sList.add(s);
		
		s= new RoundRectangle2D.Float(110,10,70,80,20,20);
		sList.add(s);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		GradientPaint gp=new GradientPaint(0,10,Color.WHITE,0,70,Color.RED); 
		Graphics2D g2=(Graphics2D)g;
		//g2.setColor(Color.RED);
		g2.setPaint(gp);
		
		for(Shape a:sList) {
			g2.draw(a);
			g2.fill(a);
		}
	}
}












