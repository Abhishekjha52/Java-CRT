import java.util.*;
class float
{
    public static void main(String args[])
    {
        float a,b;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=Sc.nextFloat();
        b=Sc.nextFloat();
        float c=a%b;
        System.out.println("Rem is: "+c);

    }
}