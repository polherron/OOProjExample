package com.military;

import java.util.ArrayList;

public class ReadFileReturn {
	boolean success;
	/**
	 * 
	 */
	public ReadFileReturn() {
		super();
	}
	Exception ex;
	ArrayList<Military> militaryList;
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the ex
	 */
	public Exception getEx() {
		return ex;
	}
	/**
	 * @param ex the ex to set
	 */
	public void setEx(Exception ex) {
		this.ex = ex;
	}
	/**
	 * @return the militaryList
	 */
	public ArrayList<Military> getMilitaryList() {
		return militaryList;
	}
	/**
	 * @param militaryList the militaryList to set
	 */
	public void setMilitaryList(ArrayList<Military> militaryList) {
		this.militaryList = militaryList;
	}
	/**
	 * @param success
	 * @param ex
	 * @param militaryList
	 */
	public ReadFileReturn(boolean success, Exception ex, ArrayList<Military> militaryList) {
		super();
		this.success = success;
		this.ex = ex;
		this.militaryList = militaryList;
	}
	

}
