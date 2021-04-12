package student;
import java.util.Scanner;

public class Quiz24 {
   // 2019 1-(2) 중간고사
   // [1] 입력 받은 수만큼 대문자 알파벳 출력하기 
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//
//
//      int myValue = 0;
//
//      do {
//         // 사용자로부터 정수 N 입력받기
//         System.out.print("1 이상의 양수를 입력하세요 : ");
//         myValue = scan.nextInt();
//
//         // N 값이 '0' 이하의 정수일 경우 에러 메시지 출력
//         if(myValue <= 0) {
//            System.out.println("[ERROR] 1 이상의 양수를 입력하세요!!");
//            System.out.println("------------------------------");
//         }else {
//            break;
//         }
//      }while(true);
//
//      // 대문자 A를 시작으로 입력 받은 수만큼 알파벳 출력하기
//      // 22를 초과할 경우 다시 A부터 시작
//      char alpha = 'A';
//
//      // 결과값 출력
//      System.out.print("결과 값 : ");
//      for (int i = 0 ; i < myValue ; i++) {
//
//         if(i == 22) alpha = 'A';
//         // 특정 문자 출력하지 않기
//         if(alpha == 'C' || alpha == 'H' || alpha == 'K' || alpha == 'P') {
//            i--;
//            alpha++;
//            continue;
//         }
//         System.out.print(alpha++);
//         if(i < myValue - 1) System.out.print(", ");
//
//
//      }
//   }

   // [2] 1 이상 N 이하의 정수 중 3의 배수 또는 5의 배수 출력
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//
//      System.out.println("==============================================="
//            + "\n 1에서 N까지의 정수 중, 5 또는 3의 배수를 출력하는 프로그램  "
//            + "\n===============================================");
//
//      // 사용자로부터 N값 입력받기
//      System.out.print("N값을 입력하세요 : ");
//      int myValue = 0;
//
//      // myValue의 값이 0이하의 정수일 경우 에러 메시지 출력 후 재입력 받기
//      do {
//         myValue = scan.nextInt();
//
//         if(myValue <= 0) {
//            System.out.println("[ERROR] 1 이상의 양수를 입력하세요.");
//         }else {
//            break;
//         }
//      }while(true);
//
//      // 1 이상 N 이하의 정수 값 중 3 또는 5의 배수 값 출력
//      for (int i = 1 ; i <= myValue ; i++) {
//         if(i % 3 == 0)      System.out.println("3의 배수 : " + i);
//         else if(i % 5 == 0)   System.out.println("5의 배수 : " + i);
//      }
//   }

   // [3] 가위, 바위, 보 게임
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // 승, 패, 무 판별 변수
      // 반복문 안에 생성 시 매번 초기화되기 때문에 밖에서 생성
      int       win      = 0;
      int       lose      = 0;
      int       draw      = 0;

      while(true) {

         // 컴퓨터로부터 랜덤 숫자 저장
         int comValue   = (int)(Math.random() * 3) + 1;
         int userValue   = 0;

         do{
            // 사용자로부터  1 - 가위, 2 - 바위, 3 - 보 숫자 입력받기
            System.out.println("가위(1), 바위(2), 보(3)를 입력하세요!");
            userValue = scan.nextInt();

            // 1 ~ 3 이외의 숫자 입력 시 에러 메시지 출력 후 재입력 받기
            if(userValue < 1 || userValue > 3) {
               System.out.println("1, 2, 3 세 가지 중 하나를 입력하세요!");
            }else { 
               break;
            }

         }while(true);

         // 출력 메시지 변수 선언
         String[] rpsArray   = {"가위", "바위", "보"};
         String   resultMsg    = "";
         String    userMsg   = "";
         String    comMsg      = "";


         // 비길 경우
         if(userValue == comValue) {
                          resultMsg = "무승부";
         // 사용자가 가위(1)를 선택할 경우                 
         }else if(userValue == 1) {
            if(comValue == 2) resultMsg = "패";
            else           resultMsg = "승";   
         // 사용자가 바위(2)를 선택할 경우   
         }else if(userValue == 2) {
            if(comValue == 1) resultMsg = "승";
            else           resultMsg = "패";
         // 사용자가 보(3)를 선택할 경우   
         }else if(userValue == 3) {
            if(comValue == 1) resultMsg = "패";
            else           resultMsg = "승";
         }

         // 승, 패, 무승부 카운트
         if(resultMsg == "승")      win++;
         else if(resultMsg == "패")   lose++;
         else                  draw++;

         // 사용자와 컴퓨터가 무엇을 냈는지 배열 내 인덱스로 확인
         userMsg = rpsArray[userValue - 1];
         comMsg  = rpsArray[comValue - 1];

         // 결과 출력
         System.out.printf("결과 : %s [ 컴퓨터 - %s, 사용자 - %s]\n", resultMsg, comMsg, userMsg);
         System.out.printf("%d승 %d패 %d무\n", win, lose, draw);

         // 프로그램 종료 
         System.out.println("\n계속 하시겠습니까? (1 - 예, 2 - 아니오)");
         int over = scan.nextInt();
         if(over == 2) break;
      }

      System.out.println("프로그램 종료");
   }
}
