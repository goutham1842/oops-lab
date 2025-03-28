import java.util.Scanner;
class shape{
int radius;
int bredth;
int height;
public shape(int radius,int bredth,int height){
this.radius=radius;
this.bredth=bredth;
this.height=height;
}
}
class  circle extends shape{
public circle(int radius){
super(radius,0,0);
}
public double area(){
return 22/7*radius*radius;
}
public double perimeter()
{
return 2*22/7*radius;
}
}
class rectangle extends shape{

public rectangle(int bredth,int height){
super(0,bredth,height);
}
public double areaofrect()
{
return height*bredth;
}
public double periofrect()
{
return 2*(height+bredth);
}
}
public class Hierarchicaltwo{
public static void main(String[]args)
{
Scanner hi = new Scanner(System.in);
System.out.println("enter the value of radius");
int radius= hi.nextInt();

System.out.println("enter the  vaulue of height");
int height = hi.nextInt();

System.out.println("enter the  vaulue of bredth");
int bredth = hi.nextInt();



shape obj = new shape( radius, height, bredth);
circle obj2 = new circle( radius);
System.out.println("the area of circle is"+obj2.area());
System.out.println("the perimeter of circle is"+obj2.perimeter());
rectangle obj3 = new rectangle( bredth,height);
System.out.println("the area of the rectangle"+obj3.areaofrect());
System.out.println("the perimeter of rect is"+obj3.periofrect());

}
}