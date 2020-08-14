package sample;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int flag=0;
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			stack.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=stack.pop())
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("no");
		else
			System.out.println("yes");

	}

}
