package week5;
import java.util.Scanner;

public class TestArrayOfStudents
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String name;
      int firstMark, secondMark, thirdMark;
      ArrayOfStudents myArray = new ArrayOfStudents();

      // Create a student object
      Student student1 = new Student("John", 34, 56, 67);

      // Add student to the array
      myArray.insert(student1);

      // Prompt for and read in the student name
      System.out.print("Enter student name: ");
      name = keyboard.nextLine();

      // Prompt for and read in marks for student
      System.out.print("Enter first mark for " + name + ": ");
      firstMark = keyboard.nextInt();
      System.out.print("Enter second mark for " + name + ": ");
      secondMark = keyboard.nextInt();
      System.out.print("Enter third mark for " + name + ": ");
      thirdMark = keyboard.nextInt();
      keyboard.nextLine();

      // Create a new student object
      Student student2 = new Student(name, firstMark, secondMark, thirdMark);
      myArray.insert(student2);

      // Output details of all students 40
      myArray.displayEveryone();

      //Return name of student at index position 1 (student2) 43
      //    2 ways of accessing this 44
      System.out.println("\nThe name of the student at index position 1 is: " +
          myArray.getCurrent(1).getName());
      System.out.println("\nThe name of the student at index position 1 is: " +
          myArray.getName(1));
   }//main 49
}//class

