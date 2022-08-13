package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UserGroups_Teams")
public class UsergroupsTeam {
	@EmbeddedId
	private UsergroupsTeamId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public UsergroupsTeamId getId() {
		return id;
	}

	public void setId(UsergroupsTeamId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}