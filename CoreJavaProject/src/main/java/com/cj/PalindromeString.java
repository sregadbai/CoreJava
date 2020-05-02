package main.java.com.cj;

import java.util.Scanner;

class CheckPalindrome {
	
	public void chkString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string/chars : ");
		
		try {
			String inStr = sc.nextLine();
			String revStr = "";
			for (int i = inStr.length() - 1; i >= 0; i--) {
				revStr = revStr + inStr.charAt(i);
			}
			if (inStr.equalsIgnoreCase(revStr)) {
				System.out.println("The entered string is Palindrome");
			} else {
				System.out.println("String is not Palindrome");
			} 
		} finally {
			sc.close();
		}
		
	}
}

public class PalindromeString {

	public static void main(String[] args) {
		
		CheckPalindrome obj = new CheckPalindrome();
		obj.chkString();

	}

}
