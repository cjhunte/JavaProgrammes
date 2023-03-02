package week3;
import java.util.Scanner;
public class act4 {


        public static int getNumber(String side)
        {
            Scanner Keyboard = new Scanner(System.in);
            int answer;
            do{
                System.out.print("(in the range 1 -10cms): ");
                answer = Keyboard.nextInt();
            } while ((answer <1) || (answer > 10));
            return answer;
        }
        public static int CalculateVolume(int length, int width, int height)
        {
            return (length + width + height);
        }


        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            String colour;
            int length, width, height, volume;

            //Read in the colour of the box
            System.out.print("What is the colour of the box? ");
            colour = keyboard.nextLine();


            System.out.print("Enter the length of the box ");
            length = getNumber("length");
            System.out.println();

            System.out.print("Enter the width of the box ");
            width = getNumber("width");
            System.out.println();


            System.out.print("Enter the height of the box ");
            height = getNumber("height");
            System.out.println();

            // Calculate the volume
            volume = length * width * height;

            // Output the dimensions and volume
            System.out.print("\nA " + colour + " box measuring (in cms) " +
                    length + " x " + width + " x " + height);
            System.out.println(" has a volume of " + CalculateVolume(length, width, height) + " cm cubed");
        }//main



}
