import java.util.*;
public class Quadratic
{
    public static void main(String args[])
    {
        int a,b,c;
        double d,root1,root2;
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter 3 coefficients: ");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        d=(b*b)-(4*a*c);
        if(d==0)
        {
            System.out.println("Roots are Equal");
            root1=(-b)/(2*a);
            root2=root1;
            System.out.println(root1+" "+root2);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and distinct");
            root1=((-b)+Math.sqrt(d))/2*a;
            root2=((-b)-Math.sqrt(d))/2*a;
            System.out.println(root1+" "+root2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}

