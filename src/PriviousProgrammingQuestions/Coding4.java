/*Airport security officials have confiscated several 
item of the passengers at the security check point. 
All the items have been dumped into a huge box (array). 
Each item possesses a certain amount of risk[0,1,2]. 
Here, the risk severity of the items represent an array[] 
of N number of integer values. 
The task here is to sort the items based 
on their levels of risk in the array. 
The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], 
while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk 
severity 

Example 2:

input : 10  -> Value of N 

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], 
while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting 
based on risk severity.

Explanation:

In the above example, the input is an 
array of size N consisting of only 0’s, 1’s and 2s. 
The output is a sorted array from 0 to 2 based on 
risk severity.*/
package PriviousProgrammingQuestions;
import java.util.*;
public class Coding4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for (int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int[] ar1=rearrangeArray(ar);
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
			
		}
	}
	static int[] rearrangeArray(int[] ar) {
		int c=0,d=0,e=0,j=0;
		for (int i=0;i<ar.length;i++) {
			if (ar[i]==0) {
				c+=1;
			}
			else if(ar[i]==1){
				d+=1;
			}
			else {
				e+=1;
			}
		}
		int[] ar1=new int[ar.length];
		while(j<c) {
			ar1[j++]=0;		
			}
		while(j<c+d) {
			ar1[j++]=1;
		}
		while(j<ar1.length) {
			ar1[j++]=2;
		}
		return ar1;
	}

}
