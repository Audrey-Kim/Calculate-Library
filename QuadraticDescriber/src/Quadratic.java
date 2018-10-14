/* This class is responsible for all the calculations in the QuadraticDescriber project
   Audrey Kim APCS A 2nd
   Version 0 October 13, 2018 */

public class Quadratic {
		
	//Gives quadratic equation with variables initialized with user input 
	public static String quadrDescriber (double a, double b, double c) {
		return 
				"Description of the graph of: y = " + (a + " x^2 + " + b + " x + " + c) + "\n"
				+ "Opens: " + open(a) + "\n" 
				+ "Axis of Symmetry: " + axis(a, b) + "\n"
				+ "Vertex: " + vertex(a, b, c) + "\n"
				+ "x-intercept(s): " + xCoord(a, b, c) + "\n"
				+ "y-intercept: " + yCoord(c) + "\n"
				;
		
	}
	
	// Returns square of value passed 
			public static double square(double x) { 
				return x*x;  
			}
		
		// Provides coefficients of quadratic equation in standard form and returns value of discriminant 
			public static double discriminant(double a, double b, double c) { 
				return (b*b)-(4*a*c);
			}
		
		// Rounds double correctly to 2 decimal places
			public static double round2(double x) {
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
			
		// Returns approximation of square root of value passed, rounded to two decimal places 
			public static double sqrt(double x) { 
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
			public static String quadForm(double a, double b, double c) {
				double discrim = discriminant(a,b,c);
				if (discrim < 0) {
					return ("No real x-intercept(s)");
				}
				double root1 = ((-1*b) + sqrt((square(b) - 4*a*c)))/2*a;
				double root2 = ((-1*b) - sqrt((square(b) - 4*a*c)))/2*a;
				double rounded1 = round2(root1);
				double rounded2 = round2(root2);
				if (root1 == root2) {
					return (rounded1 + "");
				}
				return (rounded1 + " and " + rounded2);
			}
			
//Methods needed for quadDescriber to properly function 
	
	//Tells user whether quadratic equation opens up or down 
	public static String open (double a) {
		if (a < 0) {
			return "Down";
		} else if (a > 0) {
			return "Up";
		} else {
			throw new IllegalArgumentException("\"a\" cannot be 0 in a quadratic equation");
		}
	}
	
	//Gives  axis of symmetry is for the quadratic equation 
	public static double axis (double a, double b) {
		return -1*(b / (2 * a));
	}
	
	//Gives vertex of quadratic equation 
	public static String vertex (double a, double b, double c) {
		double x = axis(a,b);
		double y = a * (square(x)) + (b * x) + c;
		return "(" + x + ", " + y + ")";
	}
	
	//Gives x-coordinate(s) of quadratic equation 
	public static String xCoord (double a, double b, double c) {
		String x = quadForm(a,b,c);
		return x;
	}
	
	//Gives y-coordinate of quadratic equation
	public static double yCoord (double c) {
		return c;
	}
}
