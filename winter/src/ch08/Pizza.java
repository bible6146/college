package ch08;

import javax.swing.*;
import java.awt.*;
public class Pizza extends JFrame {
	public Pizza() {
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		JPanel j3=new JPanel();
		JTextField t1=new JTextField(15);
		JButton b1=new JButton("�޺�����");
		JButton b2=new JButton("�������� ����");
		JButton b3=new JButton("�Ұ�� ����");
		JLabel l1=new JLabel("���� ����̼�");
		JLabel l2=new JLabel("����");
		
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
