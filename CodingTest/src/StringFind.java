
public class StringFind {
	public String solution(String[] seoul) {
		int i=0;
		for(String s:seoul) {
			if(s.equals("Kim")) {
				return "�輭����"+String.valueOf(i)+"�� �ִ�";
			}
			i++;
		}
        return " ";
    }
	
	

	public static void main(String[] args) {
		
	}

}
