import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("±Ë¡§ºº", 82231626);
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("±Ëªı∫∞", 1626);
		
		Map<String,Map<String,Integer>> phoneBook=new HashMap<>();
		phoneBook.put("wdj-a",map);
		phoneBook.put("wdj-b",map2);
		
//		Map temp=phoneBook.get("wdj-a");
//		System.out.println(temp.get("±Ë¡§ºº"));
		
//		Set<Entry<String, Map<String, Integer>>> temp2=phoneBook.entrySet();
//		Iterator<Entry<String, Map<String, Integer>>> input=temp2.iterator();
//		while(input.hasNext()) {
//			Map<String,Integer> temp3=(Map)input.next();
//			Set<String> set=temp3.keySet();
//			Iterator<String> it=set.iterator();
//			while(it.hasNext()) {
//				String s=it.next();
//				System.out.println(temp3.get(s));
//			}
//		}
		
//		Set<Entry<String, Map<String, Integer>>> entryset=phoneBook.entrySet();
//		Iterator<Entry<String, Map<String, Integer>>> iter1=entryset.iterator();
//		while(iter1.hasNext()) {
//			Entry<String, Map<String, Integer>> entry=iter1.next();
//			Map<String, Integer> pb=entry.getValue();
//			
//			Set<String> phones=pb.keySet();
//			Iterator<String> iter2=phones.iterator();
//			while(iter2.hasNext()) {
//				String ss=iter2.next();
//				int sx=pb.get(ss);
//				System.out.println(ss+" "+sx);
//			}
//		}
		
		Set<String> set1=phoneBook.keySet();
		Iterator<String> iter1=set1.iterator();
		while(iter1.hasNext()) {
			Map<String,Integer> temp=phoneBook.get(iter1.next());
			Set<String> temp2=temp.keySet();
			Iterator<String> iter2=temp2.iterator();
			while(iter2.hasNext()) {
				String a=iter2.next();
				int b=temp.get(a);
				System.out.println(a+" "+b);
			}
		}
		
		
		
	}

}


