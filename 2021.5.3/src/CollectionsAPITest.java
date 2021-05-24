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
		
		//대소문자 구별없이 알파벳 순으로 정렬 되도록 하시오
		List<String> list=Arrays.asList(sample);
//		Collections.sort(list,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.toUpperCase().compareTo(o2.toUpperCase());
//			}
//		});
//		Collections.sort(list,(a,b)->a.toUpperCase().compareTo(b.toUpperCase()));

		Collections.sort(list,(a,b)->a.compareToIgnoreCase(b));//대소문자 구별 안하고 정렬 하는메소드
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
		//수만개의 정수 원소를 가진 리스트에서 내가 찾고자 하는값
		//예를 들면 123이 있는지, 어디에 있는지 찾고자 한다 어떻게 해야하나?
		//만약에 리스트의 원소가 정렬 되어있다면 
		//만개의 원소에서 내가 원하는 값 찾기를 할때 최대 몆번의 비교를 해야할까?
		
		//이진 탐색을 하기 위한 대전제 조건은?
		//리스트의 원소가 정렬되어 있어야 한다.
		
	
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
//		System.out.println(list);
//		Collections.shuffle(list);//셔플하면 바이너리 서치 안됨
//		int idx=Collections.binarySearch(list, 7);
//		if(idx>=0) {
//			System.out.println(7+"은 "+idx+"에있습니다");
//		}
//		else System.out.println("없습니다");
		
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
		//le가 ri 이하인 동안 다음을 반복
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
	//List<Integer>는 List<Object>의 후손이 아님
	//LinkedList<Object>는 
	public static <T> int MybinarySearch2(List<? extends Comparable> list,T key) {
		int le=0;
		int ri=list.size()-1;
		//le가 ri 이하인 동안 다음을 반복
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









