package com.daniel.hackerrank;

import java.util.Scanner;

/**
 * @author Daniel
 *		https://www.hackerrank.com/challenges/java-exception-handling/problem?h_r=next-challenge&h_v=zen
 */
class MyCalculator {
	
    public long power(int a, int b) throws Exception {
    	if(a==0 && b==0){
            throw new Exception("n and p should not be zero.");
        }
        if(a<0 || b<0){
            throw new Exception("n or p should not be negative.");
        }
    	return ((int)Math.pow(a,b));
    }
    
    
}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}