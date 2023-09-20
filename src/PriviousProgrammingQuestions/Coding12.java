package PriviousProgrammingQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class Coding12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer> ar=new HashSet<Integer>(n);
		for (int i=0;i<n;i++) {
			ar.add(sc.nextInt());
		}
		int c=0;
		for (int l:ar) {
			c+=l; 
		}
		System.out.println(c);
		sc.close();

	}

}
