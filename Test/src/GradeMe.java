import java.util.*;
public class GradeMe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int gahak = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, gahak,english);
		System.out.println("�����"+ me.average());
		
	}

	}


