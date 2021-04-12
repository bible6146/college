import java.util.*;
public class LevelTest2 {//레벨테스트 2번째 문제 소요시간 20분

	public static void main(String[] args) {
		Random ra=new Random();
		Scanner sc=new Scanner(System.in);
		while(true) {
			int num,sum=0;
			System.out.println("N값을 적으시오");
			int n=sc.nextInt();//100번
			
			for(int i=0;i<n;i++) {
				//*************************0.0~1.0 Math.random 써보기****************************
				//num=ra.nextInt(201)-100;//random숫자 튜닝
				num=(int)(Math.random()*200)-100;
				if(num==6)sum++;//몆번나왔는지 체크
			}
			if(sum==0) {
				while(true) {
					n++;//n이 여기서 count느낌~
					num=ra.nextInt(201)-100;
					if(num==6) {
						sum++;//사실한번만 나와도 되서 sum=1할라다가 걍이거함 
						break;
					}
				}
			}
			System.out.printf("%d번시도 6이 나온횟수:%d\n",n,sum);
			System.out.println("확율은 "+sum/(double)n);//다시한번 더보기**********************
		}
	}

}
