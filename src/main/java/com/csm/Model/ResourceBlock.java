package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResourceBlock {
	@Id
	@Column(name = "resourceBlockId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "name", length = 75)
	private String name;

	@Column(name = "permissionsHash", length = 75)
	private String permissionsHash;

	@Column(name = "referenceCount")
	private Long referenceCount;

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

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermissionsHash() {
		return permissionsHash;
	}

	public void setPermissionsHash(String permissionsHash) {
		this.permissionsHash = permissionsHash;
	}

	public Long getReferenceCount() {
		return referenceCount;
	}

	public void setReferenceCount(Long referenceCount) {
		this.referenceCount = referenceCount;
	}

}