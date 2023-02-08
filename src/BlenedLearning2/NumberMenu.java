package BlenedLearning2;

import java.util.Scanner;
import java.math.*;

public class NumberMenu

{

    public static void main(String[] args) {
        Scanner scany = new Scanner(System.in);
        String response = "";
        do {



            System.out.println("please enter a whole number: ");
            int number = scany.nextInt();
            int Chou;


            do {

                System.out.println("1: Test if zero");
                System.out.println("2: Find Square Root");
                System.out.println("3: Test if Odd or Even");
                System.out.println("4: Enter Another Number or Exit");
                System.out.println("please choose a menu item between (1-4)");
                Chou = scany.nextInt();


                switch (Chou) {


                    case 1:
                        if (number < 0)
                            System.out.println("The number " + number + "is greater than " + 0);
                        else if (number == 0)
                            System.out.println("The number " + number + "is equal to " + 0);
                        else
                            System.out.println("The number " + number + "is less than " + 0);
                        break;
                    case 2:
                        if (number >= 0)
                            System.out.println("The square root of " + number + "is" + Math.sqrt(number));
                        else
                            System.out.println("The number has no square root value");
                        break;
                    case 3:
                        if (number % 2 == 0)
                            System.out.println(number + "is an even number ");
                        else
                            System.out.println(number + "is an odd number");
                        break;
                    case 4:
                        System.out.println("do you want to try another number");
                        response = scany.next();
                        break;
                    default:
                        if ((Chou < 0)||(Chou > 5))
                        System.out.println("Selection invalid");
                        else
                            java.lang.System.exit(0);

                }
            } while (Chou != 4);

        }while("y".equals(response));

    }


}
