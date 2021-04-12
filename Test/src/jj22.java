import java.util.*;
public class jj22 {

   public static void main(String[] args) {
      Random ra=new Random();
      int zoo;
      int max;
      int[] zuu=new int[6];
      int[] copy=new int[6];
      for(int i=0;i<100;i++) {
         zoo=ra.nextInt(6);
         for(int j=0;j<6;j++) {
            if(zoo==j) {
               zuu[j]+=1;
               copy[j]+=1;
            }
         }
      }
      for(int i=0;i<6;i++) {
         for(int j=0;j<5;j++) {
            if(zuu[i]>zuu[j]) {
               max=zuu[i];
               zuu[i]=zuu[j];
               zuu[j]=max;
            }
         }
      }
      for(int i=0;i<6;i++) {
         for(int j=0;j<6;j++) {
            if(copy[j]==zuu[i]) {
               System.out.print((j+1)+"("+copy[j]+")"+":");
               for(int k=0;k<zuu[i];k++) {
                  System.out.print("*");
               }
               copy[j]=0;
               System.out.println();
               
            }
         }
         
         
      
      }
      

   }

}