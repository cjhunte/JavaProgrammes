package week3;
import java.util.Scanner;
public class act2 {

        public static int getNumber()
        {
            Scanner Keyboard = new Scanner(System.in);
            int answer;
            do{
                System.out.print("(in the range 1 -10cms): ");
                answer = Keyboard.nextInt();
            } while ((answer <1) || (answer > 10));
            return answer;
        }


        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            String colour;
            int length, width, height, volume;

            //Read in the colour of the box 18
            System.out.print("What is the colour of the box? ");
            colour = keyboard.nextLine();


            System.out.print("Enter the length of the box ");
            length = getNumber();
            System.out.println();

            System.out.print("Enter the width of the box ");
            width = getNumber();
            System.out.println();


            System.out.print("Enter the height of the box ");
            height = getNumber();
            System.out.println();

            // Calculate the volume
            volume = length * width * height;

            // Output the dimensions and volume 44
            System.out.print("\nA " + colour + " box measuring (in cms) " +
                    length + " x " + width + " x " + height);
            System.out.println(" has a volume of " + volume + " cm cubed");
        }//main



}
