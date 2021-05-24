
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleDictionary extends JPanel implements ActionListener{
	JTextField t1=new JTextField(40);
	JButton add=new JButton("�߰�");
	JButton del=new JButton("����");
	JButton serach=new JButton("�˻�");
	Properties prop;
	private String file="dict.props";
	
	//�ѿ����� : �ѱ۴ܾ�� �����Ǵ� ����ܾ��� ���� ���� 
	
	private Map<String,String> dict=new HashMap<>();
	
	public SimpleDictionary () {
		
		this.add(t1);
		this.add(add);
		this.add(serach);
		this.add(del);
		
		
		add.addActionListener(this);
		serach.addActionListener(this);
		del.addActionListener(this);
		
		this.setPreferredSize(new Dimension(600,50));
		buildDictionary();
	}
	private void buildDictionary() {
		prop=new Properties();
		try(FileReader reader=new FileReader(file)){
			prop.load(reader);	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		Set<Object> set=prop.keySet();
		
		for(Object s: set) {
			Object value=prop.get(s);
			dict.put((String)s,(String) value);
			dict.put((String) value,(String)s);
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp=(JButton)e.getSource();
		String key=t1.getText();
		String sum=dict.get(key);
		if(0==key.trim().length())return;
		
		
		if(temp==serach) {
			String value=dict.get(key);
			if(value==null) {
				JOptionPane.showMessageDialog(this,"�ܾ ã�� �������ϴ�", key,JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this,value+"�Դϴ�", key,JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(temp==add){
			String value=JOptionPane.showInputDialog(this,key+" �� ���� �ϴ� �ܾ �Է� �ϼ���");
			if(0==key.trim().length())return;
			JOptionPane.showMessageDialog(this,"���� �ܾ �߰� �Ǿ����ϴ�", "����",JOptionPane.INFORMATION_MESSAGE);
			prop.put(key, value);
			try(PrintWriter out=new PrintWriter(file)){
				prop.store(out, "My Dictionary");
			}catch(Exception e1){
				System.out.println(e1.getMessage());
			}
			dict.put(key, value);
			dict.put(value,key);
		}
		else if(temp==del) {
			dict.remove(dict.get(key));
			dict.remove(key);
			prop.clear();
			Set<String> set=dict.keySet();
			for(String s:set) {
				prop.put(s,dict.get(s));
			}
			
			try(PrintWriter out=new PrintWriter(file)){
				prop.store(out, "My Dictionary");
			}catch(Exception e1){
				System.out.println(e1.getMessage());
				System.exit(1);
			}
			System.out.println("�����");
		}
		t1.setText("");
		t1.requestFocus();
	}
	
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.add(new SimpleDictionary());
		f1.setTitle("���� �ѿ� ����");
		f1.setLocation(500,300);
		f1.setResizable(false);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}


}
