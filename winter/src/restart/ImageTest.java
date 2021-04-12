package restart;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest extends JPanel {
	private BufferedImage img;
	BufferedImage[] all=new BufferedImage[16]; 
	public ImageTest() {
		try{
			img=ImageIO.read(new File("C:\\Users\\jungse\\Downloads\\gal.jfif"));
		}catch(IOException e) {
			System.exit(1);
		}
		//all[0]=img.get
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,null);
	}
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageTest pan=new ImageTest();
		f.setSize(pan.img.getHeight(),pan.img.getWidth());
		f.add(pan);
		f.setVisible(true);
		
	}

}
