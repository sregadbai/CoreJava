package main.java.com.cj;

import java.util.Scanner;

class FindVowelOrConsonant {
	
	public void vowelOrConsonant() {
		
	}
}

public class VowelorConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter any character to check ");
			char ch = sc.next().charAt(0);
			boolean isVowel = false;
			
			switch(ch) {
			case 'a' : 
			case 'e' :
			case 'i' : 
			case 'o' :
			case 'u' : 
			case 'A' :
			case 'E' : 
			case 'I' :
			case 'O' : 
			case 'U' : isVowel = true;
			}
			if(isVowel) {
				System.out.println(ch+" is a Vowel");
			}else {
				if ((ch>'a' && ch <'z')||(ch>'A' && ch <'Z')) {
					System.out.println(ch+" is a Consonant");
				}else {
					System.out.println("Invalid character...");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
