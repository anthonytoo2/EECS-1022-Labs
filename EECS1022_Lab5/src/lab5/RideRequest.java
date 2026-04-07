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
	
	
	public RideRequest (String input) {
		if (input == null || input == "") {
			throw new IllegalArgumentException();
		}
		String[] info = input.split(",");
		
		if(info.length != 4) {
			throw new IllegalArgumentException();
		}
		
		this.customerName = info[0].trim();
		this.rideDetails = info[1].trim();
		this.ridePrice = Double.parseDouble(info[2].trim());
		
		if (info[3].trim().equals("Y")) {
			this.hasDiscount = true;
		}
		else if (info[3].trim().equals("N")){
			this.hasDiscount = false;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
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
	
	
	public static double getDiscount() {
		return discount;
	}
	public static double getTaxrate() {
		return taxrate;
	}
	public String getcustomerName() {
		return this.customerName;
	}
	public String getRideDetails() {
		return this.rideDetails;
	}
	public double getRidePrice() {
		return this.ridePrice;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public boolean isHasDiscount() {
		return this.hasDiscount;
	}
	public static void setDiscount (double discountVal) {
		discount = discountVal;
	}
	public static void setTaxrate (double taxrateVal) {
		taxrate = taxrateVal;
	}

	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}
	public void setRideDetails(String rideDetails) {
		if (rideDetails == null) {
			this.rideDetails = "";
		}
		else if (rideDetails.length() < 25) {
			String details = rideDetails.substring(0,Math.min(rideDetails.length(),25));
			details = details.trim();
			this.rideDetails = details;
		}
	}
	
	public void setCustomerName(String customerName) {
		
		if (customerName == null) {
			this.customerName = "";
		}
		else if (customerName.length() >10) {
			String name = customerName.substring(0,Math.min(customerName.length(),10));
			this.customerName = name;
		}
		else {
			this.customerName = customerName;
		}
	}
	public void setRidePrice (double ridePrice) {
		this.ridePrice = ridePrice;
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
