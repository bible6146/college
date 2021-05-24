
public class StringCheck {
	public static boolean solution(String s) {
		try {
			for(int i=0;i<s.length();i++) {
//				Integer.valueOf(s.substring(i,i+1));
				//래퍼 객체를 반환
				
				Integer.parseInt(s);
				//원시타입 int 를 반환
			}
		}catch(Exception e){
			return false;
		}
		if(s.length()==4||s.length()==6) {
			 return true;
		}
		else {
			return false;
		}
    }

	public static void main(String[] args) {
		System.out.println(solution("a123"));

	}

}
