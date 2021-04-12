//package adstract;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class Calculator extends JFrame implements ActionListener {
//	private JPanel j1;
//	private JButton[] b1;
//	private JTextField t1;
//	private String[] s1= {
//			"backspace","","","ce","C",
//			"7,","8","9","/","sqrt",
//			"4","5","6","x","%",
//			"1","2","3","-","1/x",
//			"0","+/-",".","+","=",
//	};
//	public Calculator() {
//		j1=new JPanel();
//		t1=new JTextField(35);
//		t1.setText("0.");
//		t1.enable(false);
//		
//		j1.setLayout(new GridLayout(0,5,3,3));
//		b1=new JButton[25];
//		int index=0;
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				b1[index]=new JButton(s1[index]);
//				if(j>=3) {
//					b1[index].setForeground(Color.red);
//				}
//				else b1[index].setForeground(Color.blue);
//				b1[index].setBackground(Color.yellow);
//				j1.add(b1[index]);
//				index++;
//				}
//		}
//		this.add(t1,BorderLayout.NORTH);
//		this.add(j1,BorderLayout.CENTER);
//		this.setVisible(true);
//		this.pack();
//	}
//	@Override// 상속받아서 무조건 구현 해야함
//	public void actionPerformed(ActionEvent e) {
//	}
//	
//	public static void main(String[] args) {
//		Calculator c1=new Calculator();
//		
//	}
//}
