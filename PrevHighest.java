//wap to find prevHighest
import java.util.*;
class PrevHighest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String n=sc.nextLine();
		for(int i=Integer.valueOf(s)-1;i>=0;i--)
		{
			if(String.valueOf(i).contains(n))
			{}
			else
			{
				System.out.println(i);
				break;
			}
		}
	}
	
}
	