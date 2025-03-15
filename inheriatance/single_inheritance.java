class room{
int width;
int length;
public room(int width,int length ){
this.width= width;
this.length= length;
}
public void area()
{
System.out.println("the area of room is" + width*length);
}
}
class volume extends room{
int height;
public volume(int width,int length,int height){
super(width,length);
this.height=height;
}
public void volumeroom(){
System.out.println("the volume of room is" + width*length*height);
}
}
public class single_inheritance{
public static void main(String[] args)
{
room obj = new room(5,6);
volume obj2 = new volume(5,6,3);
obj.area();
obj2.volumeroom();
}
}