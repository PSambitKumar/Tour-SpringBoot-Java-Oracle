package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersRoleId implements Serializable {
	private static final long serialVersionUID = -5341283971565687592L;
	@Column(name = "roleId", nullable = false)
	private Long roleId;

	@Column(name = "userId", nullable = false)
	private Long userId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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
		UsersRoleId entity = (UsersRoleId) o;
		return Objects.equals(this.roleId, entity.roleId) &&
			   Objects.equals(this.userId, entity.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(roleId, userId);
	}

}