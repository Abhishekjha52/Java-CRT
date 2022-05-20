//wap to toggle vowels upper to lower and vice versa
import java.util.*;
class Toggle
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			//Vowels (lower case)
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				ch=Character.toUpperCase(ch);
				System.out.print(ch);
			}
			//Vowels (upper case)
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				ch=Character.toLowerCase(ch);
				System.out.print(ch);
			}
			//Consonants (lower case)
			else if(ch>='a' && ch<='z'){
				ch=Character.toUpperCase(ch);
				System.out.print(ch);
			}
			//Consonants (Upper Case)
			else if(ch>='A' && ch<='Z'){
				ch=Character.toLowerCase(ch);
				System.out.print(ch);
			}
			else 
			{
				System.out.print(ch);
			}
		}
	}
}