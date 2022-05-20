//wap to find the frquency of given char without using if or for or switch or maps
import java.util.*;
class Freq
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		int len=str.length();
		String s1=str.replaceAll("l","");
		int len1=s1.length();
		//System.out.println(len+ " " +len1);
		System.out.println("Frequency of character is: "+(len-len1));
	}
}
		