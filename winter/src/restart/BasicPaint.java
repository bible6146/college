package restart;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(new MyPanelBasicPaint());
      f.setSize(300, 200);
      f.setVisible(true);
   }

}

class MyPanelBasicPaint extends JPanel {

   private int x = 50;
   private int y = 50;
   private int w = 20;
   private int h = 20;

   public MyPanelBasicPaint() {
      
      setBorder(BorderFactory.createLineBorder(Color.black)); // 프레임에 라인이 생김 (전체 판);

      this.addMouseListener(new MouseAdapter() {
         
         @Override
         public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            moveSquare(e.getX(), e.getY());
            System.out.println("bell");
         }
      });
      
      this.addMouseMotionListener(new MouseAdapter() {
         @Override
         public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            moveSquare(e.getX(), e.getY());
            System.out.println("bell");
         }
      });
   }
   
   private void moveSquare(int x, int y) {
      int offset = 1;
      if(this.x != x ||  this.y != y) {
     //    repaint(x+ offset, y+ offset ,w  , h );
         this.x = x;
         this.y = y;
         
         repaint(x+ offset, y+ offset ,w  , h );
      }
   }
   
   @Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("클릭시 사각형 생성", 10, 20);
      g.setColor(Color.red);
      g.fillRect(x, y, w, h);
      g.setColor(Color.black);
      g.drawRect(x, y, w, h);
      
   }
}