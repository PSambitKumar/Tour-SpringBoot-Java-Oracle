package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupsUsergroupId implements Serializable {
	private static final long serialVersionUID = 3752881892880300359L;
	@Column(name = "groupId", nullable = false)
	private Long groupId;

	@Column(name = "userGroupId", nullable = false)
	private Long userGroupId;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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
		GroupsUsergroupId entity = (GroupsUsergroupId) o;
		return Objects.equals(this.userGroupId, entity.userGroupId) &&
			   Objects.equals(this.groupId, entity.groupId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userGroupId, groupId);
	}

}