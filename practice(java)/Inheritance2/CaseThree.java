class Patient{
int idCounter = 1001;
int id;
String name;
int age;
String ward;
Patient(){
name = "Unknown";
age = 0;
ward = "Emergency ward";
id = idCounter++;
}
Patient(String name,int age,String ward){
this.name = name;
this.age = age;
this.ward = ward;
id = idCounter++;
}
void Emergency(){
System.out.println("The patient name is:"+ name);
System.out.println("The age is:"+age);
System.out.println("The ward is:"+ward);
System.out.println("The id :"+id);
}
void Opd(){
Emergency();
}
}
class Camp extends Patient{
String record;
Camp(String name,int age,String ward,String record ){
super(name,age,ward);
this.record = record;
id = idCounter++;
}
void camp(){
Opd();
System.out.println("The health record:"+record);
}
}
class CopyCamp extends Patient{
String newWard;
CopyCamp(Patient.p, String newWard)
super(p.name,p.age,p.record,newWard);
this.newWard = newWard;
id = idCounter++;
}
void copy(){
camp();
System.out.println("The new ward from camp is"+newWard);
}
}
public class CaseThree{
public static void main(String args[]){
Patient p1 = new Patient();
Patient p2 = new Patient("NonVeg Combo",2,"Home Address on File");
Camp p3 = new Camp("North Indian Thali",3,"1/21 2nd street","put more spice");
CopyCamp p4 = new CopyCamp(p3,"General ward");
p1.Emergency();
p2.Opd();
p3.camp();
p4.copy();

}
}