package com.military;

public enum NavyRank {
	Marine(20.0), LeadingHand(25.0), PettyOfficer(30.0);

	private double rate;

	/**
	 * @param rank the rank to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return this.rate;
	}
	
	// enum constructor - cannot be public or protected
	private NavyRank(Double rate) 
		    { 
		        this.rate = rate; 
		    }
}
