import java.util.Scanner;

public class NoRev {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,sum=0;
        while(n!=0)
        {
            temp=n%10;
            sum=sum*10+temp;
            n=n/10;
        }
        System.out.print(sum);
    }

}
