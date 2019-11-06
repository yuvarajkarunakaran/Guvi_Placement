import java.util.Scanner;

public class SumOfAsciiOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+=(int)str.charAt(i);
        }
        System.out.print(sum);
    }
}
