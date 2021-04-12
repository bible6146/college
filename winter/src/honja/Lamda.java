package honja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lamda {

	public static void main(String[] args) {
		List<String> li=new ArrayList();
		li.add("aa");
		li.add("bb");
		li.add("CC");
		li.add("dd");
		li.add("EEE");
		
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li, (o1,o2)->o1.compareToIgnoreCase(o2));
		System.out.println(li);

	}

}
