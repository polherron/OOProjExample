package com.military;

public class WriteFileReturn {
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
	
	boolean success;
	Exception ex;
	/**
	 * @param success
	 * @param ex
	 */
	public WriteFileReturn(boolean success, Exception ex) {
		super();
		this.success = success;
		this.ex = ex;
	}
	/**
	 * 
	 */
	public WriteFileReturn() {
		super();
	}

}
