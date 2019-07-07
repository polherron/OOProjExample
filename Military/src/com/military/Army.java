package com.military;

import java.time.LocalDate;

public class Army extends Military{
	private String Company;
	private ArmyRank rank;
	/**
	 * @param personalDetails
	 * @param joinDate
	 * @param dischargedDate
	 * @param discharged
	 * @param salary
	 * @param company
	 * @param class1
	 */
	public Army(Personal personalDetails, LocalDate joinDate,
			String company, ArmyRank rank) {
		super(personalDetails, joinDate);
		Company = company;
		this.rank = rank;
		this.salary = rank.getRate();
		this.discharged = false;
	}
	
	/**
	 * @return the company
	 */
	public String getCompany() {
		return Company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		Company = company;
	}
	/**
	 * @return the rank
	 */
	public ArmyRank getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(ArmyRank rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Army [Company=" + Company + ", rank=" + rank + ", personalDetails=" + personalDetails + ", joinDate="
				+ joinDate + ", dischargedDate=" + dischargedDate + ", discharged=" + discharged + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Company == null) ? 0 : Company.hashCode());
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
		Army other = (Army) obj;
		if (Company == null) {
			if (other.Company != null)
				return false;
		} else if (!Company.equals(other.Company))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
}
