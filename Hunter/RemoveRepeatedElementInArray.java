
import java.util.*;
import java.util.List;

public class RemoveRepeatedElementInArray {
    public static void main(String args[]) {
        List <Integer> numbers = Arrays.asList(1,2,3,2,3,4,3);
        int arr[] = new int[10];
       // int temp[] = new int[10];
        for(int c: numbers) {
            arr[c]++;
        }
       // for(int x : arr) {
         //   System.out.print(x + " ");
        //}
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >1) {
               count+=1;
            }
        }
        int k=0;
        int [] temp=new int[count];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >1) {
                temp[k]=i;
                k+=1;
            }
        }
         Arrays.sort(temp);
         for(int x : temp) {
           System.out.print(x + " ");
        }

    }
    }

