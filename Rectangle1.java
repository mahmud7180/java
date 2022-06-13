public class Rectangle1
{
double length;
double width;
Rectangle1()
{
setLength(5);
setWidth(6);
getLength( );
 getWidth();
 getArea();
}
Rectangle1(double length, double width)
{
setLength(length);
setWidth(width);
System.out.print("Lenght:"+getLength( ));
System.out.print("\nWidth:"+ getWidth());
System.out.print("\nArea:"+getArea());
}
void setLength(double l)
{
length=l;
}
void setWidth(double w)
{
width=w;
}
double getLength( )
{
return length;
}
double getWidth( )
{
return width;
}
double getArea( )
{
return length*width;
}
}