import java.io.*;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] asc = new int[n];
        int[] des = new int[n];
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
            asc[i]=arr[i];
        Arrays.sort(arr, Collections.reverseOrder());
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i += 2) {
                arr[i] = des[i];
            }
            for (int i = 1; i < n / 2; i += 2) {
                arr[i] = asc[i];
            }
        } else {
            for (int i = 0; i < (n / 2) + 1; i += 2) {
                arr[i] = des[i];
            }
            for (int i = 1; i < n / 2; i += 2) {
                arr[i] = asc[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
