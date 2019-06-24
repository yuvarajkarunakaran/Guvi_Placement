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
public class VowelOrConsonent {
        public static void main(String args[])
        {
            
                  int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 		
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonant");
	      else
		System.out.println("Not an alphabet");	             

        }

    
}
