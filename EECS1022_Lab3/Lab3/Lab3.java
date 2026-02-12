///////////////////////////////////////////////////////////////////////////
//Full Name : Anthony Tu
//Yorku Email : ant2@my.yorku.ca
//Date : 1/29/2026
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab3 {

	public static String printStars(int n) {
		
		String ans = "";
		
		for (int i =0; i<n; i ++) {
			for (int j =0; j<i; j ++) {
				ans += "-";
				
			}
			for (int k =n; k>i; k --) {
				ans += "*";
			}
			
			if (i < n-1) {
				ans += "\n";
			}
		}
		return ans;
	}
	
	public static String expand (int num, int d) {

		if (d <0 || num  < 0) {
			return "Invalid";
		}
		
		int userNum = num;
		int exp = d-1;
		int digit = 0;
		int tenExp = 10;
		int oneVal = (int)(num%10);
		String output = "";
		
		while (userNum >=9) {
		
			for (int cnt = 1; cnt < exp; cnt++ ) {
				tenExp *= 10;
			}
			
			digit = (int)(userNum/tenExp);
			
			output += digit + "*" + tenExp + " + ";
			
			
			userNum -= (digit * tenExp);
			tenExp = 10;
			exp --;
		}
		
		output += oneVal;
			
		
		return output;
		
	}
	
	public static String getSeqStat(int ft, int d, int n) {
		
		int sum = ft;
		int prod = ft;
		
		//first line
		
		 String output = "{[<" + ft + ">: " + sum + ", " + prod + "]; ";
		
		for (int lines = 1; lines < n-1; lines ++) {
			String numSeq = "[<";
			int bodSum = 0;
			int bodProd = 1;
			
			for (int cnt = 0; cnt <= lines; cnt ++) {
				int nextNum = ft +(d*cnt);
				numSeq += nextNum;
				
				if (cnt <= lines -1) {
					numSeq += ", ";
				}
			
				bodSum += nextNum;
				bodProd *= nextNum;
			}
			
			
			output += numSeq + ">: " + bodSum + ", " + bodProd + "]; ";
		}
		
		int lastSum = ft;
		int lastProd = ft;
		String lastSeq = ft + ", ";
		
		for (int count = 1; count < n; count ++) {
			
			int nums = ft + (d*count);

			lastSeq += nums;
			
			if (count < n-1) {
				lastSeq += ", ";
			}
			lastSum += nums;
			lastProd *= nums;
		}
		
		String lastLine = "[<" + lastSeq + ">: " + lastSum + ", " + lastProd + "]}";
		
		output += lastLine;
		return output;
	}	
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		int totInput =n1 + n2;
		int cntOdd = 0;
		int cntEvn = 0;
		String output = "<";
		
		for (int cnt = 1; cnt <= totInput; cnt ++) {
			if (cntOdd <n1 && cntEvn < n2){
				if (cnt %2 == 0) {
					output += ft2 +d2*cntEvn;	
					cntEvn ++;				
				}
				else {
					output += ft1 + d1*cntOdd;
					cntOdd ++;
				}
			}
			else if (cntOdd == n1 && cntEvn <n2) {
				output += ft2 +d2*cntEvn;	
				cntEvn ++;				
			}
			else {
				output += ft1 + d1*cntOdd;
				cntOdd ++;
			}
			if (cnt <totInput) {
				output += ", ";
			}
			else {
				output += ">";
			}
				
		}
		
		
		return output;
	}	
	
}
