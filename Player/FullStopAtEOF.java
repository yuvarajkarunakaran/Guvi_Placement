import java.util.Scanner;

public class FullStopAtEOF {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        System.out.print(str.append("."));
    }
}
