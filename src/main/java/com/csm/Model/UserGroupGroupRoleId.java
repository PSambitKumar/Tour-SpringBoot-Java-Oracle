package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserGroupGroupRoleId implements Serializable {
	private static final long serialVersionUID = 8894097156565049880L;
	@Column(name = "userGroupId", nullable = false)
	private Long userGroupId;

	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "roleId", nullable = false)
	private Long roleId;

	public Long getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
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
		UserGroupGroupRoleId entity = (UserGroupGroupRoleId) o;
		return Objects.equals(this.userGroupId, entity.userGroupId) &&
			   Objects.equals(this.roleId, entity.roleId) &&
			   Objects.equals(this.groupId, entity.groupId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userGroupId, roleId, groupId);
	}

}