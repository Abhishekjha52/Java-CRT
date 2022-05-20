//hello world
//first non rep-h
//first rep-l
//second rep unique-o
//second non-rep-e

//lastIndexOf--returns last occurence of character
import java.util.*;
class RepNonRep
{
	static int c=0;
	public static String firstRep(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int lastIndex=s.lastIndexOf(ch);
			if(i!=lastIndex)
				return ch+"";
		}
		return null;
	}
	public static String firstNonRep(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int lastIndex=s.lastIndexOf(ch);
			if(i==lastIndex)
				return ch+"";
		}
		return null;
	}
	public static String secondRep(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int lastIndex=s.lastIndexOf(ch);
			if(i!=lastIndex)
			{
				c++;
				s=s.replaceAll(ch+"","");
				i--;
				if(c==2)
					return ch+"";
			}
		}
		return null;
	}
	public static String secondNonRep(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int lastIndex=s.lastIndexOf(ch);
			if(i==lastIndex)
			{
				c++;
				s=s.replaceAll(ch+"","");
				i--;
				if(c==1)
					return ch+"";
			}
		}
		return null;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("First repeating character: "+firstRep(s));
		System.out.println("First non-repeating character: "+firstNonRep(s));
		System.out.println("Second repeating character: "+secondRep(s));
		System.out.println("Second non-repeating character: "+secondNonRep(s));
	}
}
