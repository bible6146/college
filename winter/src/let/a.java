package let;

public class a{
	  int value=0;
	  void printtttt(a ctr) {//메소드=함수 함수 {리턴 이름(받는값타입(int,double,String) 함수내에서 사용할변수이름)}
//	      ctr.value=ctr.value+1;
		  // return 0;
	      }
	   }
	class Test{
	   public static void main(String args[]) {
	      a obj=new a();
	      a a2=new a();
	      System.out.println("obj.value = "+obj.value);
	      obj.printtttt(a2);
	      a2.printtttt(obj);
	      
	      System.out.println("obj.value = "+obj.value);
	   }
	}