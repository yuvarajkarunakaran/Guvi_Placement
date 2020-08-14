package sample;

import java.util.Scanner;

public class InterchangeBetweenTheWordAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count+=1;
		}
		System.out.println(count);
		String s[]=str.split(" ");
		for(String i:s)
			System.out.print(i+ " ");
		System.out.println();

		for(int i=1;i<s.length-1;i++)
		{
			if(s[i].equalsIgnoreCase("and"))
			{
				String temp=s[i-1];
				s[i-1]=s[i+1];
				s[i+1]=temp;
				
			}
		}
		for(String i:s)
			System.out.print(i+ " ");

	}

}
