package com.daniel.hackerrank;

import java.util.Scanner;

public class Loops2 {

	/**
	 * https://www.hackerrank.com/challenges/java-loops/problem
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] result = null; 
		int k=0;
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        result = new int[t][];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result[i] = new int[n];
            result[i][0]=a+b;
            k=1;
            while(k<n)
            	result[i][k]=(int) (result[i][k-1]+b*Math.pow(2,k++));
        }
        
        for(int[] ar : result) {
        	for(int i : ar)
        		System.out.print(i+" ");
        	System.out.println();
        }
        in.close();
	}

}
