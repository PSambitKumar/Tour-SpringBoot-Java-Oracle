package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupsRoleId implements Serializable {
	private static final long serialVersionUID = 4561351919929427343L;
	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "roleId", nullable = false)
	private Long roleId;

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
		GroupsRoleId entity = (GroupsRoleId) o;
		return Objects.equals(this.roleId, entity.roleId) &&
			   Objects.equals(this.groupId, entity.groupId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(roleId, groupId);
	}

}