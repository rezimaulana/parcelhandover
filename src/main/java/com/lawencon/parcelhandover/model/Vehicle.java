package com.lawencon.parcelhandover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "vehicles", uniqueConstraints = {
        @UniqueConstraint(name = "vehicles_bk", columnNames = { "vehicle_plate" })
})
public class Vehicle extends BaseEntity{
	
	private static final long serialVersionUID = 1872866026224770177L;

	@Column(name = "vehicle_plate", nullable = false, length = 10)
	private String vehiclePlate;

	@Column(name = "vehicle_model", nullable = false, length = 50)
	private String vehicleModel;
	
	@Column(name = "year_making", nullable = false, length = 4)
	private String yearMaking;
	
	@Column(name = "manufacture", nullable = false, length = 50)
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
