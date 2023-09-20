/*Pattren Printing 
input: 5
output: 
  
* 
* * 
*   * 
*     * 
* * * * * 
*     * 
*   * 
* * 
* 

(Reverse of Above Pattren)
 
*/

package PriviousProgrammingQuestions;

import java.util.Scanner;

public class Coding14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n*2-1;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1 || j==n-1 || i+j==n-1 || i-j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
