package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Groups_UserGroups")
public class GroupsUsergroup {
	@EmbeddedId
	private GroupsUsergroupId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public GroupsUsergroupId getId() {
		return id;
	}

	public void setId(GroupsUsergroupId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}