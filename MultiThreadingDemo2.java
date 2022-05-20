import java.util.Random;
import java.math.BigInteger;

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
				FactorialThread fThread = new FactorialThread(randInteger);
				fThread.start();
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

class FactorialThread extends Thread{
    int n;
    FactorialThread(int randomNumber)
    {
        n=randomNumber;
    } 
    public void run() {
        BigInteger f = BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }
		System.out.println("Factorial of " + n + " = " + f);
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

class MultiThreadingDemo2
{
    public static void main(String args[])
    {
        RandomNumberThread rnt = new RandomNumberThread();
        rnt.start();
    }
}

