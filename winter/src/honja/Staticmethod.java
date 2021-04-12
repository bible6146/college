package honja;

interface Empolyable{
	String getname();
	
	static boolean isEmpty(String str) {//인터페이스에 정적 메소드를 만듬으로 상속받는 클래스가 구현하지 않아도 사용가능
		if(str==null||str.trim().length()==0)
			return true;
		else {
			return false;
		}
		}
}
class Employe implements Empolyable{
	private String name;
	
	public Employe(String str){
		if(Empolyable.isEmpty(str)==true) {
			throw new RuntimeException("이름은 반드시 입력해야함");
		}
		this.name=str;
	}
	
	@Override
	public String getname() {
		
		return name;
	}
	
}

public class Staticmethod {

	public static void main(String[] args) {
		Employe w1=new Employe("   ");
		System.out.println(w1.getname());
		
	}

}
