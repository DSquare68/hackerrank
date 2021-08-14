package com.daniel.hackerrank;

import java.util.Scanner;

/**
 * @author Daniel
 *		https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_v=zen
 */
public class JavaStringTokens {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tab = s.split("[!,?._ '@]+");
        int k=0;
        for(String str : tab)
        	if(str.equals(""))
        		k++;
        String[] tab2 = new String[tab.length-k];
        for(int i=0;i<tab2.length;i++) {
        	if(tab[i+k].equals(""))
        		k++;
        	tab2[i]=tab[i+k];
        }
        System.out.println(tab2.length);
        for(String str : tab2)
        		 System.out.println(str);
        scan.close();
    }
}
