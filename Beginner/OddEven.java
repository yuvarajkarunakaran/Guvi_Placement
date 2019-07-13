/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guvi;

import java.util.Scanner;

/**
 *
 * @author yuvi
 */
public class OddEven {
    public static void main(String args[])
    {
    int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n%2==0)
           System.out.println("Even");
       else 
           System.out.println("Odd");
    }
    
}
