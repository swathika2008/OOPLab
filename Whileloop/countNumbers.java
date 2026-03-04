import java.util.*;
class countNumbers{
public static void main(String args[]){
int count = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to count:");
int number = sc.nextInt();
if(number == 0){
System.out.println("1");
}
else{
while(number>0){
number = number/10;
count++;
}
}
System.out.println(count);
}

}