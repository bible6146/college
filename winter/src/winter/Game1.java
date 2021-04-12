package winter;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
public class Game1 extends JFrame implements ActionListener{
	private JButton[] b;
	private JTextField t1;
	private JTextField t2;
	private JPanel p;
	
	public Game1() {
		b=new JButton[3];
		b[0]=new JButton("����");
		b[1]=new JButton("��");
		b[2]=new JButton("����");
		t1=new JTextField("�Ʒ��� ��ư�߿��� �ϳ��� Ŭ���Ͻÿ�");
		t2=new JTextField();
		p=new JPanel();
		p.setLayout(new GridLayout(0,3));
		for(int i=0;i<3;i++) {
			b[i].addActionListener(this);
			p.add(b[i]);
		}
		this.add(t1,BorderLayout.NORTH);
		this.add(p,BorderLayout.CENTER);
		this.add(t2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		Game1 g=new Game1();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Random ra=new Random();
		int j=ra.nextInt(3);
		int i;
		//String a=e.getSource();//getSource �޼ҵ�� �Ƹ� ��ü�� Ÿ��Ʋ�� ��ȯ �ϴµ�
		//String str=a.getText();//Text���� �߰� �����ʾƼ� getText�� �ǹ̾���
		for(i=0;i<3;i++) {
			if(e.getSource().equals(b[i])) {
				break;
			}
		}
		if(i==j)t2.setText("�����ϴ�");
		else if((i==0&&j==2)||(i==1&&j==0)||(i==2&&j==1)) {
			t2.setText("�̰���ϴ�");
		}
		else t2.setText("�����ϴ�");
		
		
		
	}

}
