package ch08;

import javax.swing.*;
import java.awt.*;
public class Pizza extends JFrame {
	public Pizza() {
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		JPanel j3=new JPanel();
		JTextField t1=new JTextField(15);
		JButton b1=new JButton("콤보피자");
		JButton b2=new JButton("포테이토 피자");
		JButton b3=new JButton("불고기 피자");
		JLabel l1=new JLabel("피자 골라보이쇼");
		JLabel l2=new JLabel("개수");
		
		j1.add(l1);
		j2.add(b1);
		j2.add(b2);
		j2.add(b3);
		j2.add(l2);
		j2.add(t1);
		j3.add(j1);
		j3.add(j2);
		
		j1.setBackground(Color.blue);
		
		this.add(j3);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,150);
	}
	
	public static void main(String[] args) {
		Pizza p1=new Pizza();
	}

}
