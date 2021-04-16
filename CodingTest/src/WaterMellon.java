
public class WaterMellon {
	 public static String solution(int n) {
		 String start="¼ö¹Ú";
		 int temp=n/2;
		 String answer="";
		 while(temp>0) {
			 answer=answer+start;
			 temp--;
		 }
		 if(n%2==1) {
			 answer=answer+start.substring(0,1);
		 }
		 
	        return answer;
	    }

	public static void main(String[] args) {
		System.out.println(solution(3));

	}

}
