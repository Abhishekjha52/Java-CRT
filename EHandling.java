import java.util.*;
import java.io.*;
class EHandling
{
    public static void main(String args[])
    {
        int n1,n2,d;
        Scanner sc =new Scanner(System.in);
        try
        {
                System.out.println("Enter first number: ");
                n1=Integer.parseInt(sc.next());
                System.out.println("Enter second number: ");
                n2=Integer.parseInt(sc.next());
                d=n1/n2;
                System.out.println("Quotient is: "+d);
        }
        catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero Exception occured");
        }
    }
   
}