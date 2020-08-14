package sample;

import java.util.Scanner;

public class MirrorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<n;i++)
			a1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			a2[i]=sc.nextInt();
		int flag=0;

		for(int i=0;i<n;i++)
		{
			for(int j=n-i-1;j>n-2;j--)
			{
				if(a1[i]!=a2[j]) {
					flag=1;
					break;
				}
			}
			
		}
		if(flag==1)
			System.out.println("no");
		else
			System.out.println("yes");

	}

}
