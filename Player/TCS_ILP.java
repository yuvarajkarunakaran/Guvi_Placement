import java.util.*;
import java.io.*;
class TCS_ILP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        int mq[] = new int[4];
        int cq[] = new int[4];
        int thres[] = new int[4];
        for (int i = 0; i < 4; i++) {
            id[i] = sc.nextInt();
            mq[i] = sc.nextInt();
            cq[i] = sc.nextInt();
            thres[i] = sc.nextInt();
        }
        int limit=sc.nextInt();
        int temp[]=new int[4];
        for(int i=0;i<4;i++)
        {
            if(thres[i]<=limit)
                temp[i]=i;
        }
        for(int i=0;i<4;i++)
        {
            if(temp[i]>=74)
                System.out.print(i +"hell");
            else if((temp[i]>=50) && (temp[i]<=74))
                System.out.print(i+"hell yeah");
            else
                System.out.print(i+"hell yeah voo");
        }
    }
}