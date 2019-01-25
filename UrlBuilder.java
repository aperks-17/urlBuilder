import java.util.Scanner;
public class UrlBuilder
{
    public static void main(String[] args)
    {
        urlBuilder();
    }
    public static void urlBuilder()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a domain name e.g. yahoo");
        String domain=input.next();
        System.out.println("http://www."+domain+".com/");
        input.close();
    }
}