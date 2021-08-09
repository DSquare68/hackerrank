package com.daniel.hackerrank;

import java.util.Scanner;

/**
	 * https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
	 * @author Daniel
	 *
	 */
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        /*
        ArrayList<String> three = new ArrayList<String>();
        
        for(int i=0;k+i<=s.length()-1;i++) {
        	three.add(s.substring(i,i+k));
        }
        Collections.sort(three);
        smallest = three.get(0);
        largest = three.get(three.size()-1);
        */
        String[] three = new String[s.length()-k+1];
        for(int i=0;k+i<=s.length();i++) {
        	three[i]=s.substring(i,i+k);
        }
        String[] wejscie = three;
        int rozmiarTablicy = wejscie.length;
        for (int i = 0; i < rozmiarTablicy; i++){
	        String min = wejscie[i];
	        int indeks = i;
	        for (int j = i; j < rozmiarTablicy; j++){
		        if(min.compareTo(wejscie[j])>=0) {
		        	min = wejscie[j];
		        	indeks=j;
		        }
	        }
        wejscie[indeks] = wejscie[i];
        wejscie[i] = min;
        }
        smallest=wejscie[0];
        largest=wejscie[wejscie.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
