package model;

public class Circle {
	/*
	 * Utility method example, doesn't require creating objects to use them
	 */
	
	public static double getArea(double radius) {
		double area = 0.0;
		//Correct implementation
		area =3.14 * radius * radius; 
		//wrong implementation
//		area = 2* 3.14 * radius;
		return area;
	}
}
