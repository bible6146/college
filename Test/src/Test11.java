import java.util.*;
public class Test11 {
	static int out=0;

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		boolean gameover=false;
		int count=1;//반복횟수
		int[] ai=new int[3];//임의숫자
		int[] my=new int[3];//내가 정하는 숫자
		int[] point=new int[5];//볼 아웃 스트라이크
		while(true) {
			for(int i=0;i<3;i++) {
			ai[i]=(int)(Math.random()*10)+1;//0.0초과 1.0미만임 그래서 //0~부터 시작임
		}							//그래서 1을 안더해주면 10을 곱해도 1의 자리가 안나온다 
			if(check(ai))break;//3,0,0 일때를 생각하세요//임의숫자 중복체크
		}

		while(true) {
			while(true) {
				System.out.printf("\n시도횟수:%d\n정수 3개를 입력하세요\n",count);
				String input=sc.nextLine()+" ";
				for(int i=0;i<input.length();i+=2) {
				my[i/2]=Integer.parseInt(input.substring(i,i+1));
				}
				//System.out.println(my[0]+" "+my[1]+" "+my[2] );
				if(check(my)) {//내가 지정한 숫잔 중복체크
					break;
					}
				else System.out.println("중복입니다 다시 입력하세요");
			}
			for(int i=0;i<ai.length;i++) {//ai.length!!
				for(int j=0;j<my.length;j++) {
					if(i==j && ai[i]==my[j]) {
						point[0]++;
						my[j]=0;
						break;
					}
					else if(i!=j&&ai[i]==my[j]) {
						point[1]++;break;
					}
				}
				//System.out.println(point[0]+" "+point[1]+" "+point[2]);
			}
			if(point[0]==0&&point[1]==0) {
				point[2]++;
				System.out.printf("out: 아웃 %d 번\n",point[2]);
			}
			
		
			if(point[0]!=0) {
					System.out.printf("%d strike\n ",point[0]);
				}
			if(point[1]!=0) {
					System.out.printf("%d ball\n",point[1]);
				}
			
			count++;
			if(point[0]>=3||count==6||point[2]==3)break;
			point[0]=0;
			point[1]=0;
		}
		if(point[0]>=3) {
			System.out.println("이겼습니다");
		}
		else System.out.println("아까비 졌네요  졌네용 ");
		System.out.println("정답은"+ai[0]+" "+ai[1]+" "+ai[2] );//for문으로 해놓자

	}
public static boolean check(int a[]) {//중복 체크 메소드
	if(a[0]==a[1]||a[0]==a[2]||a[1]==a[2])
		return false;
	else return true;
}

}
