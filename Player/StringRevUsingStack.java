package sample;

import java.util.Stack;

public class StringRevUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack=new Stack<Character>();
		String str="hello to everyone";
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		char a[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			a[i]=stack.pop();
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
		
		int no=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==' ')
			{
				for(int j=i-1;j>=no;j--)
				{
					System.out.print(a[j] );
				}
				System.out.print(" ");
				no=i;
			}
					
		}
		for(int i=a.length-1;i>=no;i--)
			System.out.print(a[i]);
		

	}

}
