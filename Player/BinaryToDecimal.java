import java.util.Scanner;
class BinaryToDecimal {
    public static void main(String args[]){
     /*   Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,8));
        System.out.print(Character.toString((char) 69)); */

                    String s1="NPTELJAVA";
                    Scanner inr = new Scanner(System.in);
                    int n = inr.nextInt();
                    char c='a';
        char ch=s1.charAt(n);
        String s=s1.replace(ch,c);
        System.out.print(s);


                }
}
