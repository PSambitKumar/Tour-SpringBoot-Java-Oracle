package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DDMStorageLink {
	@Id
	@Column(name = "storageLinkId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "structureId")
	private Long structureId;

	@Column(name = "structureVersionId")
	private Long structureVersionId;

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

	public Long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	public Long getClassPK() {
		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}

	public Long getStructureId() {
		return structureId;
	}

	public void setStructureId(Long structureId) {
		this.structureId = structureId;
	}

	public Long getStructureVersionId() {
		return structureVersionId;
	}

	public void setStructureVersionId(Long structureVersionId) {
		this.structureVersionId = structureVersionId;
	}

}