import java.util.Random;
import java.io.*;

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
				SquareThread sThread = new SquareThread(randInteger);
				sThread.start();
			}
			else {
				CubeThread cThread = new CubeThread(randInteger);
				cThread.start();
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
			}
        }
    }
}

class SquareThread extends Thread{
    int n;
    SquareThread(int randomNumber)
    {
        n=randomNumber;
    } 
    public void run() {
		System.out.println("Square of " + n + " = " + (n * n));
	}
    
}

class CubeThread extends Thread{
    int n;
    CubeThread(int randomNumber)
    {
        n=randomNumber;
    } 
    public void run() {
		System.out.println("Cube of " + n + " = " + (n * n * n));
	}
    
}

class MultiThreadingDemo
{
    public static void main(String args[])
    {
        RandomNumberThread rnt = new RandomNumberThread();
        rnt.start();
    }
}

