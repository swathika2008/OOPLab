class Calculator{
public int add(int a, int b){
return a + b;
}
protected void display(){
System.out.println("This is addition");
}
public void show(){
System.out.println("Hello world");
}
public void accessPrivate(){
show();
}
}
class AdvancedCalculator extends Calculator{
public double add(double a , double b){
return a+b;
}
public void display(){
System.out.println("Advanced calculator display");
}

public void show(){
System.out.println("AdvancedCalculator");
}
 }
public class Cal{
public static void main(String args[]){
Calculator c1 = new Calculator();
AdvancedCalculator a1 = new AdvancedCalculator();
System.out.println(c1.add(10,11));
c1.display();
c1.show();
System.out.println(a1.add(1.89,1.01));
a1.show();
a1.display();
}
}