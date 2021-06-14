package mariaDb;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

public class PropsTest {

	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("dict.props");
			Properties props=new Properties();
			props.load(file);
			
			File file2=new File("jung.props");
			Properties props2=new Properties();
			 
			Set<Object> set=props.keySet();
			for(Object s:set) {
				System.out.println(s+" "+props.get(s));
				props2.put(s, props.get(s));
			}
			
			props2.store(new PrintWriter(file2), null);
			
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
