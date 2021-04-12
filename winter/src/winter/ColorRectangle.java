package winter;

public class ColorRectangle extends Rectangle{
	String color;
	public ColorRectangle(int x, int y, int width, int height,String color) {
		//super(x, y, width, height);
		this.color=color;
		System.out.println("colorRectangle");
		
	}
	public ColorRectangle() {
		this(0,0,0,0,"black");
	}
	public void getLink() {
		System.out.print("");
	}
	
	@Override
	public String toString() { 
		return super.toString()+"ColorRectangle [color=" + color + "]";
	}
		
	}

