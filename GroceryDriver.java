//Suzanne Schouest Lab 10 CSC 1301 Hon

/*I am aware that this is incomplete but I am very stuck and need to make more of an effort to understand 
how ArrayLists work in these scenarios and how to reference them and work with them. I am not sure if partial 
credit is possible because the file doesn't run, but I didn't want to not turn in anything at all*/

public class GroceryDriver
{
public static void main(String args[])
{
   GroceryList list1 = new GroceryList();
   
   //establishing quantities and costs
   GroceryItemOrder peach = new GroceryItemOrder("peach",1,.50);
   GroceryItemOrder cereal = new GroceryItemOrder("Box of Cereal", 1, 3.99);
   GroceryItemOrder juice = new GroceryItemOrder("Bottle of Orange Juice", 1, 5.99);
   GroceryItemOrder bread = new GroceryItemOrder("Loaf of bread", 1, 5.69);
   GroceryItemOrder avocados = new GroceryItemOrder("Avocados", 3, 1.50);
   GroceryItemOrder iceCream = new GroceryItemOrder("Quart of Ice Cream", 1, 3.99);
   
   //add items to grocery list
   list1.add(peach);
   list1.add(cereal);
   list1.add(juice);
   list1.add(bread);
   list1.add(avocados);
   list1.add(iceCream);
   
   //print out grocery list
   System.out.println(list1);
   
   //determine cost of singular item based on quantity
   System.out.println("The cost of the avocados on the list will be $" + avocados.getCost());
   
   //determine total cost of grocery list
   //System.out.println("The total cost of the grocery list is $" + gList.getTotalCost());
   
}
}
   