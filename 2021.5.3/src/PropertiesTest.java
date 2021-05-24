import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;


public class PropertiesTest {

	public static void main(String[] args) {
//		Map<String,String> env=System.getenv();
//		Set<String> keys=env.keySet();
//		
//		for(String s:keys) {
//			System.out.println(s+"는  " +env.get(s));
//		}
//		
//		//Properties 키 밸류 타입이 각각 스트링으로 고정된 일종의 맵객체
//		Properties props=new Properties();
//		props.put("name","홍길동");
//		props.put("age", "20");
//		
//		Set<Object> key=props.keySet();
//		for(Object s : key) {
//			System.out.println();
//		}
		Properties props=new Properties();
		try(FileReader reader=new FileReader("dict.props")) {//파일을 프로젝트 레벨에 저장 시켜야됨
			props.load(reader);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			
		}
		
		Set<Object> keys=props.keySet();
		for(Object ss:keys) {
			System.out.print(ss+" : "+ props.get(ss));
		}
		
		props.put("나무", "tree");
		try(PrintWriter out=new PrintWriter(new File("dict.props"))){
			props.store(out, "My Dictionary");
		}catch(Exception e){
			
		}
		System.out.println(props.get("나무"));
		

	}

}
