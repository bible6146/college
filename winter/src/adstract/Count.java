package adstract;

import java.awt.Font;

import javax.swing.*;

class MyPanel extends JPanel{
	JLabel la1;
	JLabel la2;
	int index=0;
	JButton bu;
	JButton bu1;
	public MyPanel() {
		la1=new JLabel("conut");
		la2=new JLabel(String.valueOf(index));
		bu=new JButton("ī���� ����");
		bu1=new JButton("ī���� ����");
		bu.addActionListener((e)->{
			index++;
			la2.setText(String.valueOf(index));
		});
		la2.setFont(new Font("Serif", Font.BOLD, 100));
		this.add(la1);
		this.add(la2);
		this.add(bu);
	
	}
}


public class Count extends JFrame {
	public Count() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setSize(400,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Count();

	}

}
