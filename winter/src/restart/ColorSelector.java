package restart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//자신에게 붙어있는놈을 변경시켜줘야 얘가 인지를함
public class ColorSelector extends JFrame implements ActionListener {
	int index=0;
	JButton btn=new JButton("색깔바꾸기");
	panel1 p1=new panel1();
	panel2 p2=new panel2();
	
	public ColorSelector() {
		btn.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(400,400);
		this.add(p1,BorderLayout.CENTER);
		this.add(btn,BorderLayout.SOUTH);
		//this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
	Color color;
	class panel1 extends JPanel implements ChangeListener{
		JColorChooser color=new JColorChooser();
		public panel1() {
			color.getSelectionModel().addChangeListener(this);
			this.add(color);
		}
		@Override
		public void stateChanged(ChangeEvent e) {
			Color c=color.getColor();
			
		}
	}
	
	class panel2 extends JPanel implements MouseListener{
		Color cil;
		int x,y;
		public panel2() {
			this.addMouseListener(this);
			this.add(new JLabel("안녕하세요"));
			
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(cil);
			g.drawRect(x, y, 50, 50);
			System.out.println("bell");
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			x=e.getX();
			y=e.getY();
			repaint();
			
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
	}

	public static void main(String[] args) {
		ColorSelector v=new ColorSelector();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(index%2==0){
			this.remove(p1);
			p2.cil=p1.color.getColor();
			btn.setText("!!!");
			this.add(p2,BorderLayout.CENTER);
			}
		else {
			this.remove(p2);
			btn.setText("$$$$");
			this.add(p1,BorderLayout.CENTER);
		}
		index++;
		repaint();
		this.setVisible(true);
	}

}
