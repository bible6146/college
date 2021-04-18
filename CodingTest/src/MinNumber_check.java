import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinNumber_check {
	
	public int[] solution(int[] arr) {
		int[] answer =new int[arr.length-1];
		int[] fa= {-1};
		if(arr.length<=1) {
			return fa;
		}
		int[] temp=arr.clone();
		
		Arrays.sort(arr);
		int min=arr[0];
		int x=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]==min) {
				
			}
			else {
				answer[x]=temp[i];
				x++;
			}
		}
		
		
        return answer;
    }
	public static void main(String agrs[]) {
		
	}

}
