package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users_Roles")
public class UsersRole {
	@EmbeddedId
	private UsersRoleId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public UsersRoleId getId() {
		return id;
	}

	public void setId(UsersRoleId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}