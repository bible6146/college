package honja;

public class SafeArray {
	private int a[];
	private int length;
	
	public SafeArray(int size) {
		a=new int[size];
		length=size;
	}
	public void get(int index) {
		if(index>=0&&index<length) {
			System.out.println(a[index]);
		}
		else System.out.println("잘못된 인덱스");
	}
	public void put(int index,int value) {
		if(index>=0&&index<length) {
			a[index]=value;
		}
		else System.out.println("잘못된 인덱스");
	}
	public static void main(String[] args) {
		SafeArray s1=new SafeArray(4);
		for(int i=0;i<10;i++) {
			s1.put(i, i+3);
		}
//		for(int i=0;i<s1.length;i++) {
//			System.out.println(s1.a[i]);
//		}
		for(int i:s1.a) {
			System.out.println(i);
		}
	}
}
