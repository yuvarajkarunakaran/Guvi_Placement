package sample;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[6];
		int ab[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			ab[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			ab[a.length+i]=b[i];
		}
	}

}
