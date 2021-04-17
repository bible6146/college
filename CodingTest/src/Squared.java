
public class Squared {
	public static long solution(long n) {
        long temp =(long) Math.sqrt(n);
        if(temp!=Math.sqrt(n)) {
        	return -1;
        }
        return (temp+1)*(temp+1);
    }

	public static void main(String[] args) {
		System.out.println(solution(12));

	}

}
