//Suzanne Schouest Lab 10 CSC 1301 Hon

/*I am aware that this is incomplete but I am very stuck and need to make more of an effort to understand 
how ArrayLists work in these scenarios and how to reference them and work with them. I am not sure if partial 
credit is possible because the file doesn't run, but I didn't want to not turn in anything at all*/

import java.util.ArrayList;
public class GroceryList //represents a list of items to buy from the market
{
   ArrayList<GroceryItemOrder> gList; //stores the grocery items and keeps track of its size (number of items in the list so far)
   
   public void add(GroceryItemOrder item) //Adds the given item order to this list if the list has fewer than 10 items
   {
      gList.add(item);
   }
   
   public double getTotalCost() //Returns the total sum cost of all grocery item orders in this list
   {
      double TotalCost;
      for (int i = 1; i < gList.size(); i++)
      {
         TotalCost += getCost(i); //ideally, this would add up the cost of each item for the whole list
      }
      return TotalCost;
   }
}
