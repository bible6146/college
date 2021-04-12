package winter;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

class a{
	int x,y,width,height;
	public a(int q,int w,int e,int r) {
		this.x=q;
		this.y=w;
		this.width=e;
		this.height=r;
	}
	public a() {
		this.x=0;
		this.y=0;
		this.width=0;
		this.height=0;
	}
}
class Panel1 extends JPanel implements MouseListener{
	int x,y;
	int index=0;
	a[] all=new a[100];
	ArrayList<a> ull=new ArrayList<>();
	a ka=new a();
	
	public Panel1() {
		this.addMouseListener(this);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawRect(ka.x,ka.y, ka.width, ka.height);
//		for(a i:all) {
//			if(i!=null)
//			g.drawRect(i.x, i.y, i.width, i.height);
//		}
//		for(a i:ull) {
//			g.drawRect(i.x, i.y, i.width, i.height);
//		}
//		if(ull.size()>0)
//		g.drawRect(ull.get(ull.size()-1).x,ull.get(ull.size()-1).y,
//				ull.get(ull.size()-1).width, ull.get(ull.size()-1).height);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//all[index]=new a(e.getX(),e.getY(),50,50);
		//ull.add(new a(e.getX(),e.getY(),50,50));
		//index++;
//		ka= {
//				this.x=e.getX();
//				this.y=w;
//				this.width=e;
//				this.height=r;
//		};
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
	}
	
}


public class Draw extends JFrame{
	public Draw() {
		this.setSize(500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new Panel1());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Draw();

	}

}
