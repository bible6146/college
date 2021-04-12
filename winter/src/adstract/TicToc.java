package adstract;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//dispose()
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicToc extends JFrame implements ActionListener{
	JButton[][] all;
	JPanel panel;
	int index=0;
	JLabel la;
	
	public TicToc(){
		Random ra=new Random();
		index=ra.nextInt(2);
		la=new JLabel("random Trun");
		panel=new JPanel();
		panel.setLayout(new GridLayout(3,3));
		all=new JButton[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				all[i][j]=new JButton(" ");
				all[i][j].addActionListener(this);
				panel.add(all[i][j]);
			}
		}
		la.setFont(new Font("Serif", Font.BOLD, 30));
		la.setForeground(new Color(25,255,0));
		la.setBackground(new Color(25,25,25));
		la.setHorizontalAlignment(JLabel.CENTER);//글자정렬
		la.setOpaque(true);//백그라운드 불투명도
		
		this.add(la,BorderLayout.NORTH);
		this.add(panel,BorderLayout.CENTER);
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean check=false;
		index++;
		String str=" ";
		if(index%2==0) {
			str="X";
			la.setText("O Turn");
		}
		else {
			str="O";
			la.setText("X Turn");
		}
		JButton go=(JButton)e.getSource();
		loop:
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(all[i][j].equals(go)&&go.getText().equals(" ")) {
				all[i][j].setText(str);
				break loop;
				}
			}
		}
		String var="X";
		loop1:
		for(int z=0;z<2;z++) {
			for(int k=0;k<3;k++) {
				for(int y=0;y<3;y++) {
					if((all[k][y].getText()).equals(var))check=true;
					else {
						check=false;
						break;
					}
				}
				if(check==true) {
					System.out.println("게임끝");
					this.dispose();
					new Result(str);
					break loop1;
				}
			}
			var="O";
		}

		var="X";
		loop2:
		for(int z=0;z<2;z++) {
			for(int k=0;k<3;k++) {
				for(int y=0;y<3;y++) {
					if((all[y][k].getText()).equals(var))check=true;
					else {
						check=false;
						break;
					}
				}
				if(check==true) {
					System.out.println("게임끝");
					this.dispose();
					new Result(str);
					break loop2;
				}
			}
			var="O";
		}
		
		var="X";
		loop:
		for(int z=0;z<2;z++) {
			for(int k=0;k<3;k++) {
				if(all[k][k].getText().equals(var))check=true;
				else {
					check=false;
					break;
				}
			}
			if(check) {
				System.out.println("게임끝");
				this.dispose();
				new Result(str);
				break loop;
			}
			var="O";
		}
		
		var="X";
		loop:
		for(int z=0;z<2;z++) {
			for(int k=0,j=2;k<3;k++,j--) {
				if((all[k][j].getText()).equals(var))check=true;
				else {
					check=false;
					break;
				}
			}
			if(check) {
				System.out.println("게임끝");
				this.dispose();
				new Result(str);
				break loop;
			}
			var="O";
		}
	
	}
	public void Color(String agrStr) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
			}
		}
		
	}
	public static void main(String[] args) {
		new TicToc();
	}

}
