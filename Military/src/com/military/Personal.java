package com.military;

public class Personal implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int militaryID;
	String fName;
	String lName;
	/**
	 * @return the militaryID
	 */
	public int getMilitaryID() {
		return militaryID;
	}

	/**
	 * @param militaryID the militaryID to set
	 */
	public void setMilitaryID(int militaryID) {
		this.militaryID = militaryID;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @param militaryID
	 * @param fName
	 * @param lName
	 */
	public Personal(int militaryID, String fName, String lName) {
		super();
		this.militaryID = militaryID;
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + militaryID;
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
		Personal other = (Personal) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (militaryID != other.militaryID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personal [militaryID=" + militaryID + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	
}
