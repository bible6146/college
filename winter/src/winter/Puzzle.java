package winter;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Puzzle extends JFrame{
	JButton[][] bu;
	JButton[][] copy;
	JButton reset;
	JPanel p;
	
	public Puzzle() {
		p=new JPanel();
		bu=new JButton[3][3];
		copy=new JButton[3][3];
		reset=new JButton(" reset ");
		sulf(bu, copy);
		p.setLayout(new GridLayout(0,3,2,2));
		this.add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		Puzzle pi=new Puzzle();

	}
void sulf(JButton[][] b1,JButton[][] b2) {
	Random r1=new Random();
	int[] random=new  int[9];
	int[] randomcopy=new int[9];
	for(int i=0;i<9;i++) {
		int a=r1.nextInt(9);
		if(randomcopy[a]==0) {
			random[i]=a+1;
			randomcopy[a]=1;
		}
		else i--;
	}
	
	for(int i=0,k=0;i<3;i++,k++) {
		for(int j=0;j<3;j++,k++) {
			b1[i][j]=new JButton();
			copy[i][j]=new JButton();
			if(random[k]!=9) {
			b1[i][j].setText(String.valueOf(random[k]));
			copy[i][j].setText(String.valueOf(k));
			p.add(b1[i][j]);
			}
			else {
				b1[i][j].setText(" ");
				copy[i][j].setText(" ");
				p.add(b1[i][j]);
				}	
			}
		}
		 
	}
}

