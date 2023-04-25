package company;

import java.text.DecimalFormat;
import java.util.Scanner;


public class testemployee
{
   static Scanner scany = new Scanner(System.in);

   public static String gettext(String message)
   {
      System.out.print(message);
      return scany.nextLine();
   }

   public static void main(String[]args)
   {
      DecimalFormat df = new DecimalFormat("0,000.00");

      String number, name;
      double annualsal, pay;
      int hours;

      System.out.println("test employee");
      System.out.println("==============");
      number = gettext("employee number");
      name = gettext("employee name");
      employee employee1 = new fulltimeemployee(number,name);
      employee1.welcome();

      System.out.println("test full-time employee");
      System.out.println("==============");
      number = gettext("employee number");
      name = gettext("employee name");
      employee employee2 = new fulltimeemployee(number,name);
      employee2.welcome();

      System.out.println("what is " +employee2.getName()+"'s annual salary £");
      annualsal = scany.nextDouble();
      employee2.getstatus();


   }


}
