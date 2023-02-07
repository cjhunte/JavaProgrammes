package BlenedLearning2;

import java.util.Scanner;

public class LargestNumber
{
   public static void main (String [] args)
   {

      final int TERMINATOR = - 999;
      int largestNumber = 0;

      System.out.println("Enter the numbers you would like see which is biggest");

      Scanner scany = new Scanner(System.in);
      int number = scany.nextInt();

      while (number != TERMINATOR)
      {
         if(number > largestNumber)
         {
            largestNumber = number;
         }
         System.out.println("next number");
         number = scany.nextInt();
      }

      System.out.println(largestNumber);

   }


}
