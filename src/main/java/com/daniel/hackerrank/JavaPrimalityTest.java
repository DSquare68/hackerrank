package com.daniel.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Daniel
 *  https://www.hackerrank.com/challenges/java-primality-test/problem
 */
public class JavaPrimalityTest {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
        
        String s = bufferedReader.readLine();
        int a  = Integer.valueOf(s);
            int b=  (int) Math.sqrt(a)+1;
            while(b>=2) {
                if(a%b==0) {
                    System.out.println("not prime");
                    break;
                }
                b--;
                if(b==1) {
                    System.out.println("prime");
                    break;
                }
            }
        bufferedReader.close();
    }
}
