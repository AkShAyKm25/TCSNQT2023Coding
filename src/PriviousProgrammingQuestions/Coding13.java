package PriviousProgrammingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Coding13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		int res=countElementsInArray(ar);
		System.out.println(res);

	}
	static int countElementsInArray(int[] ar) {
		int c=1,d=0;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]) {
				c+=1;
			}
			else {
				if (c%2!=0) {
					d+=ar[i];
				}
				c=1;
			}
		}
		if (c%2!=0) {
			d+=ar[ar.length-1];
		}
		return d;
		
	}
}
