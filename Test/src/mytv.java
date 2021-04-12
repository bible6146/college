public class mytv {
	
	private String where;
	private int when;
	private int inch;
	
	mytv(){
		where="중국산";
		when=0000;
		inch=28;
	}
	mytv(String a,int b, int c){
		where=a;
		when=b;
		inch=c;
	}
	void show(){
		 System.out.println(
				where+"에서만든"+when+"년도"
				+inch+"인치 티비입니다");
		}
}


