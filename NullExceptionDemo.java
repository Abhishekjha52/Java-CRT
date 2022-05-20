import java.util.*;
class NullExceptionDemo
{
    public static void main(String args[])
    {
        String s=null;
        try
        {
            if (s.equals("Abhi")) 
                System.out.print("Same"); 
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}