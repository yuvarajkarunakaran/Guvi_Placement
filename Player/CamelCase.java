import java.util.Scanner;

public class CamelCase {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] parts = s.split(" ");

        StringBuilder sb = new StringBuilder( s.length() );

        for(String part : parts){

            if(part.length() > 1 )
                sb.append( part.substring(0, 1).toUpperCase() )
                        .append( part.substring(1).toLowerCase() );
            else
                sb.append(part.toUpperCase());

            sb.append(" ");
        }
        System.out.print(sb.toString());
    }
}
