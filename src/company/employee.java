package company;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class employee
{
   private String name;
   private String number;

   public employee()
   {

   }

   public employee(String empnum, String empname)
   {
      number = empnum;
      name = empname;
   }

   protected String getNumber()
   {
      return number;
   }
   protected String getName()
   {
      return name;
   }

   public void setname(String empname)
   {
      this.name = empname;
   }
   public void setnum(String empnum)
   {
      this.number = empnum;
   }

   protected void welcome(){
      System.out.println("welcome to the employee class");
   }

   public String tostring()
   {
      return "Employee" + number + "is called" + name + "\n";
   }

   abstract protected String getstatus();

}
