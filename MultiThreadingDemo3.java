import java.util.Random;


class RandomNumberThread extends Thread
{
    public void run()
    {
        Random r = new Random();
        for(int i=0;i<5;i++)
        {
            int randInteger = r.nextInt(50);
            System.out.println("Random Integer generated: "+randInteger);
            if((randInteger%2) == 0) {
				PrintThread pThread = new PrintThread(randInteger);
				pThread.start();
			}
			else {
				TableThread tThread = new TableThread(randInteger);
				tThread.start();
			}
			try {
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
        }
    }
}

class PrintThread extends Thread{
    int n;
    PrintThread(int randomNumber)
    {
        n=randomNumber;
    } 
    public void run() {
		System.out.println("Number generated: "+ n);
	}   
}

class TableThread extends Thread{
    int n;
    TableThread(int randomNumber)
    {
        n=randomNumber;
    } 
    public void run() {
        for(int i=1;i<=10;i++)
        {
		    System.out.println(n+" "+"x"+" "+i+" "+"="+" "+n*i);
        }
	}
    
}

class MultiThreadingDemo3
{
    public static void main(String args[])
    {
        RandomNumberThread rnt = new RandomNumberThread();
        rnt.start();
    }
}

