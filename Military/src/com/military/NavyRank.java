package com.military;

public enum NavyRank {
	Marine(20.0), LeadingHand(25.0), PettyOfficer(30.0);

	private double rank;

	/**
	 * @param rank the rank to set
	 */
	public void setRank(double rank) {
		this.rank = rank;
	}

	public double getRank() {
		return this.rank;
	}
	
	// enum constructor - cannot be public or protected
	private NavyRank(Double rate) 
		    { 
		        this.rank = rank; 
		    }
	
	
	
	
}
