// Java program to Illustrate Unary
// Bitwise Complement Operator

// Importing required classes
import java.io.*;

// Main class
class PIT {

	// Main driver method
	public static void main(String[] args)
	{
		// Declaring a variable
		int n1 = 6, n2 = -2;

		// Printing numbers on console
		System.out.println("First Number = " + n1);
		System.out.println("Second Number = " + n2);

		// Printing numbers on console after
		// performing bitwise complement
		System.out.println(
			n1 + "'s bitwise complement = " + ~n1);
		System.out.println(
			n2 + "'s bitwise complement = " + ~n2);
	}
}
