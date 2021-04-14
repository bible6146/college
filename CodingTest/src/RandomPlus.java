import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RandomPlus {
	public static int[] solution(int[] numbers) {
		Set<Integer> set=new TreeSet<>();
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(i!=j) {
					set.add(numbers[i]+numbers[j]);
				}

			}
		}
		System.out.println(set);
		int[] answer=new int[set.size()];
		
		Iterator<Integer> input=set.iterator();
		int i=0;
		while(input.hasNext()) {
			answer[i]=input.next();
			i++;
		}

        return answer;
    }
	public static void main(String agrs[]) {
		int[] a= {2,1,3,4,1};
		solution(a);
		}

}
