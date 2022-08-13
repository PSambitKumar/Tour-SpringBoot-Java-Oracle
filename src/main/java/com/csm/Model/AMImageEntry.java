package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class AMImageEntry {
	@Id
	@Column(name = "amImageEntryId", nullable = false)
	private Long id;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "configurationUuid", length = 75)
	private String configurationUuid;

	@Column(name = "fileVersionId")
	private Long fileVersionId;

	@Column(name = "mimeType", length = 75)
	private String mimeType;

	@Column(name = "height")
	private Integer height;

	@Column(name = "width")
	private Integer width;

	@Column(name = "size_")
	private Long size;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public String getConfigurationUuid() {
		return configurationUuid;
	}

	public void setConfigurationUuid(String configurationUuid) {
		this.configurationUuid = configurationUuid;
	}

	public Long getFileVersionId() {
		return fileVersionId;
	}

	public void setFileVersionId(Long fileVersionId) {
		this.fileVersionId = fileVersionId;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

}