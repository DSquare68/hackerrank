package com.daniel.hackerrank;

import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
        int[] arr1 = new int[25];
        int[] arr2 = new int[25];
        for(int i=0;i< a.length();i++){
            arr1[(a.charAt(i)-65)<=25 ? a.charAt(i)-65 : a.charAt(i)-97]++;
            arr2[(b.charAt(i)-65)<=25 ? b.charAt(i)-65 : b.charAt(i)-97]++;
        }
        for(int i =0 ; i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
