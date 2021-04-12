package adstract;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//도전 과제 해보기
public class Count2 extends JFrame implements ActionListener {
	
	JLabel la;
	JButton bu;
	JLabel la2;
	
	public Count2() {
		la=new JLabel("0 0 0");
		la.setFont(new Font("Serif", Font.BOLD, 100));
		bu=new JButton("스핀");
		bu.addActionListener(this);
		this.add(la,BorderLayout.CENTER);
		this.add(bu,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,500);
		this.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random ra=new Random();
		int[] a=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=ra.nextInt(9)+1;
			}
		if(a[0]==a[1]&&a[1]==a[2]) {
			la.setText("Game Over");
		}
		
		la.setText(a[0]+" "+a[1]+" "+a[2]);
		
		
	}
	public static void main(String[] args) {
		new Count2();
	}

}
