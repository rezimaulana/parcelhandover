package com.lawencon.parcelhandover.dto.vehicle;

import javax.validation.constraints.NotNull;

public class VehicleUpdateReqDto {
	
	@NotNull
	private String id;
	@NotNull
	private String vehicleModel;
	@NotNull
	private String yearMaking;
	@NotNull
	private String manufacture;
	@NotNull
	private Boolean isActive;
	@NotNull
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
