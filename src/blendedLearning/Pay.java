package blendedLearning;
import java.text.*;
import java.util.Scanner;

public class Pay

{
    public static void main (String[] args)
    {
        double EmployeePay = 0 ;
        DecimalFormat df = new DecimalFormat("00.00");


        System.out.println("please type your name");

        Scanner stringScanner = new Scanner(System.in);
        String EmployeeName = stringScanner.next();



        System.out.println("how many hours have you worked this week");

        Scanner keyboard = new Scanner(System.in);
        double Employeehours = keyboard.nextDouble();


        if(Employeehours <=40)
        {
           EmployeePay = 10.95 * Employeehours;


        }
        else if (Employeehours >=41)
        {


            Employeehours = (Employeehours - 40);

            EmployeePay = 438 + 14.50 * Employeehours;


        }


        System.out.println("Hi "+EmployeeName+" your weekly pay is : £"+ df.format(EmployeePay));



    }


}


