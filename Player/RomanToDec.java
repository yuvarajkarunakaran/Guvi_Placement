import java.util.Scanner;

public class RomanToDec {
    int value(char c)
    {
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        return -1;
    }
    public static void main(String args[])
    {
        RomanToDec r=new RomanToDec();

        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int s1,s2,res=0;
        for(int i=0;i<n.length();i++) {

            s1 =r.value(n.charAt(i));
            if (i + 1 < n.length())
            {
                s2 = r.value(n.charAt(i+1));
                System.out.print(s2);
                if(s1>=s2) {
                    res += s1 + s2;

                }
                else  {
                    res += s2 - s1;
                }
            }
            else {
                res += s1;
            }
        }
        System.out.print(res);

        }

    }

