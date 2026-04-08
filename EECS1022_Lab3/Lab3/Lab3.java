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
		if ( n == 1) {
			return "*";
		}
		else if ( n == 2) {
			return "**\n-*";
		}
		else {
			String output = "";
			String l1 = "";
			for ( int lines = n; lines >0; lines --) {
				l1 += "*";
			}
			String lf = "";
			for (int last = (n-1); last >0; last --) {
				lf += "-";
			}
			lf += "*";
			
			for (int body = 1; body <= (n-2); body ++) {
				String lines = "";
				for (int spaces = 1; spaces <= body; spaces ++) {
					lines += "-";
				}
				for (int stars = 1; stars <= (n-body); stars ++) {
					lines += "*";
				}
				
				output += lines + "\n";
			}
			
			output = l1 + "\n" + output + lf;
			return output;
		}
	}
	
	public static String expand (int num, int d) {

		int tens = d-1;
		String output = "";
		int nums = num;
		if (num <0 || d<0) {
			return "Invalid";
		}
		
		while (tens > 0) {
			output += nums / (int)Math.pow(10,tens) + "*" + (int)Math.pow(10,tens) + " + ";
			nums = (int)(nums % (int) Math.pow(10, tens));
			tens--;
		}
		
		output += num % 10;
		
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
