package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DlfileentrytypesDlfolderId implements Serializable {
	private static final long serialVersionUID = 1073916492361242746L;
	@Column(name = "fileEntryTypeId", nullable = false)
	private Long fileEntryTypeId;

	@Column(name = "folderId", nullable = false)
	private Long folderId;

	public Long getFileEntryTypeId() {
		return fileEntryTypeId;
	}

	public void setFileEntryTypeId(Long fileEntryTypeId) {
		this.fileEntryTypeId = fileEntryTypeId;
	}

	public Long getFolderId() {
		return folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		DlfileentrytypesDlfolderId entity = (DlfileentrytypesDlfolderId) o;
		return Objects.equals(this.fileEntryTypeId, entity.fileEntryTypeId) &&
			   Objects.equals(this.folderId, entity.folderId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileEntryTypeId, folderId);
	}

}