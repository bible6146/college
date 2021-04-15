import java.util.ArrayList;
import java.util.Stack;

public class DrawDoll {
	
	
	public static int solution(int[][] board, int[] moves) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(-1);
		int answer = 0;

		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++) {
				if(board[j][moves[i]-1]!=0) {
					list.add(board[j][moves[i]-1]);	
					board[j][moves[i]-1]=0;
					
					for(int x=0;x<list.size()-1;x++) {
						if(list.get(x)==list.get(x+1)) {
							list.remove(x);
							list.remove(x);
							answer+=2;
							x=0;
						}
					}
					
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
