package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users_Orgs")
public class UsersOrg {
	@EmbeddedId
	private UsersOrgId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public UsersOrgId getId() {
		return id;
	}

	public void setId(UsersOrgId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}