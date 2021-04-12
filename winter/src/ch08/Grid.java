package ch08;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
public class Grid extends JFrame{
	public Grid() {
		JButton button1=new JButton("button");
		JButton button2=new JButton("button2");
		JButton button3=new JButton("button3");
		JButton button4=new JButton("Longbutton");
		JButton button5=new JButton("button5");
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.setLayout(new GridLayout(4,0));//행이 0이아니면 행먼저 채움
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] agrs) {
		Grid g1=new Grid();
	}
}
