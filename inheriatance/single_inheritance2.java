import java.util.Scanner;
class person{
String name;
int age;
String id;
String course;
public person(String name,int age,String id,String course){
this.name=name;
this.age=age;
this.id=id;
this.course=course;
}
public void display(){
System.out.println("name "+name);
System.out.println("age "+age);

System.out.println("id "+id);

System.out.println("course "+course);
}
}
class student extends person{
public student(String name,int age,String id,String course){
super( name,age,id, course);
}
public void display(){
super.display();
}
}
public class single_inheritance2{
public static void main(String[]args){
Scanner hi=new Scanner(System.in);
System.out.println(" enter the name ");
String name= hi.nextLine();

System.out.println("enter the age ");
int age= hi.nextInt();

System.out.println("enter the id ");
String id=hi.nextLine();

System.out.println("enter the course ");
String course = hi.nextLine();



student myobj=new student( name,age,  id,course);
myobj.display();
}
}