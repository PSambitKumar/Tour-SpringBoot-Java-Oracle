package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class DDLRecordVersion {
	@Id
	@Column(name = "recordVersionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "DDMStorageId")
	private Long dDMStorageId;

	@Column(name = "recordSetId")
	private Long recordSetId;

	@Column(name = "recordSetVersion", length = 75)
	private String recordSetVersion;

	@Column(name = "recordId")
	private Long recordId;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "displayIndex")
	private Integer displayIndex;

	@Column(name = "status")
	private Integer status;

	@Column(name = "statusByUserId")
	private Long statusByUserId;

	@Column(name = "statusByUserName", length = 75)
	private String statusByUserName;

	@Column(name = "statusDate")
	private Instant statusDate;

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

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
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

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getStatusByUserId() {
		return statusByUserId;
	}

	public void setStatusByUserId(Long statusByUserId) {
		this.statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		this.statusByUserName = statusByUserName;
	}

	public Instant getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Instant statusDate) {
		this.statusDate = statusDate;
	}

}