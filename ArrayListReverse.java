import java.util.*;
class RevArrayList 
{
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        Integer n = alist.size();
        for (int i = 0; i < n / 2; i++) 
        {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(n - i - 1));
            alist.set(n - i - 1, temp);
        }
        return alist;
    }
    public void printElements(ArrayList<Integer> alist)
    {
        Integer n = alist.size();
        for (int i = 0; i < n; i++) 
        {
            System.out.print(alist.get(i) + " ");
        }
    }
}
 
public class ArrayListReverse 
{
    public static void main(String[] args)
    {
        RevArrayList r = new RevArrayList();
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  5 elements: ");
        for(int i=0;i<5;i++)
        {
            Integer a = sc.nextInt();
            arrayli.add(a);
        }
        System.out.print("Elements before reversing: ");
        r.printElements(arrayli);
        arrayli = r.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing: ");
        r.printElements(arrayli);
    }
}
