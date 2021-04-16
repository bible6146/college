import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
			 int temp=s1.substring(n,n+1).compareTo(s2.substring(n,n+1));
			 if(temp==0) {
				 return s1.compareTo(s2);
			 }
			 else  return temp;
			}
		});
		for(int i=0;i<strings.length;i++) {
			System.out.print(strings[i]+" ");
		}
        return strings;
    }

	public static void main(String[] args) {
		String[] a= {"abce", "abcd", "cdx"};
		solution(a,2);
		}

}
