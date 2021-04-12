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
		//this.setLayout(new BorderLayout());//class 이름하고 겹치지 말것! 먼지 모르겠지만 BorderLayout이 최상위 컴포넌트의 디폴드값이라서 한번더 말하면 안되는듯
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//frame의 배치관리자는 명시적으로 지정해주지 않으면 boaderLayout
	}
	public static void main(String[] agrs) {
		JFrame l1=new FlowLayoutTest();
		
	}
}
