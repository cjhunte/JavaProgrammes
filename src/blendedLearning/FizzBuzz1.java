package blendedLearning;

import java.util.Scanner;

public class FizzBuzz1
{
    public static void main (String[] args)
    {

        System.out.println("Enter a whole integer");

        Scanner keyboard = new Scanner(System.in);
        double FizzOBuzz = keyboard.nextDouble();


        if (FizzOBuzz % 3 == 0 && FizzOBuzz % 7 != 0 )
        {
            System.out.println("FIZZ");

        }

        if (FizzOBuzz % 7 == 0 && FizzOBuzz % 3 != 0)
        {
            System.out.println("BUZZ");

        }


        if (FizzOBuzz >= 0 && FizzOBuzz % 7 != 0 && FizzOBuzz % 3 != 0)
        {
            System.out.println(FizzOBuzz);
        }

        if (FizzOBuzz % 7 == 0 && FizzOBuzz % 3 == 0 )
        {
            System.out.println("FIZZBUZZ");

        }


    }

}
