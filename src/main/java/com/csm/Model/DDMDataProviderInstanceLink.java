package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DDMDataProviderInstanceLink {
	@Id
	@Column(name = "dataProviderInstanceLinkId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "dataProviderInstanceId")
	private Long dataProviderInstanceId;

	@Column(name = "structureId")
	private Long structureId;

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

	public Long getDataProviderInstanceId() {
		return dataProviderInstanceId;
	}

	public void setDataProviderInstanceId(Long dataProviderInstanceId) {
		this.dataProviderInstanceId = dataProviderInstanceId;
	}

	public Long getStructureId() {
		return structureId;
	}

	public void setStructureId(Long structureId) {
		this.structureId = structureId;
	}

}