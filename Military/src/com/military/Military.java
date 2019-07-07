package com.military;

import java.time.LocalDate;

public abstract class Military implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7703095143915891521L;
	Personal personalDetails;
	LocalDate joinDate;
	LocalDate dischargedDate;
	boolean discharged;
	double salary;
	
	/**
	 * @return the personalDetails
	 */
	public Personal getPersonalDetails() {
		return personalDetails;
	}
	/**
	 * @param personalDetails the personalDetails to set
	 */
	public void setPersonalDetails(Personal personalDetails) {
		this.personalDetails = personalDetails;
	}
	/**
	 * @return the joinDate
	 */
	public LocalDate getJoinDate() {
		return joinDate;
	}
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	/**
	 * @return the dischargedDate
	 */
	public LocalDate getDischargedDate() {
		return dischargedDate;
	}
	/**
	 * @param dischargedDate the dischargedDate to set
	 */
	public void setDischargedDate(LocalDate dischargedDate) {
		this.dischargedDate = dischargedDate;
	}
	/**
	 * @return the discharged
	 */
	public boolean isDischarged() {
		return discharged;
	}
	/**
	 * @param discharged the discharged to set
	 */
	public void setDischarged(boolean discharged) {
		this.discharged = discharged;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param personalDetails
	 * @param joinDate
	 * @param dischargedDate
	 * @param discharged
	 * @param salary
	 */
	public Military(Personal personalDetails, LocalDate joinDate) {
		super();
		this.personalDetails = personalDetails;
		this.discharged = false;
	}
	/**
	 * 
	 */
	public Military() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (discharged ? 1231 : 1237);
		result = prime * result + ((dischargedDate == null) ? 0 : dischargedDate.hashCode());
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + ((personalDetails == null) ? 0 : personalDetails.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Military other = (Military) obj;
		if (discharged != other.discharged)
			return false;
		if (dischargedDate == null) {
			if (other.dischargedDate != null)
				return false;
		} else if (!dischargedDate.equals(other.dischargedDate))
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		if (personalDetails == null) {
			if (other.personalDetails != null)
				return false;
		} else if (!personalDetails.equals(other.personalDetails))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Military [personalDetails=" + personalDetails + ", joinDate=" + joinDate + ", dischargedDate="
				+ dischargedDate + ", discharged=" + discharged + ", salary=" + salary + "]";
	}
	
	

}
