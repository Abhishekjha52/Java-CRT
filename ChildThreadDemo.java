class ChildThread implements Runnable
{
    Thread t;
    ChildThread()
    {
        t = new Thread(this, "Thread");
        System.out.println("Child Thread is: "+t.getName());
        t.start();
    }
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Abhishek");
                t.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }   
}
class ChildThreadDemo
{
    public static void main(String args[])
    {
        new ChildThread();
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