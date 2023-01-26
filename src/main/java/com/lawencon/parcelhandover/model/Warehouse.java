package com.lawencon.parcelhandover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "warehouses", uniqueConstraints = {
        @UniqueConstraint(name = "warehouses_bk", columnNames = { "code" })
})
public class Warehouse extends BaseEntity{
	
	private static final long serialVersionUID = -54627289658315999L;

	@Column(name = "code", nullable = false, length = 10)
	private String code;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "region", nullable = false, length = 100)
	private String region;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
}
