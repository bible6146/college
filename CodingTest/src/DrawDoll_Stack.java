import java.util.ArrayList;
import java.util.Stack;

public class DrawDoll_Stack {
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> stack =new Stack();
		stack.add(-1);
		int answer = 0;

		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[j][moves[i]-1]!=0) {
					if(board[j][moves[i]-1]==stack.peek()) {
						stack.pop();
						answer+=2;
					}
					else {
						stack.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1]=0;
					break;
				}		
			}
		}
		
        return answer;
    }

	public static void main(String[] args) {
		int[][] a= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] b= {1,5,3,5,1,2,1,4};
		System.out.println(solution(a,b)+"  ddd ");

	}

}
