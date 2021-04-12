
public class Grade {

	int math;
	int gahak;
	int english;
	Grade(int a,int b,int c){
		math=a;
		gahak=b;
		english=c;
	}
	
	int average(){
		return (math+gahak+english)/3;
	}
}
