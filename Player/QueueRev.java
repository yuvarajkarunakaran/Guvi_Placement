package sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			queue.add(sc.nextInt());
		}
		revqueue(queue);	
	}

	private static void revqueue(Queue<Integer> queue) {
		// TODO Auto-generated method stub
		int size=queue.size();
		Queue<Integer> ans=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<queue.size()-1;j++)
			{
				int x=queue.peek();
				queue.remove();
				queue.add(x);
			}
			ans.add(queue.peek());
			queue.remove();
		}
		while(!ans.isEmpty())
		{
			System.out.print(ans.peek()+" ");
			ans.remove();
	
		}
		
			
	}
}
