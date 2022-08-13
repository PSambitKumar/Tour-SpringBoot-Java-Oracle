package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersTeamId implements Serializable {
	private static final long serialVersionUID = -14155080926100499L;
	@Column(name = "teamId", nullable = false)
	private Long teamId;

	@Column(name = "userId", nullable = false)
	private Long userId;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UsersTeamId entity = (UsersTeamId) o;
		return Objects.equals(this.teamId, entity.teamId) &&
			   Objects.equals(this.userId, entity.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(teamId, userId);
	}

}