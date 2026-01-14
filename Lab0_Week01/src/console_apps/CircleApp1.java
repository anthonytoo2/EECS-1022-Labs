/*
 * This is version one of a console application
 * We will prompt the user of radius values of two circles
 * The application will output the areas of the two input circles 
 */
package console_apps;

import java.util.Scanner;

public class CircleApp1 {

	public static void main(String[] args) {
		//Starting the execution of the application
		Scanner input = new Scanner(System.in);
		
		//Start the actual application code
		
		/*
		 * Calculate the first circle
		 */
		//1. Prompt the user for the radius of the 1st circle
		System.out.println("Enter the radius of the 1st circle: ");
		
		//Declare a variable to store the user input
		//2. Read a floating-point number from the user
		double radius1 = input.nextDouble();
		//3. Compute the area of the input circle accordingly
		double area1 = 3.14*radius1*radius1;
		String area1s = String.format("%.2f", area1);
		//4. Output the result back to the user
		System.out.println("Area of circle is: " + area1s);
		
		/*
		 * Calculate the second circle
		 */
		//1. Prompt the user for the radius of the 2nd circle
		System.out.println("Enter the radius of the 2nd circle: ");
		
		//Declare a variable to store the user input
		//2. Read a floating-point number from the user
		double radius2 = input.nextDouble();
		//3. Compute the area of the input circle accordingly
		double area2 = 3.14*radius2*radius2;
		String area2s = String.format("%.2f", area2);
		//4. Output the result back to the user
		System.out.println("Area of circle is: " + area2s);
		
		
		
		//End of the application close
		
		input.close();
	}

}
