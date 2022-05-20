import java.util.*;
class AlphabeticalOrder
{
	public static void main(String args[])
	{
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of names: ");
		n=sc.nextInt();
		String names[]=new String[n];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter names: ");
		for(int i=0;i<n;i++)
		{
			names[i]=sc1.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Names in sorted order: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
	}
}
					
		
				