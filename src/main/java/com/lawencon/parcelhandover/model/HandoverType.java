package com.lawencon.parcelhandover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "handover_type", uniqueConstraints = {
	@UniqueConstraint(name = "handover_type_bk", columnNames = { "code" })
})
public class HandoverType extends BaseEntity {
	
	private static final long serialVersionUID = 1084955917764437867L;

	@Column(name = "code", nullable = false, length = 10)
    private String code;
	
	@Column(name = "name", nullable = false, length = 20)
    private String name;

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
	
}
