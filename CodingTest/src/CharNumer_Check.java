
public class CharNumer_Check {
	
	boolean solution(String s) {
        s = s.toLowerCase();
        int[] check=new int[2];//변수 하나만 써보기
        for(int i=0;i<s.length();i++) {
        	if(s.substring(i,i+1).equals("p")) {
        		check[0]++;
        	}
        	else if(s.substring(i,i+1).equals("y")) {
        		check[1]++;
        	}
        }
        if(check[0]!=check[1])return false;
       
        return true;
    }

	public static void main(String[] args) {
		

	}

}
