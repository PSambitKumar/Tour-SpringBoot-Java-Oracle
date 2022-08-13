package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersGroupId implements Serializable {
	private static final long serialVersionUID = -3932534449423258456L;
	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "userId", nullable = false)
	private Long userId;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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
		UsersGroupId entity = (UsersGroupId) o;
		return Objects.equals(this.groupId, entity.groupId) &&
			   Objects.equals(this.userId, entity.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupId, userId);
	}

}