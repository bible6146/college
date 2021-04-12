import java.util.*;
public class GradeMe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int gahak = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, gahak,english);
		System.out.println("평균은"+ me.average());
		
	}

	}


