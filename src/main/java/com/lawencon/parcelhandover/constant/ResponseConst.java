package com.lawencon.parcelhandover.constant;

public enum ResponseConst {
	
	CREATED("Created"), UPDATED("Updated"), DELETED("Deleted");
	
	private final String response;
	
	ResponseConst(final String response) {
		this.response = response;
	}
	
	public String getResponse() {
		return response;
	}
	
}
