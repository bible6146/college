import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class MapTest3 {

	public static void main(String[] args) {
		int max = 0;
		String maxstr = "";
		String sample = "What a radical idea, the great gift that our Founders gave to us. "
				+ "The freedom to chase our individual dreams through our sweat, and toil, "
				+ "and imagination — and the imperative to strive together as well, to achieve a common good, a greater good. "
				+ "For 240 years, our nation’s call to citizenship has given work and purpose to each new generation. "
				+ "It’s what led patriots to choose republic over tyranny, pioneers to trek west, slaves to brave that makeshift railroad to freedom. "
				+ "It’s what pulled immigrants and refugees across oceans and the Rio Grande. "
				+ "It’s what pushed women to reach for the ballot. It’s what powered workers to organize. "
				+ "It’s why GIs gave their lives at Omaha Beach and Iwo Jima; "
				+ "Iraq and Afghanistan — and why men and women from Selma to Stonewall were prepared to give theirs as well.";

		TreeMap<String, Integer> map = new TreeMap<>();
		TreeMap<String, Integer> map2 = new TreeMap<>();
		//map은 키로만 정렬 가능함
		StringTokenizer t1 = new StringTokenizer(sample, "- . , ;");

		while (t1.hasMoreTokens()) {
			String s = t1.nextToken();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
//
//		Set<Map.Entry<String, Integer>> temp = map.entrySet();
//		Iterator<Entry<String, Integer>> it = temp.iterator();
//
//		while (it.hasNext()) {
//			Entry<String, Integer> obj = it.next();
//			String s = obj.getKey();
//			int s1 = obj.getValue();
//			System.out.println(s + "는 " + s1 + "번입니다");
//			if (max < s1) {
//				max = s1;
//				maxstr = s;
//			}
//		}
//		System.out.println("제일 많이 나온 단어는" + maxstr + "이고" + max + "번입니다");
		
		
		//값을 entry로 던저주고 정렬을 entry 타입으로함
		ArrayList<Entry<String,Integer>> arr=new ArrayList<>();
		Set<Entry<String,Integer>> list=map.entrySet();
		
		Iterator<Entry<String,Integer>> list2=list.iterator();
		
		while(list2.hasNext()) {
			arr.add(list2.next());
		}
		arr.sort(new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		for(int i=0;i<arr.size();i++) {
			String s=arr.get(i).getKey();
			Integer s2=arr.get(i).getValue();
			System.out.println(s+"는 "+s2);
		}
		
		
		
		//트리 맵으로 알파벳 순서대로 간단하게 구현함
//		Set<String> set=map.keySet();
//		Iterator<String> it2=set.iterator();
//		while(it2.hasNext()) {
//			String s=it2.next();
//			int s2=map.get(s);
//			System.out.println(s+"는"+s2);
//		}
		
		
		
		
	}

}
