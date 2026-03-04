import java.util.*;
class Studentmarks{
public static void main(String args[]){
int maths,science,physics,chemistry,comp;
double final_score;
Scanner sc = new Scanner(System.in);
int i = 1;
int n = sc.nextInt();
while(i<=n){
System.out.println("Enter mark of maths:");
 maths = sc.nextInt();
System.out.println("Enter mark of science:");
science = sc.nextInt();
System.out.println("Enter mark of physics:");
physics = sc.nextInt();
System.out.println("Enter mark of chemistry:");
chemistry = sc.nextInt();
System.out.println("Enter mark of comp:");
comp = sc.nextInt();
i++;
final_score = (maths+science+physics+chemistry)/5;

final_score = (maths+science+physics+chemistry)/5;
if(final_score>=90){
System.out.println("Very Good");
}
else if(final_score>=80){
System.out.println("Good");
}
}
}
}