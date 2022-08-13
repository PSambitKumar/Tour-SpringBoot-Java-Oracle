package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResourceBlockPermission {
	@Id
	@Column(name = "resourceBlockPermissionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "resourceBlockId")
	private Long resourceBlockId;

	@Column(name = "roleId")
	private Long roleId;

	@Column(name = "actionIds")
	private Long actionIds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMvccVersion() {
		return mvccVersion;
	}

	public void setMvccVersion(Long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getResourceBlockId() {
		return resourceBlockId;
	}

	public void setResourceBlockId(Long resourceBlockId) {
		this.resourceBlockId = resourceBlockId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getActionIds() {
		return actionIds;
	}

	public void setActionIds(Long actionIds) {
		this.actionIds = actionIds;
	}

}