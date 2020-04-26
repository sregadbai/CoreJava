package main.java.com.cj;

import java.util.Scanner;

class InterestCalculate {
	
	public void calculate(int p, int t, double r, int n) {
		double amount = p*Math.pow(1 + (r/n), n*t);
		double cinterest = amount - p;
		System.out.println("Compound Interest after "+t+" years :"+cinterest);
		System.out.println("Total amount after "+t+" years :"+amount);
	}
}

public class CompoundInterest {

	public static void main(String[] args) {
		
		//Math formula for compound interest = P (1 + R/n) (nt) - P
		
		InterestCalculate obj = new InterestCalculate();
		obj.calculate(2000, 5, .08, 12);
				
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Principle amount :");
//		p = sc.nextDouble();
//		System.out.print("Enter rate of interest :");
//		r = sc.nextDouble();
//		System.out.print("Enter no. of years :");
//		t = sc.nextInt();
		
		//ci = p(1+r/n)(n*t)-p;
	}

}
