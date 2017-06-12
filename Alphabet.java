import java.io.*;
import java.util.*;
public class Alphabet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []a=s.toCharArray();
        int b=a[0];
        if((64<b||96<b)&&(91>b||123>b))
        {
            System.out.println("Alphabet");
        
        }
        else
        {
            System.out.println("not alphabet");
        }
    }
    
}
