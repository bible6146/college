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
//			System.out.println(s+"��  " +env.get(s));
//		}
//		
//		//Properties Ű ��� Ÿ���� ���� ��Ʈ������ ������ ������ �ʰ�ü
//		Properties props=new Properties();
//		props.put("name","ȫ�浿");
//		props.put("age", "20");
//		
//		Set<Object> key=props.keySet();
//		for(Object s : key) {
//			System.out.println();
//		}
		Properties props=new Properties();
		try(FileReader reader=new FileReader("dict.props")) {//������ ������Ʈ ������ ���� ���Ѿߵ�
			props.load(reader);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			
		}
		
		Set<Object> keys=props.keySet();
		for(Object ss:keys) {
			System.out.print(ss+" : "+ props.get(ss));
		}
		
		props.put("����", "tree");
		try(PrintWriter out=new PrintWriter(new File("dict.props"))){
			props.store(out, "My Dictionary");
		}catch(Exception e){
			
		}
		System.out.println(props.get("����"));
		

	}

}
