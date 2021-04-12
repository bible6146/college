import java.util.Scanner;
public class levelTest {//레벨테스트 1번째 소요시간20분

	public static void main(String[] args) {//ctrl+i 정렬
		int sum = 0, check = 100;//100까지 갈일이 없으니까 임의의 큰숫자를 넣어둠
		Scanner sc=new Scanner(System.in);
		while(true) {
			sum=0;
			System.out.println("숫자를 입력하세요");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(i%7==0)sum+=i;
				if(sum>100&&i<check)check=i;//처음대입되는 값이 제일 작기 떄문에
			}								//한번들어간값이 고정되게 조건을 걸어둠
			if(sum<100) {
				System.out.printf("0에서 %d까지 배수 합은:%d\n",n,sum);
				continue;//100미만일때 밑에 문장들이 실행되지 않기 위해 작성
			}
			System.out.printf("0에서 %d까지 배수 합은:%d\n",n,sum);
			System.out.printf("누적된 값이 처음응로 100을 넘기는 7의 배수는 %d\n",check);
		}
	}

}
