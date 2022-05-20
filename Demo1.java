import java.util.*;
abstract class Shape
{
    int a,b;
    abstract public void print_area(int a,int b);
}
class Rectangle extends Shape
{
    public int area_rect;
    public void print_area(int a,int b)
    {
        area_rect=a*b;
        System.out.println("Area of Recatangle is: "+area_rect);
    }
}
class Triangle extends Shape
{
    double area_triang;
    public void print_area(int a,int b)
    {
        area_triang=a*b*0.5;
        System.out.println("Area of Triangle is: "+area_triang);
    }
}
class Circle extends Shape
{
    double area_circle;
    public void print_area(int a,int b)
    {
        area_circle=3.14*a*a;
        System.out.println("Area of Circle is: "+area_circle);
    }
}
class Demo1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Rectangle r= new Rectangle();
        r.print_area(a,b);
        Triangle t = new Triangle();
        t.print_area(a,b);
        Circle c = new Circle();
        c.print_area(a,b);
    }
}