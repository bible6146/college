package honja;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class KeyPad extends JFrame implements KeyListener {
	private JTextField t1;
	private JTextArea t2;
	private JLabel l;
	private JPanel p;
	
	public KeyPad() {
		p=new JPanel();
		t1=new JTextField(10);
		t1.addKeyListener(this);
		t2=new JTextArea(3,30);
		l=new JLabel("문자를 입력하세요");
		p.add(l);
		p.add(t1);
		//p.add(t2);
		this.add(p,BorderLayout.NORTH);
		this.pack();
		//this.add(t2,BorderLayout.NORTH);
		this.add(t2,BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,200);
		
	}
	
	
	public static void main(String[] args) {
		KeyPad k=new KeyPad();

	}


	@Override
	public void keyTyped(KeyEvent e) {
		disPlay(e);
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void disPlay(KeyEvent e) {
		t2.append(String.valueOf(e.getKeyChar()));
	}

}
