
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
		this.t="노래";
		this.a="김정세";
		this.y=2020;
		this.c="나라";
	}
	
	void show() {
		System.out.println(y+"년"+c+"국적의"+
	a+"가부른"+t+"입니다");
	}
	
	public static void main(String[] args) {
		Sing me=new Sing("Dansing Qeen","ABBA",1978,"스웨덴");
		me.show();
		Sing my=new Sing();
		my.show();
		
	}
}
