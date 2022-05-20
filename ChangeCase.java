import java.util.*;
class ChangeCase
{
	public static void main(String args[])
	{
		String s;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		s=sc.nextLine();
		StringBuffer newStr=new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if(Character.isUpperCase(s.charAt(i))) 
			{       
                		newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));    
            		} 
		}
		System.out.println("String after changing case : "+newStr);
	}
}