import java.util.*;
public class TwoDArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter no of columns: ");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter "+r*c+" elements: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements are: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}