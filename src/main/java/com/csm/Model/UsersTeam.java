package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users_Teams")
public class UsersTeam {
	@EmbeddedId
	private UsersTeamId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public UsersTeamId getId() {
		return id;
	}

	public void setId(UsersTeamId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}