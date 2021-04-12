
public class ExceptionTest2 {

	public static void main(String[] args) {
		String id="js2";
		String pw="1112";
		try{
			login(id,pw);
		}catch(idException e){
			e.getMessage();
			System.err.println(e.message());
		}
		catch(pwException e) {
			e.getMessage();
			System.err.println(e.message());
		}

	}

	public static void login(String id,String pw)throws idException,pwException {
		if(!id.equals("js")) {
			throw new idException("아이디오류입니다");
		}
		if(!pw.equals("1112")) {
			throw new pwException("비밀번호 오류");
		}
		else {
			System.out.println("성공");
		}
		
	}
}

class loginException extends Exception{
	String err="아이디 문제";
	public loginException(String mgs) {
		this.err=mgs;
	}
	public String message() {
		return "로그인 오류"+err;
	}
}
class idException extends loginException{

	public idException(String mgs) {
		super(mgs);
		
	}
	
}
class pwException extends loginException{

	public pwException(String mgs) {
		super(mgs);
		
	}
	
}












