import java.util.Arrays;
import java.util.Comparator;

public class IntegerSort {
	public Integer[] solution(long n) {
		String s=String.valueOf(n);
		Integer[] arr=new Integer[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=Integer.parseInt(s.substring(i,i+1));
		}
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1-o2);
			}
			
		});
		
        return arr;
    }
	
	public static void main(String agrs[]) {
		
	}
}
