import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		System.out.println(map.put("Dd", 11));
		System.out.println(map.put("Dd", 1));
		System.out.println(map.get("Dd"));

	}

}
