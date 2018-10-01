/* This class contains the method to do various math related tasks 
   Audrey Kim - APCS A 2nd
   Version 1(??) October 1, 2018 */

public class Calculate {
	
	// Returns square of value passed 
	public static int square(int x) { // REVISED
		return x*x;  
	}
	
	//Returns cube of value passed 
	public static int cube(int x) { //REVISED
		return x*x*x; 
	}
	
	//Returns average of 2 values passed to it 
	public static double average(double a, double b) { //REVISED
		return (a+b)/2; 
	}
	
	// Returns average of 3 values passed to it 
	public static double average(double a, double b, double c) { //REVISED
		return (a+b+c)/3; 
	}
	
	// Converts angle measure given in radians into degrees 
	public static double toDegrees(double x) { //REVISED
		return x*180/3.14159; 
	}
	
	// Converts angle measure given in degrees into radians 
	public static double toRadians(double x) { //REVISED
		return x*3.14159/180;
	}
	
	// Provides coefficients of quadratic equation in standard form and returns value of discriminant 
	public static double discriminant(double a, double b, double c) { //REVISED
		return (b*b)-(4*a*c);
	}
	
	// Converts mixed fraction into improper fraction 
	public static String toImproperFrac(int wholeNum, int numer, int denom) { //REVISED
		return (denom*wholeNum + numer) + "/" + denom; 
	}
	
	// Converts improper fraction into mixed number 
	public static String toMixedNum(int numer, int denom) { //REVISED
		return (numer/denom) + "_" + (numer%denom) + "/" + denom;
	}
	
	// Converts binomial multiplication of (ax + b)(cx + d) into quadratic equation of form ax^2 + bx + c
	public static String foil(int a, int b, int c, int d, String n) { //REVISED
		return (a*c) + n + "^2 + " + ((d*a) + (b*c)) + n + " + " + b*d;
	}
	
	// Determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int dividend, int divisor) { //REVISED
		if (divisor == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		if (dividend % divisor == 0) {
			return true; 
		} else {
			return false; 
		}
	}
	
	// Returns absolute value of number passed 
	public static double absValue(double x) { //REVISED
		if (x < 0) {
			return x*-1; 
		} else {
			return x;
		}
	}
	
	// Returns the larger of the values passed 
	public static double max(double a, double b) { //REVISED
		if (a > b) {
			return a; 
		} else { 
			return b;
		}
	}
	
	// Overloads the max method 
	public static double max(double a, double b, double c) { //REVISED
		double answer = max(max(a,b),c); 
		return answer; 
	}
	
	// Returns the smaller of the two values passed 
	public static int min(int a, int b) { //REVISED
		if (a < b) {
			return a;  
		}else{
			return b;
		}
	}
	
	// Rounds double correctly to 2 decimal places
	public static double round2(double x) { //REVISED
		int integer = (int) (x*1000); 
		int lastDigit = integer%10; 
		if (lastDigit <=4) {
			integer = integer/10;  
			return (double) integer/ 100; 
		} else {
			integer = integer/10; 
			integer++;
			return (double) integer/100; 
		}
	}
	
	// Raises value to positive integer power 
	public static double exponent(double base, int exp) { //REVISED
		if (exp < 0) {
			throw new IllegalArgumentException ("Method does not accept negative exponents");
		}
		double answer = base; 
		for (int i=1; i<exp; i++) {
			answer = answer*base;
		}
		return answer;
	}
	
	//Returns factorial of value passed 
	public static int factorial(int x) {
		if (x < 0) {
			throw new IllegalArgumentException("Method does not accept negative values");
		}
		int answer = 1; 
		for (int i=1; i<= x; i++) {
			answer = answer*x; 
		}
		return answer; 
	}
	
	// Determines whether or not integer is prime 
	public static boolean isPrime(int x) { //REFINED
		if (x>=2) {
			for (int i = 2; x>i; i++) {
				if (isDivisibleBy(x, i)) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	// Finds greatest common factor of two integers 
	public static int gcf(int a, int b) { //REVISED 
		int answer = 1; 
		for (int i = 1; a>= i; i++) {
			if(isDivisibleBy(a, i) && isDivisibleBy(b,i)) {
				answer = i; 
			}
		}
		return answer; 
	}
	
	// Returns approximation of square root of value passed, rounded to two decimal places 
	public static double sqrt(double x) { //REVISED
		if (x < 0) {
			throw new IllegalArgumentException("Method doesn't accept negative values");
		}
		double answer = 0;
		double guess = 6;
		for (int i = 1; i<=101; i++) {
			answer = 0.5*(x/guess+guess);
			guess = answer;
		}
		answer = round2(answer);
		return answer; 
	} 
	
	//Uses coefficients of quadratic equation in standard form and approximates real roots 
//	public static String quadForm(int a, int b, int c) {
//		double root1 = ((-1*b) + sqrt((square(b) - 4*a*c)))/2*a;
//		double root2 = ((-1*b) - sqrt((square(b) - 4*a*c)))/2*a;
//		if (root1 < 0 || root2 < 0) {
//			throw new IllegalArgumentException("no real roots");
//		}
//		
//		return "";
//		
//	}
}