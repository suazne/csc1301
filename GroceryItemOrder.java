//Suzanne Schouest Lab 10 CSC 1301 Hon

/*I am aware that this is incomplete but I am very stuck and need to make more of an effort to understand 
how ArrayLists work in these scenarios and how to reference them and work with them. I am not sure if partial 
credit is possible because the file doesn't run, but I didn't want to not turn in anything at all*/

import java.util.ArrayList;
public class GroceryItemOrder /*represents a request to purchase a particular item in a given quantity and 
stores an item quantity and a price per unit*/
{
   
   String name;
   int quantity;
   double pricePerUnit;
   
   public GroceryItemOrder(String name, int quantity, double pricePerUnit) //Constructs an item order to purchase the item with the given name, quantity, and given price per unit
   {
      name = this.name;
      quantity = this.quantity;
      pricePerUnit = this.pricePerUnit;
   }
   
   public double getCost()//Returns the total cost of this item in its given quantity
   {
      return (quantity*pricePerUnit);
   }
   
   public void setQuantity(int q)//Sets this grocery item's quantity to be the given value
   {
      quantity = q;
   }
}