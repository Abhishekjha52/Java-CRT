//wap to count special vowels
import java.util.*;
class CountSpecial
{
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s);
		int c=0;
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s1.charAt(i) && isVowel(s.charAt(i)))
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
















//1 3 4

//0  1  2  3  4  5
//n  o  t  i  o  n


//n  o  i  t  o  n

		