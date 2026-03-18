public class Lab4 {
	public static int longestSeq (int[] array) {
		
		if (array.length == 0) {
			return 0;
		}
		if (array.equals(null)) {
			return 0;
		}
		
		int counter = 1;
		int maxVal = counter;
		
		
		for (int i = 1; i <array.length; i ++) {
			if (array[i] == array[i-1] + 1) {
				counter ++;
			}
			else {
				counter = 1;
			}
			
			if (counter > maxVal) {
				maxVal = counter;
			}
		}
		
		return maxVal;
	}

	public static String countArray (int[] array) {
		
		int[] evenNums = new int[101];
		String output = "";
		
		for (int i = 0; i< array.length-1; i ++) {
			if (array[i]<100 && array[i]>=2 && array[i] %2 ==0) {
				evenNums[array[i]] ++;
			}
		}
		
		for (int j = 0; j<array.length-1; j++) {
			if (evenNums[j] != 0) {
				output += j + ": " + evenNums[j] + "\n";
			}
		}
		
		return output;
	}
	
	public static boolean validString (String str1, String str2) {
		
		int start = 0; 
		int wrdCnt = 1;
		for (int i = 0; i<str1.length(); i ++) {
			if (str2.charAt(0) == str1.charAt(i)) {
				break;
			}
			else {
				start = i;
				
			}
			
		}
		
		for (int j = start; j <str1.length(); j ++) {
			if (str1.charAt(j) == str2.charAt(wrdCnt)){
				wrdCnt ++;
			}
			
			if (wrdCnt == str2.length()) {
				return true;
			}
		}
		
		
		
			return false;
	}
	
	public static String arrayResult(int[][] array) {	
		
		int sum = 0;
		int prod;
		
		if (array[0].length >1) {
			prod = 1;
		}
		else {
			prod = 0;
		}
		
		for(int y = 0; y<array.length; y++) {
			for(int x =0; x<array[0].length; x ++) {
				if ((x+y)%2 ==1) {
					prod *= array[x][y];
				}
				else {
					sum += array[x][y];
				}
			}
		}
		
		String output = "Sum:" + sum + ", Product:" + prod;
		return output;
	}
	
	public static boolean magicSquare(int[][] array) {
		
		int xSum =0;
		int newXSum =0;
		
		for (int x = 0; x < array[0].length; x ++) {
			xSum += array[0][x];
		}
		
		for (int y = 0; y < array.length; y ++) {
			
			newXSum =0;
			for (int x = 0; x< array[y].length; x ++) {
				newXSum += array[y][x];
			}
			
			if (xSum != newXSum) {
				return false;
			}
		}
		
		int newYSum =0;
		
		for (int x =0; x <array[0].length; x ++) {
			newYSum = 0;
			
			for (int y = 0; y<array.length; y ++) {
				newYSum += array[y][x];
			}
			
			if (xSum != newYSum) {
				return false;
			}
		}
		
		
		int diagSum1 =0;
		
		for (int d1 =0; d1< array.length; d1 ++) {
			diagSum1 += array[d1][d1];
		}
		
		int diagSum2 = 0;
		int y =0, x= array.length-1;
		for (int d2 = 0; d2 <array.length; d2 ++) {
			diagSum2 += array[y][x];
			y ++;
			x--;
		}
		
		if (diagSum1 != xSum || diagSum2 != xSum) {
			return false;
		}
		
		return true;	
	}
	
}
