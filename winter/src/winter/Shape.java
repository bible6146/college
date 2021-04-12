package winter;

public class Shape {
	private int x;
	private int y;
	
	
	public Shape(int x,int y) {
		System.out.println("Shape()");
		this.x=x;
		this.y=y;
	}
	public Shape() {
		this(0,0);
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	

	
}

	

