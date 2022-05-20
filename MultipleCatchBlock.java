import java.net.MalformedURLException;
import java.net.URL;

public class MultipleCatchBlock {
    public static void main(String args[])
    {
    MultipleCatchBlock mb=new MultipleCatchBlock();
    mb.execute(1);
    mb.execute(2);
    }
    public void execute(int i){
    try {
        if(i==1)
        {
            getIntValue("5l");
        }
        else
        {
            getUrlObj("www.google.com");
        }  
    } 
    catch (NumberFormatException nfe) {
            System.out.println("Inside NumberFormatException.."+nfe.getMessage());
    }
    catch (MalformedURLException mue)
    {
        System.out.println("Inside MalformatException..."+mue.getMessage());
    }
    catch(Exception e)
    {
        System.out.println("Inside Exception..."+e.getMessage());
    }
}
public int getIntValue(String num)
{
    return Integer.parseInt(num);
}
public URL getUrlObj(String urlStr) throws MalformedURLException
{
    return new URL(urlStr);
}
}
