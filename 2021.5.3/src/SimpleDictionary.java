
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
	JButton add=new JButton("추가");
	JButton del=new JButton("삭제");
	JButton serach=new JButton("검색");
	Properties prop;
	private String file="dict.props";
	
	//한영사전 : 한글단어와 대응되는 영어단어의 쌍을 저장 
	
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
				JOptionPane.showMessageDialog(this,"단어를 찾을 수없습니다", key,JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(this,value+"입니다", key,JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(temp==add){
			String value=JOptionPane.showInputDialog(this,key+" 에 대응 하는 단어를 입력 하세요");
			if(0==key.trim().length())return;
			JOptionPane.showMessageDialog(this,"영어 단어가 추가 되었습니다", "성공",JOptionPane.INFORMATION_MESSAGE);
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
			System.out.println("지우기");
		}
		t1.setText("");
		t1.requestFocus();
	}
	
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.add(new SimpleDictionary());
		f1.setTitle("나의 한영 사전");
		f1.setLocation(500,300);
		f1.setResizable(false);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
	}


}
