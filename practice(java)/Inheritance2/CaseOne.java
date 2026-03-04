class Reservation{
String name;
String roomtype;
int floornumber;
double rate;
Reservation(){
name = "Walk-in-Guest";
roomtype = "Standard";
floornumber = 0;
rate = 2000;
}

Reservation(String name,String roomtype,int floornumber,double rate){
this.name = name;
this.roomtype = roomtype;
this.floornumber = floornumber;
this.rate = rate;
}

void showGuest(){
System.out.println("The name of the guest is:"+name);
System.out.println("The roomtype is:"+roomtype);
System.out.println("The floornumber alloted is :"+floornumber);
System.out.println("The rent of the room is"+rate);
}

void showAdvance(){
System.out.println("The name of the guest is:"+name);
System.out.println("The roomtype is:"+roomtype);
System.out.println("The floornumber alloted is :"+floornumber);
System.out.println("The rent of the room is"+rate);
}
}

class Refer extends Reservation{
String newGuest;
Refer(Reservation r,String newGuest){
super(r.name,r.roomtype,r.floornumber,r.rate);
this.newGuest = newGuest;
}

void showFriend(){
showAdvance();
System.out.println("THe name of the reffered guest is"+newGuest);
}

}
public class CaseOne{
public static void main(String args[]){
Reservation r1 = new Reservation();
Reservation r2 = new Reservation("John","Luxury",5,3500);
Refer r3 = new Refer(r2,"loius");
r1.showGuest();
r2.showAdvance();
r3.showFriend();
}
}



