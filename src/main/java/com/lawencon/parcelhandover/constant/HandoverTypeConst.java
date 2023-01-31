package com.lawencon.parcelhandover.constant;

public enum HandoverTypeConst {
    INCOMING("INC"), OUTGOING("OUT");
	
	private final String code;
	
	HandoverTypeConst(final String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
