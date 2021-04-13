import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class phoneNuberHash {
	public static boolean solution(String[] phone_book) {
		Map<String,Integer> map = new HashMap<>();

		Arrays.sort(phone_book,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		int x = phone_book[0].length();
		int y = phone_book[phone_book.length - 1].length();
		
		int temp=0;
		int max=0;
		for(int i=x-1;i<y;i++) {
			for(int j=0;j<phone_book.length;j++) {
				if(phone_book[j].length()>i) {
					System.out.println(phone_book[j]);
					if(max==0) {
						max=phone_book[j].length();
					}
					if(map.isEmpty()||!map.containsKey(phone_book[j].substring(0,max))) {
						map.put(phone_book[j].substring(0), max);
					}
					else {
						if(map.get(phone_book[j].substring(0,max))!=phone_book[j].length()) {
							return false;
						}
					}
					
				}
			}
	
			temp=max;
			max=0;
			map.clear();
			
		}
		
		
		boolean answer = true;
		return answer;
	}
public static void main (String agrs[]) {
	String[] a={"12", "123", "1235", "567", "88"};
	System.out.println(solution(a));
//	tesst1();
}






}
