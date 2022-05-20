class ChildThread extends Thread{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Abhishek");
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class ChildThreadDemo2
{
    public static void main(String args[])
    {
        ChildThread c = new ChildThread();
        c.start();
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
} 