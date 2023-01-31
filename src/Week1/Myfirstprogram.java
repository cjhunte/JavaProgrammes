package Week1;

import java.util.Scanner;
import java.text.*;


public class Myfirstprogram
{
   public static void main (String[] args)
   {
       Scanner keyboard = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("00.00");
       double cost;

      /*
      ~String name = "rachel" ;
      ~int age = 21 ;

      ~System.out.println( "my name is " + name + " and i am "+ age + " years old");


      int number1 = 14;
      double number2 = 3;
      double result1, result2;
      int number3 = 14;
      int number4 = 3;
      int result3 ;
      double result4;


      result1 = number1 / number2;
      System.out.println("result one is: " + result1 );
      result2 = number1 % number2;
      System.out.println("result two is: " + result2 );
      result3 = number3/number4;
      System.out.println("result three is: " + result3 );
      result4 = number3/number4;
      System.out.println("result four is: " + result4 );


      System.out.println("what is the cost ? ");
      cost = keyboard.nextDouble();
      System.out.println("the cost is " + cost);
      */

      double radius = 5;
      System.out.println("Circle radius = " + df.format(radius) + " to 2 d.p. ");


   }

}//class
