package com.military;

import java.time.LocalDate;

public class Navy extends Military {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ShipName;
	private NavyRank rank;
	/**
	 * @param personalDetails
	 * @param joinDate
	 * @param dischargedDate
	 * @param discharged
	 * @param salary
	 * @param shipName
	 * @param rank
	 */
	public Navy(Personal personalDetails, LocalDate joinDate, 
			String shipName, NavyRank rank) {
		super(personalDetails, joinDate);
		ShipName = shipName;
		this.rank = rank;
		this.salary = rank.getRate();
	}
	/**
	 * @return the shipName
	 */
	public String getShipName() {
		return ShipName;
	}
	/**
	 * @param shipName the shipName to set
	 */
	public void setShipName(String shipName) {
		ShipName = shipName;
	}
	/**
	 * @return the rank
	 */
	public NavyRank getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(NavyRank rank) {
		this.rank = rank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ShipName == null) ? 0 : ShipName.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Navy other = (Navy) obj;
		if (ShipName == null) {
			if (other.ShipName != null)
				return false;
		} else if (!ShipName.equals(other.ShipName))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Navy [ShipName=" + ShipName + ", rank=" + rank + ", personalDetails=" + personalDetails + ", joinDate="
				+ joinDate + ", dischargedDate=" + dischargedDate + ", discharged=" + discharged + ", salary=" + salary
				+ "]";
	}

	
	
	
	
}
