package honja;

interface Empolyable{
	String getname();
	
	static boolean isEmpty(String str) {//�������̽��� ���� �޼ҵ带 �������� ��ӹ޴� Ŭ������ �������� �ʾƵ� ��밡��
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
			throw new RuntimeException("�̸��� �ݵ�� �Է��ؾ���");
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
