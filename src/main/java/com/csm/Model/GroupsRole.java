package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Groups_Roles")
public class GroupsRole {
	@EmbeddedId
	private GroupsRoleId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public GroupsRoleId getId() {
		return id;
	}

	public void setId(GroupsRoleId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}