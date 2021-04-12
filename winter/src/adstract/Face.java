package adstract;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Face{

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(280,300);
		f.add(new panel2());
		f.setVisible(true);

	}

}
class panel2 extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(25, 30, 200, 200);
		g.setColor(Color.BLACK);
		g.drawOval(25, 30, 200, 200);
		g.drawArc(60,80, 50, 50, 180, 180);
		g.drawArc(150,80, 50, 50, 180, 180);
		g.drawArc(75,150, 100, 70, 180, -180);
	}
	
}