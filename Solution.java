import java.util.Scanner;
class PowerDemo 
{
    public void power(int n, int p) throws Exception
    {
        int result;
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        result=(int)Math.pow(n,p);
        System.out.println("Power of "+n+" "+"and"+" "+p+" is: "+result);
    }
}

public class Solution 
{
    public static final PowerDemo pd = new PowerDemo();
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
            System.out.println("Enter first number: ");
            int n = sc.nextInt();
            System.out.println("Enter second number: ");
            int p = sc.nextInt();
            
            try 
            {
                pd.power(n, p);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
    }
}