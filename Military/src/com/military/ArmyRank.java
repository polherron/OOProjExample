package com.military;

public enum ArmyRank {
	Private(20.0), Corporal(25.0), Sergeant(30.0);

	private double rate;

	public double getRate() {
		return this.rate;
	}
	

	// enum constructor - cannot be public or protected
	private ArmyRank(Double rate) 
		    { 
		        this.rate = rate; 
		    }
}
