package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResourcePermission {
	@Id
	@Column(name = "resourcePermissionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "name")
	private String name;

	@Column(name = "scope")
	private Integer scope;

	@Column(name = "primKey")
	private String primKey;

	@Column(name = "primKeyId")
	private Long primKeyId;

	@Column(name = "roleId")
	private Long roleId;

	@Column(name = "ownerId")
	private Long ownerId;

	@Column(name = "actionIds")
	private Long actionIds;

	@Column(name = "viewActionId")
	private Byte viewActionId;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public String getPrimKey() {
		return primKey;
	}

	public void setPrimKey(String primKey) {
		this.primKey = primKey;
	}

	public Long getPrimKeyId() {
		return primKeyId;
	}

	public void setPrimKeyId(Long primKeyId) {
		this.primKeyId = primKeyId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Long getActionIds() {
		return actionIds;
	}

	public void setActionIds(Long actionIds) {
		this.actionIds = actionIds;
	}

	public Byte getViewActionId() {
		return viewActionId;
	}

	public void setViewActionId(Byte viewActionId) {
		this.viewActionId = viewActionId;
	}

}