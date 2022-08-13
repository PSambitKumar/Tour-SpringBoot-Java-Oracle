package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrgGroupRoleId implements Serializable {
	private static final long serialVersionUID = -6325356322068710557L;
	@Column(name = "organizationId", nullable = false)
	private Long organizationId;

	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "roleId", nullable = false)
	private Long roleId;

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		OrgGroupRoleId entity = (OrgGroupRoleId) o;
		return Objects.equals(this.organizationId, entity.organizationId) &&
			   Objects.equals(this.roleId, entity.roleId) &&
			   Objects.equals(this.groupId, entity.groupId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(organizationId, roleId, groupId);
	}

}