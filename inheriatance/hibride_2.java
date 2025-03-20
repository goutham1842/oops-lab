interface connect_wifi{
public void conect();
}
interface playmusic{
public void onmusic();
}
class device{
String brand;
int year;

public device(String brand,int year)
{
this.brand=brand;
this.year=year;
}
public void display_info()
{
System.out.println("brand "+brand);
System.out.println("year "+year);
}
}
class smartwatch extends device implements  connect_wifi, playmusic
{
public smartwatch(String brand,int year){
super(brand,year);
}
public  void conect(){
System.out.println("smart watch can connect wifi");
}
public  void onmusic()
{
System.out.println("smart watch can play music");
}
public void display_info()
{
super.display_info();
}
}
class smartphone extends device implements  connect_wifi, playmusic
{
int camera;
public smartphone(String brand,int year,int camera){
super(brand,year);
System.out.println("camera with the pixel "+ camera);
}



public  void conect(){
System.out.println("smart phone can connect wifi");
}
public  void onmusic()
{
System.out.println("smart phone can play music");
}
public void display_info()
{
super.display_info();
}
public void smartcam()
{
System.out.println("smart phone have smartcam");
}
}
public class hibride_2{
public static void main(String[] args){

 smartwatch hi = new  smartwatch("APPLE",2006);
hi.conect();
hi.onmusic();
hi. display_info();

smartphone bye= new smartphone("SAMSUNG" , 2025,90);
bye.conect();
bye.onmusic();
bye. display_info();
bye.smartcam();
}
}


