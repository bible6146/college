package winter;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Puzzle2 extends JFrame implements ActionListener{
	private JButton[][] b1;
	private JButton reset;
	private JPanel p1;
	
	public Puzzle2() {
		b1=new JButton[3][3];
		reset=new JButton("reset");
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Random ra=new Random();
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						int a=ra.nextInt(3);
						int b=ra.nextInt(3);
						String str=b1[i][j].getText();
						b1[i][j].setText(b1[a][b].getText());
						b1[a][b].setText(str);
						
					}
				}
				
			}
		});
		p1=new JPanel();
		set(b1);
		p1.setLayout(new GridLayout(0,3,2,2));
		this.add(p1);
		this.add(reset,BorderLayout.SOUTH);
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Puzzle2 pu=new Puzzle2();

	}

	void set(JButton[][] a) {
		Random r1=new Random();
		int[] random=new  int[9];
		int[] randomcopy=new int[9];
		for(int i=0;i<9;i++) {
			int ay=r1.nextInt(9);
			if(randomcopy[ay]==0) {
				random[i]=ay+1;
				randomcopy[ay]=1;
			}
			else i--;
		}
		for(int i=0,k=0;i<3;i++) {
			for(int j=0;j<3;j++,k++) {
				if(random[k]!=9) {
					a[i][j]=new JButton(String.valueOf(random[k]));
					a[i][j].addActionListener(this);
					p1.add(a[i][j]);
				}
				else {
					a[i][j]=new JButton(" ");
					a[i][j].addActionListener(this);
					p1.add(a[i][j]);
				}
			
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton a=(JButton)e.getSource();
		String str=a.getText();
		int i=0,j=0;
		loop:
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if((b1[i][j].getText()).equals(str)) {
					break loop;
				}
			}
		}
		if(j-1>=0&&(b1[i][j-1].getText()).equals(" ")) {
			b1[i][j].setText(" ");
			b1[i][j-1].setText(str);
		}
		else if(j+1<=2&&(b1[i][j+1].getText()).equals(" ")) {
			b1[i][j].setText(" ");
			b1[i][j+1].setText(str);
		}
		else if(i-1>=0&&(b1[i-1][j].getText()).equals(" ")) {
			b1[i][j].setText(" ");
			b1[i-1][j].setText(str);
		}
		else if(i+1<=2&&(b1[i+1][j].getText()).equals(" ")) {
			b1[i][j].setText(" ");
			b1[i+1][j].setText(str);
		}
		else System.out.println("잘못클릭함");;
		//if(check[var1-1][var2-1].equals(" "))System.out.println("버튼누름");
		
	}
	
	
	
	
	
	
	
	
}
