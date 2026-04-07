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
	public static double getCalories(int gender, int age, double weight, double height, boolean athlete){
		double calTot;
		
		if (gender <1 || gender > 2 || weight <0 || age < 0 || height < 0) {
			return -1;
		}
		else if (gender == 1) {
			calTot = 10 * weight + 6.25 * height -5 * age + 5;
			if (athlete == true) {
				calTot *= 1.2;
			}
		}
		else {
			calTot = 10 * weight + 6.25 * height -5 * age -161;
			if (athlete == true) {
				calTot *= 1.15;
			}
		}
		
		return calTot;
		
	 }

		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
		double tax;
		
		if (income <0) {
			return -1;
		}
		
		if (income >=0 && income < 7150) {
			tax = 0 + 0.1* (income-0);
		}
		else if (income >= 7150 && income < 29050) {
			tax = 715 + 0.15 * (income-7150);
		}
		else if (income >= 29050 && income <70350) {
			tax = 4000 + 0.25 * (income - 29050);
		}
		else {
			tax = 14325 + 0.28 * (income - 70350);
		}
		
		return tax;
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is february, 
	 * it checks if the year is a leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		boolean monthValid = false, yearValid = false, isLeapYear = false, dayValid = false;
		
		if (month >0 && month <13) {
			monthValid = true;
		}
		if (year >= 1000) {
			yearValid = true;
			if (year %400 ==0 || (year%4 ==0 && year %100 == 1)) {
				isLeapYear = true;
			}
		}
		
		if (( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day> 0 && day <= 31)) {
			dayValid = true;
		}
		else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 0 && day < 31)) {
			dayValid = true;
		}
		
		if (month == 2) {
			if (isLeapYear == true) {
				if (day > 0 && day < 30) {
					dayValid = true;
				}
			}
			else {
				if (day > 0 && day <29) {
					dayValid = true;
				}
			}
		}
		
		if (monthValid == true && yearValid == true && dayValid == true) {
			return true;
		}
		
		return false;
	}
}