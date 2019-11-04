import java.util.Scanner;

public class SortRowCol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n1][m];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //row sort


    }}