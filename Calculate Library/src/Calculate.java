/* This class contains the method to do various math related tasks 
   Audrey Kim - APCS A 2nd
   Version 0 September 6, 2018 */

public class Calculate {
	
	// Returns square of value passed 
	public static int square(int num0) { // REVISED
		return num0*num0;  
	}
	
	//Returns cube of value passed 
	public static int cube(int num0) { //REVISED
		return num0*num0*num0; 
	}
	
	//Returns average of 2 values passed to it 
	public static double average(double num0, double num1) { //REVISED
		return (num0+num1)/2; 
	}
	
	// Returns average of 3 values passed to it 
	public static double average(double num0, double num1, double num2) { //REVISED
		return (num0+num1+num2)/3; 
	}
	
	// Converts angle measure given in radians into degrees 
	public static double toDegrees(double num0) { //REVISED
		return num0*180/3.14159; 
	}
	
	// Converts angle measure given in degrees into radians 
	public static double toRadians(double num0) { //REVISED
		return num0*3.14159/180;
	}
	
	// Provides coefficients of quadratic equation in standard form and returns value of discriminant 
	public static double discriminant(double num0, double num1, double num2) {
		return (num1*num1)-(4*num0*num2);
	}
	
	// Converts mixed fraction into improper fraction 
	public static String toImproperFrac(int wholeNum, int numer, int denom) {
		return (denom*wholeNum + numer) + "/" + denom; 
	}
	
	// Converts improper fraction into mixed number 
	public static String toMixedNum(int numer, int denom) {
		return (numer/denom) + "_" + (numer%denom) + "/" + denom;
	}
	
	// Converts binomial multiplication of (ax + b)(cx + d) into quadratic equation of form ax^2 + bx + c
	public static String foil(int a, int b, int c, int d, String n) {
		return (a*c) + n + "^2 + " + ((d*a) + (b*c)) + n + " + " + b*d;
	}
	
	// Determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (dividend % divisor == 0) {
			return true; 
		} else {
			return false; 
		}
	}
	
	// Returns absolute value of number passed 
	public static double absValue(double num0) {
		if (num0 <= 0) {
			return num0*-1; 
		} else {
			return num0; 
		}
	}
	
	// Returns the larger of the values passed 
	public static double max(double num0, double num1) {
		if (num0 > num1) {
			return num0; 
		} else { 
			return num1;
		}
	}
	
	// Overloads the max method 
	public static double max(double num0, double num1, double num2) {
		double answer = max(max(1,2),3); 
		return answer; 
	}
	
	// Returns the smaller of the two values passed 
	public static int min(int num0, int num1) {
		if (num0 < num1) {
			return num0;  
		}else{
			return num1;
		}
	}
	
	// Rounds double correctly to 2 decimal places
	public static double round2(double num0) {
		int integer = (int) num0*1000; 
		int lastDigit = integer%10; 
		if (lastDigit <=4) {
			double answer = (double) integer/1000; 
			return answer; 
		} else {
			int answer = integer+1; 
			double answer1 = (double) answer*1000; 
			return answer1; 
		}
	}
	
	// Raises value to positive integer power 
	public static double exponent(double base, int exp) {
		double answer = base; 
		for (int i=1; i<exp; i++) {
			answer = answer*base;
		}
		return answer;
	}
	
	//Returns factorial of value passed 
	public static int factorial(int num0) {
		int answer = 1; 
		for (int i=1; i<= num0; i++) {
			answer = answer*num0; 
		}
		return answer; 
	}
	
	// Determines whether or not integer is prime 
	public static boolean isPrime(int num0) {
		if (num0>=2) {
			for (int i = 2; num0>i; i++) {
				if (isDivisibleBy(num0, i)) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	// Finds greatest common factor of two integers 
	public static int gcf(int num0, int num1) {
		int answer = 1; 
		for (int i = 1; num0>= i; i++) {
			if(isDivisibleBy(num0, i) && isDivisibleBy(num1,i)) {
				answer = i; 
			}
		}
		return answer; 
	}
	
	// Returns approximation of square root of value passed, rounded to two decimal places 
	public static double sqrt(double num0) {
		double answer = 1.0; 
		double squared = num0*num0;
		while (answer!=squared) {
			answer = (1/2)*(num0/answer+answer);
		}
		answer = round2(answer);
		return answer; 
	} 
}