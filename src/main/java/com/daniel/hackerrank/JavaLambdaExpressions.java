package com.daniel.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaLambdaExpressions {

	public static void main(String[] args) throws IOException {
		  MyMath ob = new MyMath();
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int T = Integer.parseInt(br.readLine());
		  PerformOperation op;
		  boolean ret = false;
		  String ans = null;
		  while (T--> 0) {
		   String s = br.readLine().trim();
		   StringTokenizer st = new StringTokenizer(s);
		   int ch = Integer.parseInt(st.nextToken());
		   int num = Integer.parseInt(st.nextToken());
		   if (ch == 1) {
		    op = ob.isOdd();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "ODD" : "EVEN";
		   } else if (ch == 2) {
		    op = ob.isPrime();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PRIME" : "COMPOSITE";
		   } else if (ch == 3) {
		    op = ob.isPalindrome();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

		   }
		   System.out.println(ans);
		  }
		 }
		public interface PerformOperation{
			public boolean calculate(int a);
		}
		static public class MyMath{
			
			public MyMath() {
				
			}
			public PerformOperation isOdd() {
				
				return (int a ) -> a%2!=0 ;
			}

			public PerformOperation isPalindrome() {
				return (int a) -> Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString());
			}

			/**
			 * something is missing
			 * @return
			 */
			public PerformOperation isPrime() {
				return (int a ) -> {
					int b=  (int) Math.sqrt(a)+1;
					while(b>2) {
                    	if(a%b==0) 
                    		return false;
                    	b--;
					}
					return true;
                };
			}

			public boolean checker(PerformOperation op, int num) {
				return op.calculate(num);
			}
			
		}
}
