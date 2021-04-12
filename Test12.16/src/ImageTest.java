import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTest extends JFrame  {
	JPanel j1=new JPanel();
	JLabel la1=new JLabel();
	
	public ImageTest() {
		ImageIcon icon=new ImageIcon("C:\\Users\\jungse\\Downloads\\PixelArt (2).PNG");
		JButton b1=new JButton();
		b1.setIcon(icon);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon2=new ImageIcon("C:\\Users\\jungse\\Downloads\\PixelArt (2).PNG");
				la1.setIcon(icon2);
				
				
			}
		});
		this.add(la1,BorderLayout.CENTER);
		this.add(b1,BorderLayout.SOUTH);
		this.setSize(500,500);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ImageTest();

	}

}
