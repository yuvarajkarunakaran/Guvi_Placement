import java.util.Scanner;

public class MinElementInArrayWithoutSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int small=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        small=a[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {

                if(small>a[j])
                    small=a[j];
            }
        }
        System.out.print(small);
    }
}
