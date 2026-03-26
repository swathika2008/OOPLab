class Calculator{
public int add(int a ,int b){
return a+b;
}
protected int add(int c , int d, int e){
return c+d+e;
}
private double add(double f,double g){
return f+g;
}
public void display(){
System.out.println(add(3.45,6.35));
}
}

public class Main{
public static void main(String args []){
Calculator c1 = new Calculator();
System.out.println(c1.add(5,6));
System.out.println(c1.add(5,6,7));
c1.display();
}
} 