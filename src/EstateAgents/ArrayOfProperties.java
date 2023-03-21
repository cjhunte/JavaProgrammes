package EstateAgents;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.AbstractList;

public class ArrayOfProperties
{
   private List<property> PropertiesL;

   public ArrayOfProperties()
{
   PropertiesL = new ArrayList<property>();
}//Property array.

   protected property Getcurr(int position)
   {
      return PropertiesL.get(position);
   }//selects choosen property
   protected int GetNumProp()
   {
      return PropertiesL.size();
   }//tells us how many properties are registered on the system

   protected String GetStreet(int position)
   {
      return PropertiesL.get(position).getAddReslin();
   }//selects choosen property

   protected void insert(property newproperty)
   {
      PropertiesL.add(newproperty);
      System.out.println(newproperty.getfulladd() + " Added");
   }//inserts new property

   protected void removeprop(int position, property delprop)
   {
      PropertiesL.remove(position);
      System.out.println(delprop.getfulladd() + " Removed");
   }//removes property selected

   protected int findPropertyByStreet(String street)
   {
      int index = 0;
      boolean found = false;
      int position = -1;

      do
      {

      if (PropertiesL.get(index).getAddReslin() == street)
      {
         found = true;
         position = index;
      }
      index ++;

      }while(found = false && index < PropertiesL.size());
      return position;
   }

   protected ArrayList<Integer> findPropertyByTown(String town)
   {
      int index = 0;
      ArrayList<Integer> result = new ArrayList<Integer>();

      for (int i=0; i< PropertiesL.size(); i++);
      {
         if (PropertiesL.get(index).getTown() == town)
         {
            result.add(index);

         }
      }return result;
   }

   protected void displayAprop(int position)
    {
       PropertiesL.get(position).displaypropertydetails();
    }
   protected void displayAllprop()
   {
      for (property allProp : PropertiesL)
      {
         allProp.displaypropertydetails();
      }
   }

}
