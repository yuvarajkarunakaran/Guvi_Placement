import java.io.*;
import java.util.*;
public class StringRev {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.print(n.length());
        for(int i=n.length()-1;i>=0;i--)
        {
            System.out.print(n.charAt(i));
        }
    }

}
