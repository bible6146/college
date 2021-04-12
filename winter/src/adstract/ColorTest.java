package adstract;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTest extends JFrame implements ChangeListener,ActionListener{
	JColorChooser c;
	JPanel p1=new JPanel();
	JButton b1=new JButton("색상선택하기");
	panel2 p2=new panel2();
	public ColorTest() {
		c=new JColorChooser();
		c.getSelectionModel().addChangeListener(this);
		p1.add(c);
		b1.addActionListener(this);
		this.add(b1,BorderLayout.SOUTH);
		this.add(p1,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setVisible(true);

	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Color c1= c.getColor(); 
		System.out.println(c);
		
	}
	class panel2 extends JPanel {
	//	Color color;
		int x,y;
		public panel2() {
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					x=e.getX();
					y=e.getY();
					repaint();
					
				}
			});
		}
		@Override	
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(x, y, 50, 50);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//p2.color= c.getColor();
		this.remove(p1);
		this.add(p2,BorderLayout.CENTER);
		repaint();
		
		
	}
	public static void main(String[] args) {
		new ColorTest();
		
	}



}
