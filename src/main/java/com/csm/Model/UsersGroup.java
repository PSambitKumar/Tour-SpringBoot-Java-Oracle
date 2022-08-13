package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users_Groups")
public class UsersGroup {
	@EmbeddedId
	private UsersGroupId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public UsersGroupId getId() {
		return id;
	}

	public void setId(UsersGroupId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}