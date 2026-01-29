///////////////////////////////////////////////////////////////////////////
//Full Name : Anthony Tu
//Yorku Email :ant2@my.yorku.ca
//Date : 1/19/2026
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	public static double getCalories(int gender, int age, double weight, double height, boolean athlete) 
	 {
		double calTot = 0.0;
		
		if (!(gender > 2) && age >0 && weight >0 && height >0) {
			if (gender == 1) {
				calTot = (10*weight) + (6.25*height)- (5*age) + 5;
			}
			else {
				calTot = (10*weight) + (6.25*height)- (5*age) -161;
			}
			
			if (athlete == true) {
				if (gender == 1 ) {
					calTot = calTot * 1.20;
				}
				else {
					calTot = calTot * 1.15;
				}
			}
		}
		else {
			return -1.0;
		}
		
		return calTot;
	 }

		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
		
		double amtOwed, excessMoney, extraOwed;
		int fltAmt; 
		
		if (income <0.0) {
			return -1.0;
		}
		else {
			if (income > 0 && !(income > 7150)) {
				fltAmt = 0;
				excessMoney = income - 0;
				extraOwed = 0.1 * excessMoney;
				amtOwed = fltAmt + extraOwed;
			}
			else if (income > 7150 && !(income > 29050)) {
				fltAmt = 715;
				excessMoney = income - 7150;
				extraOwed = 0.15 * excessMoney;
				amtOwed = fltAmt + extraOwed;				
			}
			else if (income > 29050 && !(income > 70350)) {
				fltAmt = 4000;
				excessMoney = income - 29050;
				extraOwed = 0.25 * excessMoney;
				amtOwed = fltAmt + extraOwed;				
			}
			else {
				fltAmt = 14325;
				excessMoney = income - 70350;
				extraOwed = 0.28 * excessMoney;
				amtOwed = fltAmt + extraOwed;				
			}
		}
		
		return amtOwed;
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is february, 
	 * it checks if the year is a leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		
		boolean yearValid = false, isLeapYear = false, monthValid = true, dayValid = false;
		int daysInMonth = 0;
		
		if (year >= 1000) {
			yearValid = true;
			
		}
		
		if (month >= 1 && !(month > 13)) {
			monthValid = true;
			
			if (month == 2) {
				if ((year % 400 == 0) || (year %4 == 0 && year%100 != 0)) {
					isLeapYear = true;
				}
			}
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			daysInMonth = 30;
		}
		else if (month == 2) {
			if (isLeapYear == true) {
				daysInMonth = 29;
			}
			else {
				daysInMonth = 28;
			}
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			daysInMonth = 31;
		}
		
		if (day > 0 && day <= daysInMonth) {
			dayValid = true;
		}
		
		if (yearValid == true && monthValid == true && dayValid == true) {
			return true;
		}
		else {
			return false;
		}
	}
}