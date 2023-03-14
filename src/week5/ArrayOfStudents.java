package week5;
import java.util.List;
import java.util.ArrayList;


public class ArrayOfStudents
{

   private List<Student> members;

   public ArrayOfStudents()
   {
      members = new ArrayList<Student>();
   }//ArrayOfStudents 15

   protected int getStudentID(int position)
   {
      return members.get(position).getStudentID();
   }//getStudentID 19

   protected String getName(int position)
   {
      return members.get(position).getName();
   }//getName 23

   protected int getMark1(int position)
   {
      return members.get(position).getMark1();
   }//getMark1 27

   protected int getMark2(int position)
   {
      return members.get(position).getMark2();
   }//getMark2 31

   protected int getMark3(int position)
   {
      return members.get(position).getMark3();
   }//getMark3

   // Return a reference to the current student
   protected Student getCurrent(int position)
   {
      return members.get(position);
   }//getCurrent 40

   protected int getNoOfStudents()
   {
      return members.size();
   }//getNoOfStudents

   // Add Person object to the array
   protected void insert(Student newStudent)
   {
      members.add(newStudent);
      System.out.println(newStudent.getName() + " Added");
   }//insert 50

   protected void removeStudent(int position)
   {
      members.remove(position);
   }//removeStudent 54

   protected void displayEveryone()
   {
      for (Student aStudent : members)
      {
         aStudent.printAllDetails();
      }//for 59
   }//displayEveryone 60
}// class

