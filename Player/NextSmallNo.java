import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextSmallNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem[] = new int[100];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for(int j=i+1;j<n;j++)
            {

            if(arr[j]<arr[i]) {
                list.add(arr[j]);
                flag=1;
                break;
            }

            }
            if(flag==0)
                list.add(-1);
        }
        list.add(-1);
        System.out.print(list);
    }
}
