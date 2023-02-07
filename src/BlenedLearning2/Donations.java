package BlenedLearning2;

import java.util.Scanner;

public class Donations
{

   public static void main(String[] args)
   {
      String HighDo = "";
      double BigDo = 0 ;
      double DoTot = 0 ;
      int count = 0;
      Scanner scany = new Scanner(System.in);
      do
      {
         System.out.println("Enter the donation amount");
         double DoAmount = scany.nextDouble();

         System.out.println("please enter the donor name");
         String donor = scany.next();

         DoTot = DoAmount + DoTot;

         if (DoAmount > BigDo)
         {
            BigDo = DoAmount;
            HighDo = donor;
         }

         count +=1;
         System.out.println("next donation");
      }while (DoTot < 500);
      System.out.println(HighDo +("  ")+ ("  ")+BigDo+("  ")+(count));
   }
}
