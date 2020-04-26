package main.java.com.cj;

import java.util.Scanner;

class IsLeapYear {
	int year;
	boolean isLeap = false;
	
	public void leapYear () {
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					isLeap = true;
				}else{
					isLeap = false;
				}
			}else{
				isLeap = false;
			}
		}else{
			isLeap = false;
		}
		if (isLeap) {
			System.out.println(year+" is leap year..");
		}else {
			System.out.println(year+" is not leap year..");
		}
	}
}

public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		IsLeapYear obj = new IsLeapYear();
		System.out.print("Enter any year : ");
		try {
			obj.year = sc.nextInt();
			obj.leapYear();
			
		}catch(Exception e) {
			System.out.println("Enter value in numericals only "+e);
		} finally {
			// TODO: handle finally clause
			sc.close();
		}
		
	}

}
