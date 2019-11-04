
import java.io.*;
import java.util.*;public class RemoveDuplicateCharInString {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean repeatedChar;
            for (int i = 0; i < chars.length; i++) {
                repeatedChar = false;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        repeatedChar = true;
                        break;
                    }
                }
                if (!repeatedChar) {
                    sb.append(chars[i]);
                }
            }
            System.out.print(sb.toString());
        }
    }

