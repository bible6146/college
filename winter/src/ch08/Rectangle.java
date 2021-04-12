package ch08;

import java.util.Arrays;

public class Rectangle implements Comparable{

	private int width;
	private int heigt;
	
	public Rectangle(int a,int b) {
		this.heigt=b;
		this.width=a;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigt=" + heigt + "]";
	}

	@Override
	public int compareTo(Object o) {
		Rectangle other=(Rectangle)o;
		int result=this.getWidth()-other.getWidth();
		return result;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigt() {
		return heigt;
	}
	public void setHeigt(int heigt) {
		this.heigt = heigt;
	}
	public static void main (String[] agrs) {
		Rectangle[] r=new Rectangle[3];
		r[0]=new Rectangle(10,10);
		r[1]=new Rectangle(11,12);
		r[2]=new Rectangle(9,9);
		
		Arrays.sort(r);
		
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]);
		}
		
		
		
		
		
//		Rectangle r1=new Rectangle(10,10);
//		Rectangle r2=new Rectangle(9,9);
//		int a=r1.compareTo(r2);
//		
//		if(a<0) {
//			System.out.println("두번째게 더큽니다");
//		}
//		if(a==0) {
//			System.out.println("같습니다");
//		}
//		else {
//			System.out.println("첫번째게 더큽니다");
//		}
		
	}
	
}
