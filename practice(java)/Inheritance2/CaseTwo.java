class Order{
String item;
int Quantity;
String Address;
Order(){
item = "Veg combo";
Quantity = 1;
Address = "To be updated";
}
Order(String item,int Quantity,String Address){
this.item = item;
this.Quantity = Quantity;
this.Address = Address;
}
void QuickOrder(){
System.out.println("The food item name is:"+item);
System.out.println("The food quantity is:"+Quantity);
System.out.println("The Address is:"+ Address);
}
void Other(){
 QuickOrder();
}
}
class Scenario extends Order{
String CookingInstruction;
Scenario(String item,int Quantity,String Address,String CookingInstruction){
super(item,Quantity,Address);
this.CookingInstruction = CookingInstruction;
}
void scenario(){
 Other();
System.out.println("Cooking Instruction:"+CookingInstruction);
}
}
public class CaseTwo{
public static void main(String args[]){
Order o1 = new Order();
Order o2 = new Order("NonVeg Combo",2,"Home Address on File");
Scenario o3 = new Scenario("North Indian Thali",3,"1/21 2nd street","put more spice");
o1.QuickOrder();
o2.Other();
o3.scenario();

}
}