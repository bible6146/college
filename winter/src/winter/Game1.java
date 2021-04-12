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
		b[0]=new JButton("바위");
		b[1]=new JButton("보");
		b[2]=new JButton("가위");
		t1=new JTextField("아래의 버튼중에서 하나를 클릭하시오");
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
		//String a=e.getSource();//getSource 메소드는 아마 객체의 타이틀을 반환 하는듯
		//String str=a.getText();//Text값을 추가 하지않아서 getText는 의미없음
		for(i=0;i<3;i++) {
			if(e.getSource().equals(b[i])) {
				break;
			}
		}
		if(i==j)t2.setText("비겼습니다");
		else if((i==0&&j==2)||(i==1&&j==0)||(i==2&&j==1)) {
			t2.setText("이겼습니다");
		}
		else t2.setText("졌습니다");
		
		
		
	}

}
