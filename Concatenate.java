import java.util.*;
class Concatenate {
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two strings: ");
        s1=sc.nextLine();
        s2=sc.nextLine();
        String s3=s1.concat(s2);
        System.out.println("Result: "+s3);  
    }  
}
