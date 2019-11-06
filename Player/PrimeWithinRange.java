import java.io.*;
import java.util.*;

class PrimeWithinRange {
    public static void main(String[] args) {
        int n1=1,n2=100;
        for(int i=n1;i<=n2;i++)
        {
            int flag=1;
            for(int j=2;j<i/2;j++)
            {
              if(i%j==0)
              {
                 flag=0;
                 break;
              }
            }
            if(flag==1)
                System.out.print(i+ " ");
        }
    }
}
