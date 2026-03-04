import java.util.*;
class reverseNumber{
public static void main(String args[]){

int answer = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int number = sc.nextInt();
while(number>0){
int lastDigit = number%10;
answer = answer*10+lastDigit;
number = number /10;


}
System.out.println(answer);
}

}