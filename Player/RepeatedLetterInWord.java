package sample;

public class RepeatedLetterInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Maventic and Maven";
		char a[]=str.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			if(a[i]==' ')
				continue;
			if(a[i]!=0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
						flag=1;
						
					}
					
				}
				if(flag==1)
					count+=1;
			}
		
		}
		System.out.println("Repeated letters "+ count);
		

	}

}
