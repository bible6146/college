
public class Box {
	int x;
	int y;
	int w;
	int h;
	Box(int a,int b,int c,int d) {
		x=a;
		y=b;
		w=c;
		h=d;
	}
	boolean gogo(int a,int b,int c,int d){
		if (a > x && b < y && x + w > a + c && y - h < b - d)
	         return true;
	      else
	         return false;
	   }

	int square(){
		return w*h;
	}
	
	void show(){
		System.out.println("r�� ������"+(w*h)+"�Դϴ�");
	}
	
	public static void main(String[] args) {
		Box r = new Box(2, 2, 8, 7);
		Box s = new Box(2, 5, 6, 6);
		Box t = new Box(1, 6, 10, 10);

		r.show();
		System.out.println("s�� ������ "+ s.square());
		if(t.gogo(r.x,r.y,r.w,r.h)) System.out.println("t�� r�� �����Ѵ�.");
		if(t.gogo(s.x,s.y,s.w,s.h))	System.out.println("t�� s�� �����Ѵ�.");
	}

}
