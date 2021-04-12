package ch08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculactorTest extends JFrame implements ActionListener {
	private JTextField f1;
	private JPanel p1;
	private JButton[] b1;
	private JButton addbutton,subbutton,nulbutton,divbutton,decbutton,
	equbutton,delbutton,clrbutton,negbutton;
	private Font Myfont= new Font(Font.SANS_SERIF,Font.BOLD,30);
	public CalculactorTest() {
		this.setTitle("CalculactorTest");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,550);
		this.setLayout(null);
		
		f1=new JTextField();
		f1.setBounds(50, 25, 300, 50);
		f1.setEditable(false);
		
		p1=new JPanel();
		p1.setBounds(50,100,300,300);
		p1.setLayout(new GridLayout(4,4,10,10));
		
		b1=new JButton[10];
		for(int i=0;i<b1.length;i++) {
			b1[i]=new JButton(String.valueOf(i));
			b1[i].setFont(Myfont);
			b1[i].addActionListener(this);
		}
		addbutton=new JButton("+");
		subbutton=new JButton("-");
		nulbutton=new JButton("*");
		divbutton=new JButton("/");
		decbutton=new JButton(".");
		equbutton=new JButton("=");
		delbutton=new JButton("delete");
		delbutton.setBounds(150, 430, 100, 50);
		clrbutton=new JButton("clear");
		clrbutton.setBounds(250, 430, 100, 50);
		negbutton=new JButton("(-)");
		negbutton.setBounds(50, 430, 100, 50);
		
		p1.add(b1[1]);
		p1.add(b1[2]);
		p1.add(b1[3]);
		p1.add(addbutton);
		
		p1.add(b1[4]);
		p1.add(b1[5]);
		p1.add(b1[6]);
		p1.add(subbutton);
		
		p1.add(b1[7]);
		p1.add(b1[8]);
		p1.add(b1[9]);
		p1.add(nulbutton);
		
		p1.add(decbutton);
		p1.add(b1[0]);
		p1.add(equbutton);
		p1.add(divbutton);
		
		this.add(negbutton);
		this.add(clrbutton);
		this.add(delbutton);
		this.add(p1);
		this.setLocationRelativeTo(null);//프레임이 중앙에나타나지 않게함
		this.add(f1);
		this.setVisible(true);
	}
	 @Override
	    public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b1[1]) {
			 f1.setText("1");
			 }
	 }

	public static void main(String[] args) {
		CalculactorTest c1=new CalculactorTest();
	}

}
