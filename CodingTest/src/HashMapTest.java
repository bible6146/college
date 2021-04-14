import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		System.out.println(map.put("Dd", 11));
		System.out.println(map.put("Dd", 1));
		System.out.println(map.get("Dd"));
		//해쉬맵은 중복되는 값이 있으면 반환값이 원래있던값이다
		//해쉬맵은 중복안되는 값을 넣으면 반환값이 null 이다
		
	}

}
