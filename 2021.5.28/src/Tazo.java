import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Tazo {	
	
	
	public static void main(String[] args) {
		try {
			allowMethods("PATCH");

	        HttpURLConnection conn = (HttpURLConnection) new URL("https://tazoapp.site/user/test/nickname").openConnection();
	        
//	        System.out.println(conn.getResponseCode());
//	        conn.setRequestProperty("X-HTTP-Method-Override", "PATCH");
	        conn.setRequestMethod("PATCH");
	        conn.setDoInput(true);
			conn.setDoOutput(true);
			
			StringBuffer buffer=new StringBuffer();
			buffer.append("nickname=kim");
			
			PrintWriter write=new PrintWriter(new OutputStreamWriter(conn.getOutputStream(),"UTF-8"));
			write.println(buffer.toString());
			write.flush();
			
//			JSONObject resultObj = new JSONObject();
			
			System.out.println("실행완료");
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		read();
	}
	public static void read() {
		try {
			URL url =new URL("https://tazoapp.site/users/test");
//			URL url2 =new URL("https://tazoapp.site/user/test/nickname");
//			
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			
//			System.out.println(conn.getResponseCode());
//			conn.setRequestMethod("PATCH");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			
//			
////			StringBuffer buffer=new StringBuffer();
//			buffer.append("nickname=kim");
//			
//			PrintWriter write=new PrintWriter(new OutputStreamWriter(conn.getOutputStream(),"UTF-8"));
//			write.println(buffer.toString());
//			write.flush();
//			
			
			InputStream stream=conn.getInputStream();
			StringBuilder sd=new StringBuilder();
			BufferedReader br=new BufferedReader(new InputStreamReader(stream,"UTF-8"));
			String result;
			
			while((result=br.readLine())!=null) {
				sd.append(result+"\n");
			}
			System.out.println(sd.toString());
			
			System.out.println("완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


private static void allowMethods(String... methods) {
    try {
        Field methodsField = HttpURLConnection.class.getDeclaredField("methods");

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(methodsField, methodsField.getModifiers() & ~Modifier.FINAL);

        methodsField.setAccessible(true);

        String[] oldMethods = (String[]) methodsField.get(null);
        Set<String> methodsSet = new LinkedHashSet<>(Arrays.asList(oldMethods));
        methodsSet.addAll(Arrays.asList(methods));
        String[] newMethods = methodsSet.toArray(new String[0]);

        methodsField.set(null/*static field*/, newMethods);
    } catch (NoSuchFieldException | IllegalAccessException e) {
        throw new IllegalStateException(e);
    }
}
}
