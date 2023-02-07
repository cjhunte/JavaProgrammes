package Week2;

import java.text.*;
import java.util.Scanner;

public class Switches
{
   public static void main(String[] args)

    {








      Scanner Scany = new Scanner(System.in);
      int choice = 0 ;

      System.out.println("please enter a choice between 1-4 > ");

      choice = Scany.nextInt();

      switch (choice)
      {

         case 1:
            System.out.println("World cup hockey 2023");
            break;
         case 2:
            System.out.println("World cup Football 2022");
            break;
         case 3:
            System.out.println("World cup Rugby 2023");
            break;
         case 4:
            System.out.println("You have chosen to Exit the system");
            break;
         default:
            System.out.println("please select a number between 1-4");
      }
    }
}
