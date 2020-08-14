package sample;

import java.util.Scanner;
public class PermutationOfString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permutations(s.toCharArray(),0);
		

	}

	private static void permutations(char[] ch, int currentindex) {
		// TODO Auto-generated method stub
		int count=0;
		if(currentindex==ch.length-1) {
			System.out.println(String.valueOf(ch));
			count+=1;
		}
		for	(int i=currentindex;i<ch.length;i++)
		{
			swap(ch,currentindex,i);
			permutations(ch, currentindex+1);
			swap(ch,currentindex,i);
		}
		
		
		}

	private static void swap(char[] ch, int i, int j) {
		// TODO Auto-generated method stub
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		
	}
	

}
