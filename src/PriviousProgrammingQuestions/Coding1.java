/*Problem Statement –
A chocolate factory is packing chocolates into the packets. 
The chocolate packets here represent an array  
of N number of integer values. The task is to 
find the empty packets(0) of chocolate and push it 
to the end of the conveyor belt(array).

Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. 
These 3 empty packets represented as O 
should be pushed towards the end of the array

Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],
While input each element is separated by newline

Output:
4 5 1 9 5 0 0 0

Example 2:

Input:
6 — Value of N.
[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], 
While input each element is separated by newline

Output:
6 1 8 2 0 0*/

package PriviousProgrammingQuestions;

import java.util.Scanner;

public class Coding1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		rearrangeArray(ar);
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	static void rearrangeArray(int[] ar) {
		int i=0,j=0;
		while(i<ar.length) {
			if (ar[i]==0) {
				i++;
			}
			else {
				ar[j]=ar[i];
				i++;j++;
			}
		}
		while(j<ar.length) {
			ar[j]=0;
			j++;
		}
	}

}
