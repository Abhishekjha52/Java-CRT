import java.util.Random;
class Factorial extends Thread
{
    int x;
    Factorial(int n)
    {
        x = n;
    }
    public void run()
    {
        int f=1;
        for(int i=1;i<=x;i++)
            f = f * i;
        System.out.println("Factorial of " + x + " = " + f);
    }
}
class Prime extends Thread
{
    int x;
    Prime(int n)
    {
        x = n;
    }
    public void run()
    {
        boolean flag=false;
        for(int i=2;i<=(x/2);i++)
        {
            if (x % i == 0) 
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(x + " is a prime number.");
        else
            System.out.println(x + " is not a prime number.");
    }
}
class Number extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i =0; i<5; i++)
        {
            int randomInteger = random.nextInt(10);
            System.out.println("Random Integer generated : " + randomInteger);
            Factorial f = new Factorial(randomInteger);
            f.start();
            Prime p = new Prime(randomInteger);
            p.start();
            try {
                Thread.sleep(1000);
                } 
            catch (InterruptedException ex) {
                System.out.println(ex);
                }
        }
    }
}
public class P3
{
    public static void main(String args[])
    {
        Number n = new Number();
        n.start();
    }
}
