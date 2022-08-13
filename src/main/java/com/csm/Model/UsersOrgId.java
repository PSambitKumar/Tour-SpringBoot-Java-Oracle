package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsersOrgId implements Serializable {
	private static final long serialVersionUID = -6769068750429676695L;
	@Column(name = "organizationId", nullable = false)
	private Long organizationId;

	@Column(name = "userId", nullable = false)
	private Long userId;

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
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
		UsersOrgId entity = (UsersOrgId) o;
		return Objects.equals(this.organizationId, entity.organizationId) &&
			   Objects.equals(this.userId, entity.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(organizationId, userId);
	}

}