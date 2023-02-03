package com.lawencon.parcelhandover.dto.vehicle;

import javax.validation.constraints.NotBlank;

public class VehicleInsertReqDto {
	
	@NotBlank
	private String vehiclePlate;
	@NotBlank
	private String vehicleModel;
	@NotBlank
	private String yearMaking;
	@NotBlank
	private String manufacture;
	
	public String getVehiclePlate() {
		return vehiclePlate;
	}
	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
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
	
}
