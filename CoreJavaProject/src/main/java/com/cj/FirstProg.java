package main.java.com.cj;

import java.util.Scanner;

class Airthematic {
	
	int i;
	int j;
	int k;
	String action;
	
	public void add() {
		k = i+j;
		System.out.println("Sum is: "+k);
	}
	public void sub() {
		k = i-j;
		System.out.println("Diff is: "+k);
	}
	public void mul() {
		k = i*j;
		System.out.println("Mul is: "+k);
	}
	public void div() {
		k = i/j;
		System.out.println("div is: "+k);
	}

}

public class FirstProg {

	public static void main(String[] args) 
	{
		Airthematic air = new Airthematic();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			air.i = sc.nextInt();
			System.out.print("Enter a number: ");
			air.j = sc.nextInt();
			System.out.print("Enter action to perform :");
			air.action=sc.next();
			
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
			int num1 = air.i;
			int num2 = air.j;
			if (num1 % 2 == 0) {
				System.out.println(num1+" is even number");
			}else {
				System.out.println(num1+" is odd number");
			}
			if (num2 % 2 == 0) {
				System.out.println(num2+" is even number");
			}else {
				System.out.println(num2+" is odd number");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
		
}
