package sample;

import java.util.ArrayList;

public class NextSmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,7,9,3,2,1,15};
		ArrayList<Integer> res=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					res.add(arr[j]);
					System.out.print(res.get(count++) + " ");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				res.add(-1);
				System.out.print(res.get(count++) + " ");
			}

		}
		

	}

}
