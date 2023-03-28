///// 60004087 \/ Connor hunter \\\\\\\
// property.java class
// this class takes the values of a property and changes them via overloading and overriding so that the new values may replace the old values entered
// *created 01/03/23*
////\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
package EstateAgents;// this is the package the class is contained within.

import java.util.ArrayList;////these are our import statments that are required in order to import the required libraries for our code.
import java.util.List;
import java.util.Arrays;
import java.util.AbstractList;

public class ArrayOfProperties///this is our class to contain an array of the property details.
{
   private List<property> PropertiesL;////this creates a private list for our properties to be held on.

   public ArrayOfProperties()
{
   PropertiesL = new ArrayList<property>();///create a new list.
}//Property array this is the constructor method for our array that will contain property details on file.

   protected property Getcurr(int position)
   {
      return PropertiesL.get(position);//this returns the position.
   }//selects choosen property this searches the list to see what the current position is in order to find out where we are currently in the list or array.
   protected int GetNumProp()
   {
      return PropertiesL.size();//this returns the amount of elements.
   }//tells us how many properties are registered on the system by returning the size of the number of elements array.

   protected String GetStreet(int position)
   {
      return PropertiesL.get(position).getAddReslin();///this gets the position specified then gets the street name to be displayed.
   }//selects chosen property and displays the address via the number in the list.

   protected void insert(property newproperty)
   {
      PropertiesL.add(newproperty);////this adds our property to our list of properties.
      System.out.println(newproperty.getfulladd() + " Added");////this is our display to the user
   }//inserts new property into the list then displays that the property has been added.

   protected void removeprop(int position, property delprop)
   {
      PropertiesL.remove(position);/////this removes our property from our list of properties.//
      System.out.println(delprop.getfulladd() + " Removed");///this is our display to the user
   }//removes property selected out of the list then displays that the property has been removed.

   protected int findPropertyByStreet(String street)
   {
      int index = 0;          ////here we are initialising values
      boolean found = false;
      int position = -1;

      do///do this loop until the value is found.
      {

      if (PropertiesL.get(index).getAddReslin() == street)///if the street matches then found is true and the loop ends.
      {
         found = true;
         position = index;
      }
      index ++;////checks the next value in the list if it has not been found.

      }while(found = false && index < PropertiesL.size());
      return position;////this returns the result of the search if it is found.
   }////this allows the property to be viewed by typing in the street name and the code runs until the street is found, or it meets the end of the list.

   protected ArrayList<Integer> findPropertyByTown(String town)
   {
      int index = 0;//initializes a value
      ArrayList<Integer> result = new ArrayList<Integer>();///this creates a new list for storing the properties found by town.

      for (int i=0; i< PropertiesL.size(); i++);///for each property that is in the full array check full array.
      {
         if (PropertiesL.get(index).getTown() == town)///if the property is in the town then add it to the index of found in that town properties.
         {
            result.add(index);

         }
      }return result;////returns the result of what was found in that town.
   }///this allows the user to search by town and well return all the addresses for sale in that town in a list format.

   protected void displayAprop(int position)
    {
       PropertiesL.get(position).displaypropertydetails();////gets the position and checks the property at that index.
    }////this displays a particular property at a specific position.


   protected void displayAllprop()
   {
      for (property allProp : PropertiesL)///for each property in propertiesL display all property
      {
         allProp.displaypropertydetails();////all property displays to the user.
      }
   }////this displays all property available.

}
