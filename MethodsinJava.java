class A extends Thread
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Welcome to MultiThreading");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


class MethodsinJava
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is: "+t.getName());
        t.setName("My Thread");
        System.out.println("New Thread name is: "+t.getName());
        A a = new A();
        a.setPriority(10);
        int p=a.getPriority();
        System.out.println("Thread Priority is: "+p);
        a.start();
    }
}