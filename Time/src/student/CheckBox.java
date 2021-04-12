package student;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox extends JFrame implements ItemListener {
	JCheckBox[] button=new JCheckBox[3];
	JPanel pa1=new JPanel();
	JLabel[] la=new JLabel[3];
	
	public CheckBox() {
		for(int i=0;i<3;i++) {
			button[i]=new JCheckBox();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}
	public static void main(String[] args) {
		
		
	}

}
