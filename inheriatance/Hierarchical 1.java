import java.util.Scanner;
class vehicle{
String brand;
String model;
int rental_price;
public vehicle(String brand,String model,int rental_price){
this.brand=brand;
this.model=model;
this.rental_price=rental_price;
}
public void display_info()
{
System.out.println("vehicle consists of brand"+brand);
System.out.println("vehicle consists of modle"+model);
System.out.println("vehicle consists of rental_price"+rental_price);
}
}
class car extends vehicle{
String fuel_type;
public car(String brand,String model,int rental_price,String fuel_type){
super(brand,model,rental_price);
this.fuel_type=fuel_type;
}
public void display_info()
{
super.display_info();
System.out.println("car fuel is" +fuel_type);
}
}
class bike extends vehicle{
int engine_capacity;
public bike(String brand,String model,int rental_price, int engine_capacity){
super(brand,model,rental_price);
this.engine_capacity=engine_capacity;
}
public void display_info(){
super.display_info();
System.out.println("car capacity is" +engine_capacity);
}
}
public class Hierarchical1{
public static void main(String[]args){
Scanner myobj = new Scanner(System.in);
System.out.println("enter the brand");
String brand=  myobj.nextLine();

System.out.println("enter the model");
String model=myobj.nextLine();

System.out.println("enter the rental_price ");
 int rental_price= myobj.nextInt();
 System.out.println("Choose Vehicle Type (1 for Car, 2 for Bike): ");
        int choice = myobj.nextInt();
        myobj.nextLine();
if(choice==1){
System.out.println("enter th fuel");
String fuel_type = myobj.nextLine();
car obj = new car(brand, model, rental_price, fuel_type);
System.out.println("rental information");
obj.display_info();
}
else if(choice ==2){

System.out.println("enter th capicity");
int engine_capacity = myobj.nextInt();
bike hi = new bike(brand,model, rental_price,engine_capacity);
hi.display_info();
}
else{
System.out.println(" plz enter th valid number");
}
myobj.close();
}
}








