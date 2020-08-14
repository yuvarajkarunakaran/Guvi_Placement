package sample;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="IIX";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int s1=no(str.charAt(i));	
			if(i+1<str.length())
			{
				int s2=no(str.charAt(i+1));
				if(s1>=s2)
				{
					sum+=s1;
				}
				else
				{
					sum+=s2-s1;
					i++;
				}
			}
			else
			{
				sum+=s1;
				i++;
			}
			
		}
		System.out.println(sum);
		
		

	}

	private static int no(char c) {
		// TODO Auto-generated method stub
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		return -1;
	}

}
