package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsergroupsTeamId implements Serializable {
	private static final long serialVersionUID = 5148536202638003665L;
	@Column(name = "teamId", nullable = false)
	private Long teamId;

	@Column(name = "userGroupId", nullable = false)
	private Long userGroupId;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UsergroupsTeamId entity = (UsergroupsTeamId) o;
		return Objects.equals(this.userGroupId, entity.userGroupId) &&
			   Objects.equals(this.teamId, entity.teamId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userGroupId, teamId);
	}

}