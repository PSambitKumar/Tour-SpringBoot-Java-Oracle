package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DLFileEntryMetadata")
public class DLFileEntryMetadatum {
	@Id
	@Column(name = "fileEntryMetadataId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "DDMStorageId")
	private Long dDMStorageId;

	@Column(name = "DDMStructureId")
	private Long dDMStructureId;

	@Column(name = "fileEntryId")
	private Long fileEntryId;

	@Column(name = "fileVersionId")
	private Long fileVersionId;

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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getDDMStorageId() {
		return dDMStorageId;
	}

	public void setDDMStorageId(Long dDMStorageId) {
		this.dDMStorageId = dDMStorageId;
	}

	public Long getDDMStructureId() {
		return dDMStructureId;
	}

	public void setDDMStructureId(Long dDMStructureId) {
		this.dDMStructureId = dDMStructureId;
	}

	public Long getFileEntryId() {
		return fileEntryId;
	}

	public void setFileEntryId(Long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	public Long getFileVersionId() {
		return fileVersionId;
	}

	public void setFileVersionId(Long fileVersionId) {
		this.fileVersionId = fileVersionId;
	}

}