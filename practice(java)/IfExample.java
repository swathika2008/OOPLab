class IfExample{
public static void main(String[] args){
//IF-ELSE
int age = 18;
if(age >= 18)
System.out.println("You are eligible to vote");
else
System.out.println("You are not eligible to vote");
//IF-ELSE LADDER
int marks = 95;
if (marks >= 90){
System.out.println("Grade A");
}
else if(marks >= 80){
System.out.println("Grade B");

}
else if(marks >= 70){
System.out.println("Grade C");
}
//NESTED-IF
int Age = 19;
int weight = 55;
if(Age >=18){
if (weight >= 60)
System.out.println("Eligible for sports");
else
System.out.println("Underweight");
}
else{
System.out.println("Under 18");}
//SWITCH CASE
int a = 7;
int b = 18;
char op = '-';
switch (op){
case '+':System.out.println(a+b);break;
case '-':System.out.println(a-b);break;
case '*':System.out.println(a*b);break;
case '/':System.out.println(a/b);break;

}





}

}

