import java.util.*;
public class Choco
{
	public static void main(String args[])
	{
		int cash=12,cost=3,w=0;
		int choco=0,sum=0;
		int arr[]=new int[10];
		int i=0;
		choco=cash/cost;
		arr[i]=choco;
		i++;
		w=choco;
		do{	
			arr[i]=w/cost;
			w=w%cost;
			w+=arr[i];
			i++;	
		}while(i<10 && w>=cost);
		for( i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
				
	

	}
}
