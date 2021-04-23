import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		//���� ����ü �̰� ���� Ŭ������ 
		//3�� ����
		//�׷��� map Ÿ���� ������ ���l 3�� Ÿ���� ��ü�� �����Ҽ� �ִ�.
		//Ű�� value�� ������ ���� 
		//���׸� ���� ���̽� 
		//Ŭ������ �޼ҵ忡�� ���ο��� ����� ������ Ÿ���� ������ �ʰ�
		//������ Ŭ������ ����ų� �޼ҵ带 ȣ���Ҷ� 
		//������ Ÿ���� �Ķ���ͷ� �޾Ƽ� ó���ϴ°�.
		//���ڿ� Ÿ���� �й��� Ű�� student����ü�� ������ map�� ����
		Map<String,Student> m= new HashMap<>();
		
		//�������� put ��� ���� ���԰� ���濡 ��� ����
		//map���� ���� ���� get(key) ���
		
		m.put("2001331", new Student(200132,"ȫ�浿"));

		m.put("2001332", new Student(200132,"������"));

		m.put("2001333", new Student(200135,"����"));

		m.put("2001334", new Student(200131,"������"));

		m.put("2001335", new Student(200135,"�̸���"));

		m.put("2001336", new Student(200134,"ȫ�浿"));
		
		//���� ���� �������� Ű���� ����Ѵ�.
		//map ��ü���� �ϰ� ���� key �� ���� ��� �Ҽ��ִ�.
		//��ȯ�� set ��
		Set<String> s1=m.keySet();
		//keyset�� �ִ� �� ���Ҹ� ���ؼ� map���� ���� �䱸�ϸ� �ȴ�.
		//�ֳ��ϸ� �׿��Ұ� map�� ����� ���� key �ϱ�
		Iterator<String> input=s1.iterator();
		while(input.hasNext()) {
			String k=input.next();
			System.out.println(m.get(k));
			
		}
		//entry= key��value�� ��
		//��Ʈ���� ���������� ���� �Ȱ� �ƴϰ� map �ȿ� �ִ�.
		//Ű�� ������ �����Ǿ� �ִ� �����͸� enrty��� �Ѵ�.
		Set<Map.Entry<String,Student>> entry=m.entrySet();
		//�տ� Ŭ���� Map�� �Ƚᵵ �̹� ����Ʈ ���־ �ν���
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
