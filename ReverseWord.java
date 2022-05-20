import java.util.*;
class ReverseWord
{
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter string: ");
        str=sc.nextLine();
        String words[]=str.split(" ");
        String reverse=" ";
        for(int i=0;i<words.length;i++)
	{
	    String word=words[i];
            String reverseword="";
            for(int j=word.length()-1;j>=0;j--)
            {
                reverseword = reverseword + word.charAt(j);
            }
            reverse = reverse + reverseword + " ";
        }
	reverse=reverse.trim();
	System.out.println("Reverse Word is:"+reverse);

    }
}