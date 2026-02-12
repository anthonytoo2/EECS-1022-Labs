
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		int nextNum = -1;
		
		if ( n<0) {
			return nextNum;
		}
		
		if (n%2 == 0) {
			nextNum = n/2;
		}
		else {
			nextNum = n*3 +1;
		}
		return nextNum;
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		String ans = "";
		
		if (gpa < 1.8 && sat >= 900) {
			ans = "Reject";
		}
		else if (gpa >= 1.8 && sat < 900) {
			ans = "Reject";
		}
		else if (gpa < 1.8 && sat < 900) {
			ans = "ScoresTooLow";
		}
		else {
			ans = "Accept";
		}
		return ans;
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		
		if (x >0 && y>0) {
			return 1;
		}
		else if (x <0 && y>0) {
			return 2;
		}
		else if (x <0 && y<0) {
			return 3;
		}
		else if (x >0 && y<0) {
			return 4;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		
		int t1 = hour1*60 + min1;
		int t2 = hour2*60 + min2;
		
		if (t2-t1 >= 45) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double interest = 0.0;
		double spent = oldBalance + charges;
		if (oldBalance > 0) {
			interest = 0.02 * spent;
		}
		
		double balance = interest + spent;
		if (balance < 50) {
			return balance;
		}
		else if (balance >= 50 && balance <= 300) {
			return 50;
		}
		else if (balance > 300){
			return (0.2*balance);
		}
		else {
			return balance;
		}
	}
}
