package lab5;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Anthony Tu
//Yorku Email : ant2@my.yorku.ca
//Date :2/6/26
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


public class RideRequest {
		
	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	private String customerName = "";
	private static double discount = 0.0;
	private boolean hasDiscount = false;
	private String rideDetails = "";
	private double ridePrice = 0.0;
	private static double taxrate = 0.0;
	private static int toStringCounter = 1;
	
	public RideRequest() {
		this.customerName = "";
		this.rideDetails = "";
		this.ridePrice = 0.0;
		this.hasDiscount = false;
	}
	
	public RideRequest(RideRequest other) {
		
		if (other == null) {
			throw new IllegalArgumentException();
		}
		
		this.customerName = other.customerName;
		this.rideDetails = other.rideDetails;
		this.ridePrice = other.ridePrice;
		this.hasDiscount = other.hasDiscount;
	}
	
	 public RideRequest(String input) {
	        if (input == null || input == "") {
	            throw new IllegalArgumentException();
	        }
	        String[] temp = input.split(",");
	        if (temp.length != 4) {
	            throw new IllegalArgumentException();
	        }
	        this.customerName = temp[0].trim();
	        this.rideDetails = temp[1].trim();
	        this.ridePrice = Double.parseDouble(temp[2].trim());
	        switch (temp[3].trim()) {
	        case "Y": {
	            this.hasDiscount = true;
	            break;
	        }
	        case "N": {
	            this.hasDiscount = false;
	            break;
	        }
	        default:
	            throw new IllegalArgumentException();
	        }
	    }
	
	
	public void setRideDetails(String rideDetails) {
		if (rideDetails == ""){
			this.rideDetails = "";
		}
		else if (rideDetails == null) {
			this.rideDetails = "";
		}
		else if (rideDetails.length() >25) {
			this.rideDetails = rideDetails.substring(0,25);
		}
		else {
			this.rideDetails = rideDetails.trim();
		}
		
	}
	
	public void setCustomerName(String customerName) {
		if (customerName == "") {
			this.customerName = "";
		}
		else if (customerName == null) {
			this.customerName = "";
		}
		else if (customerName.length() >10) {
			this.customerName = customerName.substring(0,10);
		}
		else {
			this.customerName = customerName;
		}
	}
	
	public void setRidePrice(double ridePrice) {
		this.ridePrice = ridePrice;
	}
	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	
	public static void setTaxrate(double taxRate) {
		taxrate = taxRate;
	}
	public static void setDiscount(double discountr) {
		discount = discountr;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public String getRideDetails() {
		return this.rideDetails;
	}
	public static double getDiscount() {
		return discount;
	}
	public static double getTaxrate() {
		return taxrate;
	}
	public double getRidePrice() {
		return this.ridePrice;
	}
	public boolean isHasDiscount() {
		return this.hasDiscount;
	}
	
	public String toString() {
		
		String output=String.format("%2d. %-10s|%-25s|%-12.2f|", toStringCounter, this.customerName, this.rideDetails, 
		this.ridePrice*(taxrate+1));
		if (this.hasDiscount) {
			output+=String.format("%13.2f", this.ridePrice*(1+taxrate)*(1-discount));
		}	
		
		toStringCounter ++;
		return output;
	}
}
