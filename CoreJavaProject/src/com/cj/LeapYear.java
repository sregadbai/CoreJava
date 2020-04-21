package com.cj;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) 
	{
		int n;
		boolean isLeap = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year : ");
		n=sc.nextInt();
		sc.close();
		if(n % 4 == 0){
			if(n % 100 == 0){
				if(n % 400 == 0){
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
			System.out.println(n+" is leap year..");
		}else {
			System.out.println(n+" is not leap year..");
		}
	}

}
