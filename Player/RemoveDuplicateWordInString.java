import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateWordInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] a=str.split(" ");

        for(int i=0;i<a.length;i++) {
            if (a[i] != null){
                for (int j = i + 1; j < a.length ; j++) {
                    if (a[i].equals(a[j])) {
                    a[j]=null;

                    }
                }
        }
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]!=null)
                System.out.print(a[i]+ " ");
        }

    }
}
