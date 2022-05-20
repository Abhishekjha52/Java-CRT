//swap first and last words and reverse remaining words
import java.util.*;
class RevAndSwap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		int len=arr.length;
		String swap=arr[0];
		arr[0]=arr[len-1];
		arr[len-1]=swap;

		System.out.print(arr[0]+" ");

		for(int i=1;i<arr.length-1;i++)
		{
			StringBuffer sb= new StringBuffer(arr[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
	
		System.out.print(arr[len-1]);
	}
}