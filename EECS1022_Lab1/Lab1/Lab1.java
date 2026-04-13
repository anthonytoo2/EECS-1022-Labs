
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		if (n<0) {
			return -1;
		}
		if (n%2 == 0) {
			return (n/2);
		}
		else {
			return (3*n + 1);
		}
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		if (gpa < 1.8 && sat < 900) {
			return "ScoresTooLow";
		}
		else if (gpa<1.8|| sat < 900) {
			return "Reject";
		}
		else return "Accept";
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		else if (x > 0 && y > 0) {
			return 1;
		}
		else if (x < 0 && y > 0) {
			return 2;
		}
		else if (x < 0 && y < 0) {
			return 3;
		}
		else {
			return 4;
		}
	}
	
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		int t1 = 60* hour1 + min1;
		int t2 = 60* hour2 + min2;
		
		if (t2-t1 >= 45) {
			return true;
		}
		return false;
	}
	
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double interest = 0;
		
		if (oldBalance > 0) {
			interest = 0.02 * (oldBalance + charges);
		}
		
		double bal = oldBalance + charges + interest;
		
		if (bal < 50) {
			return bal;
		}
		else if (bal >= 50 && bal < 300) {
			return 50;
		}
		else {
			return (0.2*bal);
		}
	}
}
