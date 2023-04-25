package company;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CasualEmployee extends employee
{
  private Double hourlypay;

   public CasualEmployee()
   {
      super();
   }

   public CasualEmployee(String empname, String empnum)
   {
      super(empname, empnum);
   }


   protected Double getHourlypay(double emphourlypay)
   {
      return emphourlypay;
   }
   protected void setHourlypay(Double emphourlypay )
   {
      hourlypay = emphourlypay;
   }
   protected double calculateweeklypay(double emphours)
    {
        return emphours * hourlypay;
    }
   protected String getstatus()
   {
      return ("causual");
   }


}
