package ch08;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
public class FlowLayoutTest extends JFrame{
	
	public FlowLayoutTest() {
		JButton button1=new JButton("button");
		JButton button2=new JButton("button2");
		JButton button3=new JButton("button3");
		JButton button4=new JButton("Longbutton");
		JButton button5=new JButton("button5");
		this.add(button1,BorderLayout.NORTH);
		this.add(button2,BorderLayout.SOUTH);
		this.add(button3,BorderLayout.WEST);
		this.add(button4,BorderLayout.EAST);
		this.add(button5,BorderLayout.CENTER);
		//button1.setBackground(Color.red);
		//this.setLayout(new BorderLayout());//class �̸��ϰ� ��ġ�� ����! ���� �𸣰����� BorderLayout�� �ֻ��� ������Ʈ�� �����尪�̶� �ѹ��� ���ϸ� �ȵǴµ�
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//frame�� ��ġ�����ڴ� ��������� ���������� ������ boaderLayout
	}
	public static void main(String[] agrs) {
		JFrame l1=new FlowLayoutTest();
		
	}
}
