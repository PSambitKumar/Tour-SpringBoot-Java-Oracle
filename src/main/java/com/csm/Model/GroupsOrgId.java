package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupsOrgId implements Serializable {
	private static final long serialVersionUID = -3640705523243478878L;
	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "organizationId", nullable = false)
	private Long organizationId;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		GroupsOrgId entity = (GroupsOrgId) o;
		return Objects.equals(this.organizationId, entity.organizationId) &&
			   Objects.equals(this.groupId, entity.groupId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(organizationId, groupId);
	}

}