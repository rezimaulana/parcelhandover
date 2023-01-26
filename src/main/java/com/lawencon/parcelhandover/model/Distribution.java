package com.lawencon.parcelhandover.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "distributions")
public class Distribution extends BaseEntity{
	
	private static final long serialVersionUID = -502778348720598302L;

	@Column(name = "departure_time", nullable = false)
	private LocalDateTime departureTime;
	
	@Column(name = "parcel_quantity", nullable = false)
	private Long parcelQuantity;
	
	@ManyToOne
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	
	@ManyToOne
	@JoinColumn(name = "user_vehicle_id")
	private UserVehicle userVehicle;
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public Long getParcelQuantity() {
		return parcelQuantity;
	}

	public void setParcelQuantity(Long parcelQuantity) {
		this.parcelQuantity = parcelQuantity;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public UserVehicle getUserVehicle() {
		return userVehicle;
	}

	public void setUserVehicle(UserVehicle userVehicle) {
		this.userVehicle = userVehicle;
	}
	
}
