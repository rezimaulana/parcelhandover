package com.lawencon.parcelhandover.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "handover")
public class Handover extends BaseEntity {
    
	private static final long serialVersionUID = -5343947568404208721L;

	@Column(name = "arrival_time", nullable = false)
	private LocalDateTime arrivalTime;
	
	@Column(name = "departure_time", nullable = false)
	private LocalDateTime departureTime;
	
	@Column(name = "parcel_quantity", nullable = false)
	private BigDecimal parcelQuantity;

	@ManyToOne
	@JoinColumn(name = "warehouse_id")
	private Warehouse warehouse;
	
	@ManyToOne
	@JoinColumn(name = "user_vehicle_id")
	private UserVehicle userVehicle;
	
	@ManyToOne
	@JoinColumn(name = "handover_type_id")
	private HandoverType handoverType;

    public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public BigDecimal getParcelQuantity() {
		return parcelQuantity;
	}

	public void setParcelQuantity(BigDecimal parcelQuantity) {
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

	public HandoverType getHandoverType() {
		return handoverType;
	}

	public void setHandoverType(HandoverType handoverType) {
		this.handoverType = handoverType;
	}
	
}
