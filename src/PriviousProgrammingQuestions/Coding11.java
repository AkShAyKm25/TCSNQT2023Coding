package PriviousProgrammingQuestions;

import java.util.Scanner;

public class Coding11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.next();
		String res=subString(s,s1);
		System.out.println(res);
		sc.close();
	}
	
	static String subString(String s,String s1) {
		for(int size=1;size<=s.length();size++) {
			for (int i=0;i<=s.length()-size;i++) {
				String t="";
				for (int j=i;j<i+size;j++) {
					t+=s.charAt(j);
				}
				if(containsAllCharacters(t,s1)) {
					return t;
				}
			}
		}
		return null;
	}
	static boolean containsAllCharacters(String t, String s1) {
        for (char m : s1.toCharArray()) {
            if (t.indexOf(m) == -1) {
                return false;
            }
        }
        return true;
    }
}






	

