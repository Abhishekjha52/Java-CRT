//wap to revrse the string preserving the spaces
import java.util.*;
class ReverseWithSpaces
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.replaceAll(" ","");
		int index=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				System.out.print(" ");
			else
			{
				System.out.print(s1.charAt(index));
				index--;
			}
		}
	}
}