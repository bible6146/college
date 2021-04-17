import java.util.*;

public class Number_Array_Division {
	public int[] solution(int[] arr, int divisor) {
		Queue<Integer> q=new PriorityQueue<>();
		for(int s: arr) {
			if(s%divisor==0) {
				q.add(s);
			}
		}
		if(q.size()==0) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[q.size()];
		int i=0;
		while(q.size()>0) {
			answer[i]=q.remove();
			i++;
		}
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
