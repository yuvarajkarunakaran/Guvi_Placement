package sample;
import java.util.*;
public class AlphabeticallyLargestInbothLowerAndUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=solution(str);
		System.out.println(ans);

	}

	private static String solution(String str) {
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(Character.isUpperCase(str.charAt(i)))
				{
					if(Character.toLowerCase(str.charAt(i))==str.charAt(j))
					{
						if((int)str.charAt(i)>max)
							max=(int)str.charAt(i);
					}
				}
				else
				{
					if(Character.toUpperCase(str.charAt(i))==str.charAt(j))
					{
						if((int)str.charAt(j)>max)
							max=(int)str.charAt(j);
					}
				}
			}
		}
		
		if(max>0)
			return Character.toString(max);
		else
			return "NO";
	}

}
