package main.java.com.cj;

//Calculate Simple Interest
class SICalculate {
	float principal,rateOfInterest,timePeriod;
	
	public void calculate() {
		float interest = (principal*rateOfInterest*timePeriod)/100;
		System.out.println("Interest is "+interest);
	}
	
}
//calculate quotient and remainder 
class QuoRem {
	int dividend;
	int divisor;
	
	public void quotient() {
		int quot = dividend/divisor;
		System.out.println("Quotient is "+quot);
	} 
	public void remainder() {
		int rem = dividend % divisor;
		System.out.println("Remainder is "+rem);
	}  
}
//calculate power of a number
class PowOfNum {
	int number, power;
	
	public void calPower() {
		double result = Math.pow(number, power);
		System.out.println(number+"^"+power+" : "+result);
	}
}

public class MultipleProgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math formula (P*T*R)/100
		SICalculate obj = new SICalculate();
		obj.principal = 2000;
		obj.rateOfInterest = 6;
		obj.timePeriod = 5;
		
		obj.calculate();
		
		QuoRem obj2 = new QuoRem();
		obj2.dividend = 15;
		obj2.divisor = 2;
		
		obj2.quotient();
		obj2.remainder();
		
		PowOfNum  obj3 = new PowOfNum();
		obj3.number = 2;
		obj3.power = 3;
		
		obj3.calPower();

	}

}
