import java.util.*;
class TransposeMatrix
{
    public static void main(String args[])
    {
        int r,c,temp;
        System.out.println("Enter no of rows: ");
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        System.out.println("Enter no of columns: ");
        c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix before transpose is: ");
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i<j)
                {
                    temp=a[j][i];
                    a[j][i]=a[i][j];
                    a[i][j]=temp;
                }
            }
        }

        System.out.println("Transpose Matrix is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        




    }
}