import java.util.*;
public class Add_i_and_j_gives_k {
    public void search(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int c=0;

                    c = a[i] + a[j];
                    for (int k = 0; k < a.length; k++) {
                        if((k>i) && (k>j) &&(j>i)) {
                            if (a[k] == c) {
                                System.out.println(a[i] + " " + a[j] + " " + c);
                            }
                        }
                    }

            }
        }
    }
    public static void main(String args[])
    {
        Add_i_and_j_gives_k a=new Add_i_and_j_gives_k();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a.search(arr);


    }

}
