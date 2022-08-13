package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetEntryAssetCategoryRel {
	@Id
	@Column(name = "assetEntryAssetCategoryRelId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "assetEntryId")
	private Long assetEntryId;

	@Column(name = "assetCategoryId")
	private Long assetCategoryId;

	@Column(name = "priority")
	private Integer priority;

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

	public Long getAssetEntryId() {
		return assetEntryId;
	}

	public void setAssetEntryId(Long assetEntryId) {
		this.assetEntryId = assetEntryId;
	}

	public Long getAssetCategoryId() {
		return assetCategoryId;
	}

	public void setAssetCategoryId(Long assetCategoryId) {
		this.assetCategoryId = assetCategoryId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}