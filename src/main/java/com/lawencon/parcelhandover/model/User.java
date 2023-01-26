package com.lawencon.parcelhandover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(name = "users_bk", columnNames = { "code" })
})
public class User extends BaseEntity{

	private static final long serialVersionUID = -357521837308901936L;

	@Column(name = "code", nullable = false, length = 10)
	private String code;
	
	@Column(name = "fullname", nullable = false, length = 100)
	private String fullname;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
