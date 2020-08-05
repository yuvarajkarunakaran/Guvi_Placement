package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Guvi_zoho1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();	
		Arrays.sort(a);
		int j=0,count=0,x=0,y=0;
		int b[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			
			b[j]=a[i];
			j+=1;
		}
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				res[count++]=b[x++];
			else
				res[count++]=a[y++];
		}
		for(int i=0;i<a.length;i++)
			System.out.print(res[i] + " ");
	}

}
