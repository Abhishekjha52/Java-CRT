//wap to reverse the word in a sentence
import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb=new StringBuffer(arr[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
	}
}
		