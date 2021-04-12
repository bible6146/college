package ch08;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	private JPanel panel;
	private JTextField field;
	private JButton[] button;
	private String[] label= {
			"back space","","","CE","C",
			"7","8","9","/","sqrt",
			"4","5","6","x","%",
			"1,","2","3","-","1/x",
			"0","+/-",".","+","=",
	};
	
	public Calculator() {
		panel=new JPanel();
		field=new JTextField();
		field.setText("0.");
		field.setEnabled(false);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		button=new JButton[25];
		
		
	}
}
