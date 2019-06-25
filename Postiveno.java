/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

public class  Positiveno {

    
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n>0)
           System.out.println("Positive");
       else if(n<0)
           System.out.println("Negative");
       else
             System.out.println("Zero");
         
    }
    
}
