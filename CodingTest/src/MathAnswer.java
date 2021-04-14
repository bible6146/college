import java.util.Arrays;

public class MathAnswer {
	
	public static int[] solution(int[] answers) {
		int[][] man= {
				{
					1, 2, 3, 4, 5
				},
				{
					2, 1, 2, 3, 2, 4, 2, 5
				},{
					3, 3, 1, 1, 2, 2, 4, 4, 5, 5
				}
		};
		int[] result=new int[3];
		for(int i=0;i<man.length;i++) {
			for(int j=0;j<answers.length;j++) {
				if(man[i][j%man[i].length]==answers[j]) {
					result[i]++;
				}
			}
		}
		int max=0;
		int sum=0;
		for(int i=0;i<result.length;i++) {
			if(max<result[i]) {
				max=result[i];
			}
		}
		//int max=Math.max(result[0],Math.max(result[1], result[2]));
		//다음에는 Math 클래스를 이용해서 풀어보자
		for(int i=0;i<result.length;i++) {
			if(result[i]==max) {
				sum++;
			}
		}
		int[] answer = new int[sum];
		int count=0;
		for(int i=0;i<result.length;i++) {
			if(result[i]==max) {
				answer[count]=i+1;
				count++;
			}
		}

		
        return answer;
    }

	public static void main(String[] args) {
		int[] a= {
				1,2,3,4,5
		};
		solution(a);
	}

}
