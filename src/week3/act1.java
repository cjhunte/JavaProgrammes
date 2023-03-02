package week3;
import java.util.Scanner;


public class act1 {



    /** 3
     * Created by: Janet Allison 4
     * Created on: 08/02/21 5
     * Program to read in the colour, length, width and height of a box  6
     * and calculate and output the volume 7
     */



        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            String colour;
            int length, width, height, volume;

            //Read in the colour of the box 18
            System.out.print("What is the colour of the box? ");
            colour = keyboard.nextLine();

            // Read in the length, width and height of the box and check each is in the range 1-10
            do {
                System.out.print("Enter the length of the box 24 (in the range 1 - 10cms): ");
                length = keyboard.nextInt();
            } while ((length < 1) || (length > 10));
            System.out.println();

            do {
                System.out.print("Enter the width of the box30 (in the range 1 - 10cms): ");
                width = keyboard.nextInt();
            } while ((width < 1) || (width > 10));
            System.out.println();

            do {
                System.out.print("Enter the height of the box36 (in the range 1 - 10cms): ");
                height = keyboard.nextInt();
            } while ((height < 1) || (height > 10));
            System.out.println();

            // Calculate the volume
            volume = length * width * height;

            // Output the dimensions and volume 44
            System.out.print("\nA " + colour + " box measuring (in cms) " +
                    length + " x " + width + " x " + height);
            System.out.println(" has a volume of " + volume + " cm cubed");
        }//main



}
