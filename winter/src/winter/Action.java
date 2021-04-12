package winter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Action extends JFrame{
	
	private JLabel label;
	private JButton button;
	private JPanel panel;

	public Action() {
		label=new JLabel("아직 버튼이 눌러지지않았습니다");
		button=new JButton("버튼입니다");
		panel=new JPanel();
		
		panel.add(button);
		panel.add(label);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setText("버튼이 눌려졌습니다");
				label.setText("버튼이 눌려졌습니다");
				
			}
		});
		this.add(panel);
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		Action a1=new Action();
	}

}
