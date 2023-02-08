package Week2;

import java.util.Scanner;

public class Operators
{
   public static void main (String[] args)
   {
      Scanner Scany = new Scanner(System.in);

      int mark;
      System.out.println("please enter your mark : ");
      mark = Scany.nextInt();

      if (mark >=0 && mark <=100 )
      {
         System.out.println("Mark entered is valid");

      }
      else
         System.out.println("please enter a valid mark");




      char letter;

      System.out.print("Enter a character");
      letter = Scany.nextLine().charAt(0);

      if ((letter == 'x') || (letter == 'y'))
      {
         System.out.println("The character is X or Y");
      }
      else
      {
         System.out.println("The character is not X or Y");

      }




   }



}
