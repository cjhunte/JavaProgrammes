package company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class fulltimeemployee extends employee

{
   DecimalFormat df = new DecimalFormat("0,000.00");

   private double annualsal;

   public fulltimeemployee()
   {
      super();
   }

   public fulltimeemployee(String empname, String empnum)
   {
      super(empname, empnum);
   }

   protected double getannualsalary()
   {
      return annualsal;
   }

   protected double setannualsalary(double empsalary)
   {
      return annualsal = empsalary;
   }

   protected double calculatemonthlypay()
   {
      return annualsal / 12;
   }

   @Override
   protected void welcome()
   {
      System.out.println("welcome to full time employee class");
   }
   public String tostring()
   {
      return (super.tostring() + "Monthly Pay:  £" + df.format(calculatemonthlypay()) + "\n");
   }
   protected String getstatus()
   {
      return ("Full-Time");
   }

}
