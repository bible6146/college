package restart;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontTest extends JFrame {
	ArrayList<JButton> a=new ArrayList<JButton>();
	JLabel la=new JLabel();
	public FontTest() {
		la.setLayout(new GridLayout(8,8));
		GraphicsEnvironment g=GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] family=g.getAvailableFontFamilyNames();
		for(String s:family) {
			JButton y=new JButton(s);
			y.setFont(new Font("Serif", Font.BOLD, 12));
			la.add(y);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.add(la,BorderLayout.CENTER);
	//	this.add(btn,BorderLayout.SOUTH);
		//this.setResizable(false);
		//this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FontTest();

	}

}
