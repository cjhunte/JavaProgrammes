package Week2;

import java.util.Scanner;

public class ForLoops
{

   public static void main (String [] args)
   {
      Scanner scany = new Scanner(System.in);

      for (int count = 1; count <= 10; count++)
      {
          System.out.println("Number " + count);
      }//for

      int month;
      do
      {
       System.out.print("\nEnter a Month (1 – 12): ");
       month = scany.nextInt();
      } while (month < 1 || month > 12);//do whi


   }

}
