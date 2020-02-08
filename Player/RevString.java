    import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            String temp=str[i];
            for(int j=temp.length()-1;j>=0;j--)
            {
                if(j==temp.length()-1)
                    System.out.print(Character.toUpperCase(temp.charAt(j)));
                else
                    System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
    }
}