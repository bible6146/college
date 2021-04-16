import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class String_Sort {
	public static String solution(String s) {
		String answer = "";
		Queue<String> q=new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -(o1.compareTo(o2));
			}
		});
		for(int i=0;i<s.length();i++) {
			q.add(s.substring(i, i+1));
		}
		int i=0;
		while(q.size()>0) {
			answer+=q.poll();
		}
        return answer;
    }

	public static void main(String[] args) {
		String a="Zbcdefg";
		System.out.println(solution(a));

	}

}
