
public class CenterString {
	public String solution(String s) {
	      int temp=s.length();
			return (temp%2==1)?s.substring((temp-1)/2,(temp-1)/2+1):s.substring((temp-1)/2,(temp-1)/2+2);
	    }
	public static void main(String agrs[]) {
		
	}

}
