package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Groups_Orgs")
public class GroupsOrg {
	@EmbeddedId
	private GroupsOrgId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public GroupsOrgId getId() {
		return id;
	}

	public void setId(GroupsOrgId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}