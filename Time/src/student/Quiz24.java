package student;
import java.util.Scanner;

public class Quiz24 {
   // 2019 1-(2) �߰����
   // [1] �Է� ���� ����ŭ �빮�� ���ĺ� ����ϱ� 
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//
//
//      int myValue = 0;
//
//      do {
//         // ����ڷκ��� ���� N �Է¹ޱ�
//         System.out.print("1 �̻��� ����� �Է��ϼ��� : ");
//         myValue = scan.nextInt();
//
//         // N ���� '0' ������ ������ ��� ���� �޽��� ���
//         if(myValue <= 0) {
//            System.out.println("[ERROR] 1 �̻��� ����� �Է��ϼ���!!");
//            System.out.println("------------------------------");
//         }else {
//            break;
//         }
//      }while(true);
//
//      // �빮�� A�� �������� �Է� ���� ����ŭ ���ĺ� ����ϱ�
//      // 22�� �ʰ��� ��� �ٽ� A���� ����
//      char alpha = 'A';
//
//      // ����� ���
//      System.out.print("��� �� : ");
//      for (int i = 0 ; i < myValue ; i++) {
//
//         if(i == 22) alpha = 'A';
//         // Ư�� ���� ������� �ʱ�
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

   // [2] 1 �̻� N ������ ���� �� 3�� ��� �Ǵ� 5�� ��� ���
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//
//      System.out.println("==============================================="
//            + "\n 1���� N������ ���� ��, 5 �Ǵ� 3�� ����� ����ϴ� ���α׷�  "
//            + "\n===============================================");
//
//      // ����ڷκ��� N�� �Է¹ޱ�
//      System.out.print("N���� �Է��ϼ��� : ");
//      int myValue = 0;
//
//      // myValue�� ���� 0������ ������ ��� ���� �޽��� ��� �� ���Է� �ޱ�
//      do {
//         myValue = scan.nextInt();
//
//         if(myValue <= 0) {
//            System.out.println("[ERROR] 1 �̻��� ����� �Է��ϼ���.");
//         }else {
//            break;
//         }
//      }while(true);
//
//      // 1 �̻� N ������ ���� �� �� 3 �Ǵ� 5�� ��� �� ���
//      for (int i = 1 ; i <= myValue ; i++) {
//         if(i % 3 == 0)      System.out.println("3�� ��� : " + i);
//         else if(i % 5 == 0)   System.out.println("5�� ��� : " + i);
//      }
//   }

   // [3] ����, ����, �� ����
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // ��, ��, �� �Ǻ� ����
      // �ݺ��� �ȿ� ���� �� �Ź� �ʱ�ȭ�Ǳ� ������ �ۿ��� ����
      int       win      = 0;
      int       lose      = 0;
      int       draw      = 0;

      while(true) {

         // ��ǻ�ͷκ��� ���� ���� ����
         int comValue   = (int)(Math.random() * 3) + 1;
         int userValue   = 0;

         do{
            // ����ڷκ���  1 - ����, 2 - ����, 3 - �� ���� �Է¹ޱ�
            System.out.println("����(1), ����(2), ��(3)�� �Է��ϼ���!");
            userValue = scan.nextInt();

            // 1 ~ 3 �̿��� ���� �Է� �� ���� �޽��� ��� �� ���Է� �ޱ�
            if(userValue < 1 || userValue > 3) {
               System.out.println("1, 2, 3 �� ���� �� �ϳ��� �Է��ϼ���!");
            }else { 
               break;
            }

         }while(true);

         // ��� �޽��� ���� ����
         String[] rpsArray   = {"����", "����", "��"};
         String   resultMsg    = "";
         String    userMsg   = "";
         String    comMsg      = "";


         // ��� ���
         if(userValue == comValue) {
                          resultMsg = "���º�";
         // ����ڰ� ����(1)�� ������ ���                 
         }else if(userValue == 1) {
            if(comValue == 2) resultMsg = "��";
            else           resultMsg = "��";   
         // ����ڰ� ����(2)�� ������ ���   
         }else if(userValue == 2) {
            if(comValue == 1) resultMsg = "��";
            else           resultMsg = "��";
         // ����ڰ� ��(3)�� ������ ���   
         }else if(userValue == 3) {
            if(comValue == 1) resultMsg = "��";
            else           resultMsg = "��";
         }

         // ��, ��, ���º� ī��Ʈ
         if(resultMsg == "��")      win++;
         else if(resultMsg == "��")   lose++;
         else                  draw++;

         // ����ڿ� ��ǻ�Ͱ� ������ �´��� �迭 �� �ε����� Ȯ��
         userMsg = rpsArray[userValue - 1];
         comMsg  = rpsArray[comValue - 1];

         // ��� ���
         System.out.printf("��� : %s [ ��ǻ�� - %s, ����� - %s]\n", resultMsg, comMsg, userMsg);
         System.out.printf("%d�� %d�� %d��\n", win, lose, draw);

         // ���α׷� ���� 
         System.out.println("\n��� �Ͻðڽ��ϱ�? (1 - ��, 2 - �ƴϿ�)");
         int over = scan.nextInt();
         if(over == 2) break;
      }

      System.out.println("���α׷� ����");
   }
}
