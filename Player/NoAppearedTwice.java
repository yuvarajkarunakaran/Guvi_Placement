import java.util.Scanner;
    public class NoAppearedTwice {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int tem[]=new int[100];
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int x:arr)
            {
                tem[x]++;
            }
            for(int i=0;i<tem.length;i++)
            {
                if(tem[i]==2)
                {
                    System.out.print(i+ " ");
                }
            }
        }
    }




