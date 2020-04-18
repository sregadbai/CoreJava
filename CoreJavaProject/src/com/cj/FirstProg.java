package com.cj;

import java.util.Scanner;

class Airthematic {
	
	int i;
	int j;
	String action;
	
	public void add() {
		int k = i+j;
		System.out.println("Sum is: "+k);
	}
	public void sub() {
		int k = i-j;
		System.out.println("Diff is: "+k);
	}
	public void mul() {
		int k = i*j;
		System.out.println("Mul is: "+k);
	}
	public void div() {
		int k = i/j;
		System.out.println("div is: "+k);
	}
}

public class FirstProg {

	public static void main(String[] args) 
	{
		Airthematic air = new Airthematic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		air.i = sc.nextInt();
		System.out.println("Enter a number");
		air.j = sc.nextInt();
		System.out.println("Enter action to perform :");
		air.action=sc.next();
		sc.close();
		
		if(air.action.equals("add")) {
			air.add();
		}else if(air.action.equals("sub")) {
			air.sub();
		}else if(air.action.equals("mul")) {
			air.mul();
		}else if(air.action.equals("div")) {
			air.div();
		}else {
			System.out.println("This is not a valid operation...");
		}
	}
		
}
