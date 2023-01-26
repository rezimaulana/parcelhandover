package com.lawencon.parcelhandover.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "handover_dtl")
public class HandoverDtl extends BaseEntity{

	private static final long serialVersionUID = 1746567607671742487L;

	@Column(name = "departure_time", nullable = false)
	private LocalDateTime departureTime;
	
	@Column(name = "parcel_quantity", nullable = false)
	private Long parcelQuantity;
	
	@ManyToOne
	@JoinColumn(name = "handover_hdr")
	private HandoverHdr handoverHdr;
	
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

	public HandoverHdr getHandoverHdr() {
		return handoverHdr;
	}

	public void setHandoverHdr(HandoverHdr handoverHdr) {
		this.handoverHdr = handoverHdr;
	}
	
}
