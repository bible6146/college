import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		String[] str= {"To","ve","or","not","to","be","is","a","problem","to","to"};
		
		Map<String,Integer> map=new HashMap<>();
		
//		for(int i=0;i<str.length;i++) {
//			map.put(str[i], map.getOrDefault(str[i], 0)+1);
//		}
//		System.out.println(map);
//		
//		Set<String> input=map.keySet();
//		Iterator<String> s=input.iterator();
//		while(s.hasNext()) {
//			String a=s.next();
//			Integer b=map.get(a);
//			System.out.println(a+"="+b);
//		}
		for(String key :str) {
			Integer count=map.get(key);
			if(count!=null) {
				map.put(key, count+1);
			}else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

	}

}
