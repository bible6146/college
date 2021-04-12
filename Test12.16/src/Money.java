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
      System.out.println("좌표는 : (" + x + " , " + y + ") 크기는 : " + width + " * " + height);
   }

   public boolean contains(Money r) {
      if (r.x > x && r.y < y && x + width > r.x + r.width && y - height < r.y - r.height)
         return true;
      else
         return false;
   }
// 좌표(한 점 , 한 좌표) 에 가로길이 세로길이를 더한다는 의미 
   public static void main(String[] args) {

      Money r = new Money(2, 2, 8, 7);
      Money s = new Money(2, 5, 6, 6);
      Money t = new Money(1, 6, 10, 10);

      r.show();
      System.out.println("s의 면적은 " + s.square());

      if (t.contains(r))
         System.out.println("t는 r을 포함한다.");
      if (t.contains(s))
         System.out.println("t는 s을 포함한다.");
   }
}