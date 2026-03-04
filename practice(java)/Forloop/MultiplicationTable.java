import java.util.*;
class MultiplicationTable{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int total = 1;
for(int i = 1; i <=10;i++){
total = n*i;
System.out.println(n +"x"+i + "="+ total);

}
}

}
