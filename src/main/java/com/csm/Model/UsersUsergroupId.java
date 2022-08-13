package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersUsergroupId implements Serializable {
	private static final long serialVersionUID = 1152961835759313815L;
	@Column(name = "userId", nullable = false)
	private Long userId;

	@Column(name = "userGroupId", nullable = false)
	private Long userGroupId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
		UsersUsergroupId entity = (UsersUsergroupId) o;
		return Objects.equals(this.userGroupId, entity.userGroupId) &&
			   Objects.equals(this.userId, entity.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userGroupId, userId);
	}

}