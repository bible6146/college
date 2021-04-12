package winter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Panel extends JPanel implements ActionListener{
	
	int a=0;
	public Panel() {
		this.setLayout(new BorderLayout());
		JButton b=new JButton("¹öÆ°");
		b.addActionListener(this);
		this.add(b,BorderLayout.SOUTH);
	}
	@Override
	protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.BLACK);
	g.drawOval(100, 100, 100, 100);
	g.drawOval(100, 200, 100, 100);
	g.drawOval(100, 300, 100, 100);
	if(a==0) {
		g.setColor(Color.RED);
		g.fillOval(100,100,100,100);
	}
	if(a==1) {
		g.setColor(Color.GREEN);
		g.fillOval(100,200,100,100);
	}
	if(a==2) {
		g.setColor(Color.YELLOW);
		g.fillOval(100,300,100,100);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	a++;
	repaint();
	
}

}
public class CarTest extends JFrame{
	public CarTest() {
		this.setSize(300, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Panel());
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new CarTest();

	}

}
