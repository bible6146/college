public class mytv {
	
	private String where;
	private int when;
	private int inch;
	
	mytv(){
		where="�߱���";
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
				where+"��������"+when+"�⵵"
				+inch+"��ġ Ƽ���Դϴ�");
		}
}


