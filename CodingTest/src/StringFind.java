
public class StringFind {
	public String solution(String[] seoul) {
		int i=0;
		for(String s:seoul) {
			if(s.equals("Kim")) {
				return "김서방은"+String.valueOf(i)+"에 있다";
			}
			i++;
		}
        return " ";
    }
	
	

	public static void main(String[] args) {
		
	}

}
