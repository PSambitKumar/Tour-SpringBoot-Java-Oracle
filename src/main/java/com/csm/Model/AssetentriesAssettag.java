package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AssetEntries_AssetTags")
public class AssetentriesAssettag {
	@EmbeddedId
	private AssetentriesAssettagId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public AssetentriesAssettagId getId() {
		return id;
	}

	public void setId(AssetentriesAssettagId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}