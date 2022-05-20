import java.util.*;
class A
{
    int a,b;
    A(int i)
    {
	a=i;
	b=i;
    }
    A(int i,int j)
    {
        a=i;
	b=j;
    }
    void disp()
    {
	System.out.println(a);
	System.out.println(b);
    }
}

public class constructorOverloading {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        A a = new A(i);
        A b = new A(x,y);
	a.disp();
	b.disp();


    }
    
}
