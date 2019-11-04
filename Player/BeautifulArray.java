import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        if((sum%2==0)&&(sum%3==0)&&(sum%5==0))
           System.out.print("1");
        else
            System.out.print("0");
    }
}
