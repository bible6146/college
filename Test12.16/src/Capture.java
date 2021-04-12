import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Capture extends JFrame{
	Rectangle rect=new Rectangle(0,0);
	JButton button = new JButton("click");
	JTextField t1=new JTextField("x��ǥ");
	JTextField t2=new JTextField("y��ǥ");
	JTextField t3=new JTextField("���α���");
	JTextField t4=new JTextField("���α���");
	int index=0;
	Dimension d;
	BufferedImage image;
	int x,y,i,j;
	public Capture() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tryDraw();
				
			}
		});
		this.add(new panel(),BorderLayout.CENTER);
		JPanel panel2=new JPanel();
		panel2.add(t1);
		panel2.add(t2);
		panel2.add(t3);
		panel2.add(t4);
		this.add(panel2,BorderLayout.SOUTH);
		this.setSize(d = new Dimension(500, 500));	
		this.add(button, BorderLayout.NORTH);
		this.setVisible(true);
		
	}
   public static void main(String[] args) {
      new Capture();
   }
   
   public void tryDraw() {
	   if(t1.getText().equals("x��ǥ")) {
		   x=0;
		   y=0;
		   i=300;
		   j=300;
		   System.out.println("�ϰ� �Է� �����پ˾Ҵ� �̳��");
	   }
	   else {
		   x=Integer.parseInt(t1.getText());
		   y=Integer.parseInt(t2.getText());
		   i=Integer.parseInt(t3.getText());
		   j=Integer.parseInt(t4.getText());
	   }
	   
	   rect = new Rectangle(x+i ,y+j);
	   try {
	          Robot robot = new Robot();
	          image = robot.createScreenCapture(rect);
	          this.repaint();
	         // File file= new File("C:\\Users\\jungse\\Desktop\\ĸ��\\"+index);
	         // ImageIO.write(image, "jpg", file);
	          index++;
	       }catch(Exception ex) {
	          ex.printStackTrace();
	       }
   }
   class panel extends JPanel{
	   @Override
       public void paintComponent(Graphics g) {
		   //g.drawImage(image, 0, 0, d.width, d.height, this);
		   g.drawImage(image, 0, 0,d.width, d.height,x, y, rect.width, rect.height, this);
	   }
	   
   }

   
}