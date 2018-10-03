// This class contains the method to do various math related tasks
// Audrey Kim - APCS A 2nd
// Version 0 September 6, 2018 

public class DoMath {

	public static void main(String[] args) {
		System.out.println("The value squared is: " + Calculate.square(99));
		System.out.println("The value cubed is: " + Calculate.cube(53));
		System.out.println("The 2-value average is: " + Calculate.average(32, 66));
		System.out.println("The 3-value average is: " + Calculate.average(94, 53, 62));
		System.out.println("The value in degrees is: " + Calculate.toDegrees(180));
		System.out.println("The value in radians is " + Calculate.toRadians(90));
		System.out.println("The discriminant is: " + Calculate.discriminant(5, 7, 4));
		System.out.println("The value as an improper fraction is: " + Calculate.toImproperFrac(4, 2, 7));
		System.out.println("The value as a mixed number is: " + Calculate.toMixedNum(6, 4));
		System.out.println("The qudaratic equation found through foil is: " + Calculate.foil(6, 2, 4, 5, "x"));
		System.out.println("Dividend is evenly divided by divisor: " + Calculate.isDivisibleBy(7, 1));
		System.out.println("The absolute value is: " + Calculate.absValue(9));
		System.out.println("The max of the 2 values is: " + Calculate.max(0, 0));
		System.out.println("The max of the 3 values is: " + Calculate.max(-11, -11, -11));
		System.out.println("The min of the 2 values is: " + Calculate.min(12, -9));
		System.out.println("The value rounded to 2 decimal points is: " + Calculate.round2(1.353));
		System.out.println("Base raised to exponent is: " + Calculate.exponent(5, 3));
		System.out.println("The factorial of the value is: " + Calculate.factorial(7));
		System.out.println("The value is prime: " + Calculate.isPrime(13));
		System.out.println("The gcf of the values is: " + Calculate.gcf(200, 100));
		System.out.println("The sqrt of the value is: " + Calculate.sqrt(123));
		System.out.println("The roots are: " + Calculate.quadForm(1,2,1));
}

}
