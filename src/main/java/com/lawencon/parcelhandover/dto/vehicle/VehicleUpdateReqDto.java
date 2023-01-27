package com.lawencon.parcelhandover.dto.vehicle;

public class VehicleUpdateReqDto {
	
	private String id;
	private String vehicleModel;
	private String yearMaking;
	private String manufacture;
	private Boolean isActive;
	private Integer ver;

	public Integer getVer() {
		return ver;
	}
	public void setVer(Integer ver) {
		this.ver = ver;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getYearMaking() {
		return yearMaking;
	}
	public void setYearMaking(String yearMaking) {
		this.yearMaking = yearMaking;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
