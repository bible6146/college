package adstract;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculate2 extends JFrame implements ActionListener{
	private JTextField textField;
	private JPanel panel;
	private JButton[] number;
	private JButton addButton, subButton, mulButton, divButton, decButton, 
	equButton, delButton, clrButton, negButton;
	private Font font= new Font(Font.SANS_SERIF, Font.BOLD, 30);
	
	public Calculate2() {
		this.setTitle("Calculate2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,550);
		this.setLayout(null);
		
		textField=new JTextField();
		textField.setBounds(50,25,300,50);
		textField.setFont(font);
		textField.setEditable(false);
		
		panel=new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		number =new JButton[10];
		for(int i=0;i<number.length;i++) {
			number[i]=new JButton(String.valueOf(i));
			 number[i].setFocusable(false);
			 number[i].setFont(font);
			 number[i].addActionListener(this);
		}
		 addButton = new JButton("+");
	        addButton.setFocusable(false);
	        addButton.setFont(font);
	        addButton.addActionListener(this);

	        subButton = new JButton("-");
	        subButton.setFocusable(false);
	        subButton.setFont(font);
	        subButton.addActionListener(this);

	        mulButton = new JButton("*");
	        mulButton.setFocusable(false);
	        mulButton.setFont(font);
	        mulButton.addActionListener(this);

	        divButton = new JButton("/");
	        divButton.setFocusable(false);
	        divButton.setFont(font);
	        divButton.addActionListener(this);

	        decButton = new JButton(".");
	        decButton.setFocusable(false);
	        decButton.setFont(font);
	        decButton.addActionListener(this);

	        equButton = new JButton("=");
	        equButton.setFocusable(false);
	        equButton.setFont(font);
	        equButton.addActionListener(this);


	        delButton = new JButton("Delete");
	        delButton.setFocusable(false);
	        delButton.setBounds(150, 430, 100, 50);
	        delButton.setFont(font);
	        delButton.addActionListener(this);


	        clrButton = new JButton("Clear");
	        clrButton.setFocusable(false);
	        clrButton.setBounds(250, 430, 100, 50);
	        clrButton.setFont(font);
	        clrButton.addActionListener(this);


	        negButton = new JButton("(-)");
	        negButton.setFocusable(false);
	        negButton.setBounds(50, 430, 100, 50);
	        negButton.setFont(font);
	        negButton.addActionListener(this);


	        panel.add(number[1]);
	        panel.add(number[2]);
	        panel.add(number[3]);
	        panel.add(addButton);

	        panel.add(number[4]);
	        panel.add(number[5]);
	        panel.add(number[6]);
	        panel.add(subButton);

	        panel.add(number[7]);
	        panel.add(number[8]);
	        panel.add(number[9]);
	        panel.add(mulButton);

	        panel.add(decButton);
	        panel.add(number[0]);
	        panel.add(equButton);
	        panel.add(divButton);
	        
	        this.add(negButton);
	        this.add(clrButton);
	        this.add(delButton);
	        this.add(panel);
	        this.add(textField);
	        this.setResizable(false);
	        this.setLocationRelativeTo(null); // frame이 화면 중앙에 나타나도록 함.
	        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<number.length;i++) {
			if(e.getSource()==number[i]) {
				System.out.println(i+"버튼이 클릭되었습니다.");
				String str= textField.getText();
				textField.setText(str.concat(String.valueOf(i)));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Calculate2 c1=new Calculate2();

	}

}
