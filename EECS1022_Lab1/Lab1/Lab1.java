
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		
		int ans = -1;
		if (n >0) {
			if (n%2 == 0) {
				ans = n/2;
			}
			else if (n%2 == 1) {
				ans = (n*3) + 1;
			}
		}
		else {
			ans = -1;
		}
		return ans;
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		
			String answer;
			if (gpa < 1.8 ^ sat < 900) {
				answer = "Reject";
			}
			else if (gpa < 1.8 && sat < 900) {
				answer =  "ScoresTooLow";
			}
			else {
				answer =  "Accept";
			}
			return answer;
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		
		if (x == 0 || y == 0) {
			return 0;
		}
		else if (x > 0 && y >0) {
			return 1;
		}
		else if (x<0 && y>0) {
			return 2;
		}
		else if (x < 0 && y < 0 ) {
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
		
		int minTot1 = 60*hour1 + min1;
		int minTot2 = 60*hour2 + min2;
		int timeDiff = minTot2 - minTot1;
		
		if (timeDiff >= 45) {
			return true;
		}
		else if (timeDiff <45) {
			return false;
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
