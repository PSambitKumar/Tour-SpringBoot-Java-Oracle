package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DLFileVersionPreview {
	@Id
	@Column(name = "dlFileVersionPreviewId", nullable = false)
	private Long id;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "fileEntryId")
	private Long fileEntryId;

	@Column(name = "fileVersionId")
	private Long fileVersionId;

	@Column(name = "previewStatus")
	private Integer previewStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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

	public Integer getPreviewStatus() {
		return previewStatus;
	}

	public void setPreviewStatus(Integer previewStatus) {
		this.previewStatus = previewStatus;
	}

}