package com.lawencon.parcelhandover.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "handover_hdr")
public class HandoverHdr extends BaseEntity{

	private static final long serialVersionUID = 6736306291923538361L;

	@Column(name = "arrival_time", nullable = false)
	private LocalDateTime arrivalTime;
	
	@ManyToOne
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	
	@ManyToOne
	@JoinColumn(name = "user_vehicle_id")
	private UserVehicle userVehicle;
	
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
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
