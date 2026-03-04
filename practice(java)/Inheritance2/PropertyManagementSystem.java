class Father{
double landArea;
String propertyType;
Father(double landArea, String propertyType){
this.landArea = landArea;
this.propertyType = propertyType;
}
void showProperty(){
System.out.println("Total land area owned by the family:"+landArea);
System.out.println("Type of the property owned:"+propertyType);

}
}
class childOne extends Father{
String usage;
childOne(double landArea , String propertyType, String usage){
super(landArea, propertyType);
this.usage = usage;
}
void showUsage(){
showProperty();
System.out.println("Type of utilisation of property bt childOne:"+usage);
}
}
class childTwo extends Father{
String usage;
childTwo(double landArea , String propertyType, String usage){
super(landArea, propertyType);
this.usage = usage;
}
void showUsage(){
showProperty();
System.out.println("Type of utilisation of property by childTwo:"+usage);
}
}
public class PropertyManagementSystem{
public static void main(String args[]){
childOne c1 = new childOne(75.5,"farm land","bunglow construction");
childOne c2 = new childOne(75.5,"farm land","factory construction");
c1.showUsage();
c2.showUsage();
}
}