import java.util.*;
public class password{
public static void main(String args[]){
String password = "Amma@123";
Scanner sc = new Scanner(System.in);
String result ="No";
while(result.equals("No")){
System.out.println("Enter the new password");
String inputpassword = sc.next();
if(password.equals(inputpassword)){
System.out.println("Login sucessfull");
}
else{
System.out.println("Try again");
}
System.out.println("Is the password worked?");
result = sc.next();
}
}
}