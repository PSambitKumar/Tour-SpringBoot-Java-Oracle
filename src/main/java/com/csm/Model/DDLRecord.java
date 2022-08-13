package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class DDLRecord {
	@Id
	@Column(name = "recordId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "versionUserId")
	private Long versionUserId;

	@Column(name = "versionUserName", length = 75)
	private String versionUserName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "DDMStorageId")
	private Long dDMStorageId;

	@Column(name = "recordSetId")
	private Long recordSetId;

	@Column(name = "recordSetVersion", length = 75)
	private String recordSetVersion;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "displayIndex")
	private Integer displayIndex;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getVersionUserId() {
		return versionUserId;
	}

	public void setVersionUserId(Long versionUserId) {
		this.versionUserId = versionUserId;
	}

	public String getVersionUserName() {
		return versionUserName;
	}

	public void setVersionUserName(String versionUserName) {
		this.versionUserName = versionUserName;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getDDMStorageId() {
		return dDMStorageId;
	}

	public void setDDMStorageId(Long dDMStorageId) {
		this.dDMStorageId = dDMStorageId;
	}

	public Long getRecordSetId() {
		return recordSetId;
	}

	public void setRecordSetId(Long recordSetId) {
		this.recordSetId = recordSetId;
	}

	public String getRecordSetVersion() {
		return recordSetVersion;
	}

	public void setRecordSetVersion(String recordSetVersion) {
		this.recordSetVersion = recordSetVersion;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getDisplayIndex() {
		return displayIndex;
	}

	public void setDisplayIndex(Integer displayIndex) {
		this.displayIndex = displayIndex;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}