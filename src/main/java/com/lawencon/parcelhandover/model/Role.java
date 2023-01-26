package com.lawencon.parcelhandover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "roles", uniqueConstraints = {
        @UniqueConstraint(name = "roles_bk", columnNames = { "code" }),
        @UniqueConstraint(name = "roles_ck", columnNames = { "code", "name" })
})
public class Role extends BaseEntity {

	private static final long serialVersionUID = -5226904120408209850L;

	@Column(name = "code", nullable = false, length = 10)
    private String code;

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

	@Column(name = "name", nullable = false, length = 20)
    private String name;

}