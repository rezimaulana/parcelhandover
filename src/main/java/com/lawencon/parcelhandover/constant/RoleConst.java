package com.lawencon.parcelhandover.constant;

public enum RoleConst {
	
	SYSTEM("RLSYS", "System"),
	STAFF("RLSTF", "Staff"), 
    DRIVER("RLDVD", "Driver"),
	PRINCIPAL("RLSYS", "846b92a3-d694-4ca1-a01e-7879ca1887f1");

	private final String code;
	private final String name;
	
	RoleConst(final String code, final String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
}
