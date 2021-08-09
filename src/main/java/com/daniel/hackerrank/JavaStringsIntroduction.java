package com.daniel.hackerrank;

import java.util.*;

	/**
	 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
	 * @author Daniel
	 *
	 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int k=0;
        while(A.charAt(k)==B.charAt(k)) {
            k++;
            if(A.length()==k||B.length()==k) {
            	k--;
            	break;
            }
        }
        if(A.charAt(k)>B.charAt(k))
            System.out.println("Yes");
        else
            System.out.println("No");
        A = A.replaceFirst(A.charAt(0)+"",((char)(A.charAt(0)-32))+"");
        B = B.replaceFirst(B.charAt(0)+"",((char)(B.charAt(0)-32))+"");
        System.out.println(A+" "+B);
    }
}



