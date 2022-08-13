package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DLFileEntryTypes_DLFolders")
public class DlfileentrytypesDlfolder {
	@EmbeddedId
	private DlfileentrytypesDlfolderId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public DlfileentrytypesDlfolderId getId() {
		return id;
	}

	public void setId(DlfileentrytypesDlfolderId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}