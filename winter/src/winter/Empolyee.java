package winter;

public class Empolyee {
	private String name;
	private int sale;
	public static int count;
	
	public Empolyee(String name,int sale) {
		this.name=name;
		this.sale=sale;
		count++;
		
	}
	public Empolyee() {
		this("¾Æ¹«°³",0);
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
	public static int goCount() {
		return count;
	}
	

}
