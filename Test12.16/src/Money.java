import java.util.*;

public class Money {

   int x;
   int y;
   int width;
   int height;

   Money(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public int square() {
      int v = height * width;
      return v;
   }

   public void show() {
      System.out.println("��ǥ�� : (" + x + " , " + y + ") ũ��� : " + width + " * " + height);
   }

   public boolean contains(Money r) {
      if (r.x > x && r.y < y && x + width > r.x + r.width && y - height < r.y - r.height)
         return true;
      else
         return false;
   }
// ��ǥ(�� �� , �� ��ǥ) �� ���α��� ���α��̸� ���Ѵٴ� �ǹ� 
   public static void main(String[] args) {

      Money r = new Money(2, 2, 8, 7);
      Money s = new Money(2, 5, 6, 6);
      Money t = new Money(1, 6, 10, 10);

      r.show();
      System.out.println("s�� ������ " + s.square());

      if (t.contains(r))
         System.out.println("t�� r�� �����Ѵ�.");
      if (t.contains(s))
         System.out.println("t�� s�� �����Ѵ�.");
   }
}