import java.util.*;
class overloadDemo
{
    void add(int i,int j)
    {
        System.out.println("i and j: "+i+" "+j);
    }
    void add(double i,double j)
    {
        System.out.println("i and j: "+i+" "+j);
    }
    void add(String i,String j)
    {
        System.out.println("i and j: "+i+" "+j);
    }
}
public class overloading 
{
    public static void main(String args[])
    {
        overloadDemo ob = new overloadDemo();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Enter two doubles: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter two strings: ");
        String x=sc.next();
        String y=sc.next();
        ob.add(i,j);
        ob.add(a,b);
        ob.add(x,y);
    }
    
}
