package winter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Keypad extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField text;
	
	public Keypad() {
		text=new JTextField(20);
		this.add(text,BorderLayout.NORTH);
		panel=new JPanel();
		panel.setLayout(new GridLayout(3,3));
		
		
		for(int i=1;i<=9;i++) {
			JButton button=new JButton(String.valueOf(i));
			button.setPreferredSize(new Dimension(100,100));
			button.addActionListener(this);
			panel.add(button);
		}
		this.add(panel,BorderLayout.CENTER);
		this.pack();//�� �����ӿ� �°� �����������ض�
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();//�׼��� Ŭ���� ��ü�� ���ڿ���ȯ
		text.setText(text.getText()+str);
	}
	public static void main(String[] args) {
		Keypad k1=new Keypad();

	}


}
