import java.io.FileOutputStream;
import java.util.*;
class CreateFile
{
    public static void main(String args[])
    {
        try {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter file name: ");
           String str=sc.nextLine();
           System.out.println("File Created");
           FileOutputStream f =new FileOutputStream(str,true);
           System.out.println("Enter file content: ");
           String con = sc.nextLine();
           byte[] b= str.getBytes();
           f.write(b);
           f.close();
           System.out.println("File saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}