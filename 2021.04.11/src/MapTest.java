import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		//맵은 구현체 이고 구현 클래스가 
		//3개 있음
		//그래서 map 타입의 변수는 위릐 3개 타입의 객체를 수용할수 있다.
		//키와 value의 쌍으로 저장 
		//제네릭 인터 페이스 
		//클래스나 메소드에서 내부에서 사용할 데이터 타입을 정하지 않고
		//실제그 클래스를 만들거나 메소드를 호출할때 
		//데이터 타입을 파라미터로 받아서 처리하는것.
		//문자열 타입의 학번을 키로 studentㅇ객체를 값으로 map에 저장
		Map<String,Student> m= new HashMap<>();
		
		//넣을때는 put 사용 원소 삽입과 변경에 모두 사용됨
		//map에서 읽을 때는 get(key) 사용
		
		m.put("2001331", new Student(200132,"홍길동"));

		m.put("2001332", new Student(200132,"일지매"));

		m.put("2001333", new Student(200135,"월매"));

		m.put("2001334", new Student(200131,"성춘향"));

		m.put("2001335", new Student(200135,"이몽룡"));

		m.put("2001336", new Student(200134,"홍길동"));
		
		//원소 값을 읽을때는 키값을 줘야한다.
		//map 객체에게 니가 가진 key 값 다줘 라고 할수있다.
		//반환값 set 임
		Set<String> s1=m.keySet();
		//keyset에 있는 각 원소를 통해서 map에게 값을 요구하면 된다.
		//왜냐하면 그원소가 map에 저장된 값에 key 니까
		Iterator<String> input=s1.iterator();
		while(input.hasNext()) {
			String k=input.next();
			System.out.println(m.get(k));
			
		}
		//entry= key와value의 쌍
		//엔트리가 독립적으로 정의 된게 아니고 map 안에 있다.
		//키와 값으로 구성되어 있는 데이터를 enrty라고 한다.
		Set<Map.Entry<String,Student>> entry=m.entrySet();
		//앞에 클래스 Map을 안써도 이미 임포트 되있어서 인식함
		Iterator<Entry<String, Student>> scan=entry.iterator();
		while(scan.hasNext()) {
			Map.Entry<String, Student> en=scan.next();
			String mykey=en.getKey();
			Student mystd=en.getValue();
			System.out.println(mykey+" "+mystd);
		}
		
		for(Map.Entry<String, Student> s:m.entrySet()) {
			String mykey=s.getKey();
			Student mystd=s.getValue();
			System.out.println(mykey+" "+mystd);
		}
		
	}

}

class Student{
	int number;
	String name;
	public Student(int a,String b) {
		this.number=a;
		this.name=b;
		
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
}
