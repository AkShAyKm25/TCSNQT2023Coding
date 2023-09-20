/*Problem Statement –

Joseph is learning digital logic subject which will be 
for his next semester. He usually tries to solve unit 
assignment problems before the lecture. 
Today he got one tricky question. The problem statement 
is “A positive integer has been given as an input. 
Convert decimal value to binary representation. 
Toggle all bits of it after the most significant bit 
including the most significant bit. 
Print the positive integer value after 
toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After 
toggling the bits(1010), will get 0101 which 
represents “5”. Hence output will print “5”.*/


package PriviousProgrammingQuestions;

import java.util.Scanner;

public class Coding2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=reverseBinarytoDecimal(DecimaltoBinary(n));
		System.out.println(c);
		
	}
	static String DecimaltoBinary(int n) {
		String t="";
		while(n!=0) {
			int b=n%2;
			t+=b;
			n=n/2;
		}
		return t;
	}
	static int reverseBinarytoDecimal(String t) {
		int c=0,j=0;
		for (int i=t.length()-1;i>=0;i--) {
			c+=(int)((t.charAt(i)-'0')*(Math.pow(2,j++)));
		}
		return c;
		
	}

}
