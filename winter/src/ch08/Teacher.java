package ch08;

public interface Teacher {
	String getName();
	
	static boolean isam(String str) {
		if(str==null||str.trim().length()==0){
			return true;
			
		}
		return false;
	}
	
}
