import java.util.Scanner;

public class SwapEvenAndOddChar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        if(c.length%2==0)
        {
            for(int i=0;i<c.length;i+=2)
            {
                char temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
            }
        }
        else
        {
            for(int i=0;i<c.length-1;i+=2)
            {
                char temp=c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
            }
        }

        for(int i=0;i<c.length;i++)
            System.out.print(c[i]);
    }
}
