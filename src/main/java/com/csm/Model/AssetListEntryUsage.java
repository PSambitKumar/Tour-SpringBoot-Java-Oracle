package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class AssetListEntryUsage {
	@Id
	@Column(name = "assetListEntryUsageId", nullable = false)
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

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "assetListEntryId")
	private Long assetListEntryId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "portletId", length = 200)
	private String portletId;

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

	public Long getAssetListEntryId() {
		return assetListEntryId;
	}

	public void setAssetListEntryId(Long assetListEntryId) {
		this.assetListEntryId = assetListEntryId;
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

	public String getPortletId() {
		return portletId;
	}

	public void setPortletId(String portletId) {
		this.portletId = portletId;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}