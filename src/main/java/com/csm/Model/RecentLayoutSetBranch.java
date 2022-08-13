package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecentLayoutSetBranch {
	@Id
	@Column(name = "recentLayoutSetBranchId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "layoutSetBranchId")
	private Long layoutSetBranchId;

	@Column(name = "layoutSetId")
	private Long layoutSetId;

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

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getLayoutSetBranchId() {
		return layoutSetBranchId;
	}

	public void setLayoutSetBranchId(Long layoutSetBranchId) {
		this.layoutSetBranchId = layoutSetBranchId;
	}

	public Long getLayoutSetId() {
		return layoutSetId;
	}

	public void setLayoutSetId(Long layoutSetId) {
		this.layoutSetId = layoutSetId;
	}

}