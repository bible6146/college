
public class Sing {
	
	String t;
	String a;
	int y;
	String c;
	
	Sing(String t,String a,int y,String c){
		this.t=t;
		this.a=a;
		this.y=y;
		this.c=c;
	}
	Sing(){
		this.t="�뷡";
		this.a="������";
		this.y=2020;
		this.c="����";
	}
	
	void show() {
		System.out.println(y+"��"+c+"������"+
	a+"���θ�"+t+"�Դϴ�");
	}
	
	public static void main(String[] args) {
		Sing me=new Sing("Dansing Qeen","ABBA",1978,"������");
		me.show();
		Sing my=new Sing();
		my.show();
		
	}
}
