package winter;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class keyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public keyEventTest() {
		panel=new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하세요"));
		field=new JTextField(30);
		panel.add(field);
		
		area =new JTextArea(3,30);
		field.addKeyListener(this);
		
		this.add(panel,BorderLayout.NORTH);
		this.add(area,BorderLayout.CENTER);
		
		this.setSize(400,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		keyEventTest e1=new keyEventTest();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "keyType");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "keyType");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "keyType");
		
	}
	private void display(KeyEvent e,String s) {
		char c=e.getKeyChar();
		int keycode=e.getKeyCode();
		area.append(c+" "+keycode);
	}

}
