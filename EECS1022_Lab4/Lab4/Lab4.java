public class Lab4 {
	public static int longestSeq (int[] array) {
		int cnt = 0;
		int max = 0;
		
		for (int i = 1; i < array.length; i ++) {
			int num = array[i-1];
			if (array[i] == num +1) {
				cnt += 1;
			}
			else {
				if (cnt > max) {
					max = cnt;
				}
				cnt = 1;
			}
			num = array[i];
		}
		return max;
	}

	public static String countArray (int[] array) {
		int num =0, cnt = 0;
		String output = "";
		boolean[] nums = new boolean[100];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>= 2 && array[i] < 100 && array[i]%2 == 0 && !nums[array[i]]){
				num = array[i];
				 
				for (int j = 0; j < array.length; j ++) {
					if (array[j] == num) {
						cnt ++;
					}
				}
				
				output += num + ": " + cnt;
				cnt = 0;
				nums[array[i]] = true;
				
				if (i < array.length-1) {
					output += "\n";
				}
			}
		}
		
		return output.trim();
	}
	
	public static boolean validString (String str1, String str2) {
		String mixed = str1;
		String unscram = "";
		for (int i = 0; i < str2.length(); i ++) {
			for (int j = 0; j < mixed.length(); j ++) {
				if (mixed.charAt(j) == str2.charAt(i)) {
					unscram += str2.charAt(i);
					mixed = mixed.substring(j+1);
					break;
				}
			}
		}
		
		if (unscram.equals(str2)) {
			return true;
		}
		return false;
	}
	
	public static String arrayResult(int[][] array) {	
		int sum = 0, prod;
		if (array[0].length > 1) {
			prod = 1;
		}
		else {
			prod = 0;
		}
		
		for (int i = 0; i < array.length; i ++) {
			for (int j = 0; j < array[0].length; j ++) {
				if ((i + j)%2 ==0) {
					sum += array[i][j];
				}
				else {
					prod *= array[i][j];
				}
			}
		}
		
		return ("Sum:" + sum + ", Product:" + prod);
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
