import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SameInt_Sort {
	public static int[] solution(int []arr) {
		Deque<Integer> dq=new ArrayDeque<>(); 
		dq.push(-1);
		for(int i=0;i<arr.length;i++) {
			if(dq.peekFirst()!=arr[i]) {
				dq.push(arr[i]);
			}
		}
		dq.removeLast();
		int[] answer = new int[dq.size()];
		int i=0;
		while(dq.size()>0) {
			answer[i]=dq.pollLast();
			i++;
		}

        return answer;
    }
	public static void main(String agrs[]) {
		int[] a= {1,1,3,3,0,1,1};
		}

}
