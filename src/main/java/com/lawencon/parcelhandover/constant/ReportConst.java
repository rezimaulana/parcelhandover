package com.lawencon.parcelhandover.constant;

public enum ReportConst {
    WAREHOUSE("WH"), DRIVER("DR");
	
	private final String type;
	
	ReportConst(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
