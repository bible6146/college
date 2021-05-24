import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsAPITest {
	public static void main(String agrs[]) {
//		sortTest();
//		shuffleTest();
		binarySearch();
//		MybinarySearch();
	}
	public static void sortTest() {
		String[] sample= {"i","walk","the","Line"};
	
//		Arrays.sort(sample);
//		for(int i=0;i<sample.length;i++) {
//			System.out.print(sample[i]+" ");
//		}
		
		//��ҹ��� �������� ���ĺ� ������ ���� �ǵ��� �Ͻÿ�
		List<String> list=Arrays.asList(sample);
//		Collections.sort(list,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.toUpperCase().compareTo(o2.toUpperCase());
//			}
//		});
//		Collections.sort(list,(a,b)->a.toUpperCase().compareTo(b.toUpperCase()));

		Collections.sort(list,(a,b)->a.compareToIgnoreCase(b));//��ҹ��� ���� ���ϰ� ���� �ϴ¸޼ҵ�
		System.out.println(list);
	}
	public static void shuffleTest() {
		ArrayList<Integer> list =new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
	}
	public static void binarySearch() {
		//�������� ���� ���Ҹ� ���� ����Ʈ���� ���� ã���� �ϴ°�
		//���� ��� 123�� �ִ���, ��� �ִ��� ã���� �Ѵ� ��� �ؾ��ϳ�?
		//���࿡ ����Ʈ�� ���Ұ� ���� �Ǿ��ִٸ� 
		//������ ���ҿ��� ���� ���ϴ� �� ã�⸦ �Ҷ� �ִ� �p���� �񱳸� �ؾ��ұ�?
		
		//���� Ž���� �ϱ� ���� ������ ������?
		//����Ʈ�� ���Ұ� ���ĵǾ� �־�� �Ѵ�.
		
	
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
//		System.out.println(list);
//		Collections.shuffle(list);//�����ϸ� ���̳ʸ� ��ġ �ȵ�
//		int idx=Collections.binarySearch(list, 7);
//		if(idx>=0) {
//			System.out.println(7+"�� "+idx+"���ֽ��ϴ�");
//		}
//		else System.out.println("�����ϴ�");
		
//		System.out.println(MybinarySearch(list,4));
		ArrayList<String> list2 =new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("h");
		list2.add("i");
		list2.add("j");
		
		System.out.println(MybinarySearch2(list2,"e"));
		
	}
	public static int MybinarySearch(List<Integer> list,Integer key) {
		int le=0;
		int ri=list.size()-1;
		//le�� ri ������ ���� ������ �ݺ�
		//mid= le+re/2 if(list.get(mid)==key) retrun mid
		//else if(list.get(mid)>key){
		
		while(le<=ri) {
			int mid=(le+ri)/2;
			if(list.get(mid)==key)return mid;
			else if(list.get(mid)>key) {
				ri=mid-1;
			}
			else {
				le=mid+1;
			}
		}
		
		return le*(-1);
		
	}
//	public static <T extends Comparable<T>> int MybinarySearch3(List<T> list,T a) {
//		return 0;
//		
//	}
	//List<Integer>�� List<Object>�� �ļ��� �ƴ�
	//LinkedList<Object>�� 
	public static <T> int MybinarySearch2(List<? extends Comparable> list,T key) {
		int le=0;
		int ri=list.size()-1;
		//le�� ri ������ ���� ������ �ݺ�
		//mid= le+re/2 if(list.get(mid)==key) retrun mid
		//else if(list.get(mid)>key){
		
		while(le<=ri) {
			int mid=(le+ri)/2;
			if(list.get(mid)==key)return mid;
			else if(list.get(mid).compareTo(key)>0) {
				ri=mid-1;
			}
			else {
				le=mid+1;
			}
		}
		
		return le*(-1);
		
	}
	
}









