import java.io.*;
public class BufferedReaderExample
{
    public static void main(String args[]) throws Exception
    {
        String s;
        int a;
        float f;
        double d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string: ");
        s=br.readLine();
        System.out.println("Enter Integer: ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter float: ");
        f=Float.parseFloat(br.readLine());
        System.out.println("Enter double: ");
        d=Double.parseDouble(br.readLine());

        System.out.println("String: "+s);
        System.out.println("Integer: "+a);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);


    }
}