package let;

public class a{
	  int value=0;
	  void printtttt(a ctr) {//�޼ҵ�=�Լ� �Լ� {���� �̸�(�޴°�Ÿ��(int,double,String) �Լ������� ����Һ����̸�)}
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