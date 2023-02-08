package BlenedLearning2;

import java.util.Scanner;

public class FizzBuzz2
{
   public static void main (String[] args)
   {

      System.out.println("Enter a whole integer");

      Scanner scany = new Scanner(System.in);
      double FizzOBuzz = scany.nextDouble();

      System.out.println("Enter a whole integer");

      Scanner scany2 = new Scanner(System.in);
      double FizzOBuzz2 = scany2.nextDouble();



      for (double i = FizzOBuzz ; i <= FizzOBuzz2; i++)
      {

         if (i % 3 == 0 && i % 7 != 0)
         {
            System.out.println("FIZZ");

         }


         if (i % 7 == 0 && i % 3 != 0)
         {
            System.out.println("BUZZ");

         }

         if (i >= 0 && i % 7 != 0 && i % 3 != 0)
         {
            System.out.println(i);
         }

         if (i % 7 == 0 && i % 3 == 0)
         {
            System.out.println("FIZZBUZZ");

         }

      }

   }
}
