/* This class handles interactions with the user (taking input values, for example), and prints out results from quadDescriber
   Audrey Kim APCS A 2nd
   Version 0 October 13, 2018 */
import java.util.*;

public class QuadraticClient {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients");
		System.out.println("");
		
		boolean run = true;
		
		do {
			System.out.print("a: ");
			double a = sc.nextDouble();
			System.out.print("b: ");
			double b = sc.nextDouble();
			System.out.print("c: ");	
			double c = sc.nextDouble();
			System.out.println("");
		
			System.out.println(Quadratic.quadrDescriber(a,b,c));
		
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String answer = sc.next();
			if (answer.equals("quit")) {
				run = false;
			}
		} while (run == true);
		
		sc.close();
	
	}
	
}
