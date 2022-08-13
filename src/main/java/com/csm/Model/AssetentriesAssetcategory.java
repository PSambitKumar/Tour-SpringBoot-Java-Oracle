package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AssetEntries_AssetCategories")
public class AssetentriesAssetcategory {
	@EmbeddedId
	private AssetentriesAssetcategoryId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public AssetentriesAssetcategoryId getId() {
		return id;
	}

	public void setId(AssetentriesAssetcategoryId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}