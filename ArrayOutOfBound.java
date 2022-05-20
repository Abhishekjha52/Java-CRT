public class ArrayOutOfBound {
    public static void main(String args[])
    {
        String str[]={"C,C++,Java,Python,Ruby"};
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(str[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
