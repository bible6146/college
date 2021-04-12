package adstract;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Result extends JFrame{
	public Result(String agrVar) {
		String str;
		JLabel j=new JLabel();
		if(agrVar.equals(" "))str="무승부 입니다";
		else if(agrVar.equals("O"))str="첫번째 경기자가 이김";
		else str="두번째 경기자가 이김";
		j.setText(str);
		j.setHorizontalAlignment(JLabel.CENTER);
		this.setBackground(new Color(100,100,150));
		j.setFont(new Font("Serif", Font.BOLD, 20));
		JButton bu=new JButton("다시하기");
		bu.addActionListener((e)->{
			this.disable();
			new TicToc();});
		this.add(bu,BorderLayout.SOUTH);
		this.add(j,BorderLayout.CENTER);
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		

	}

}
