package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class DDLRecordSet {
	@Id
	@Column(name = "recordSetId", nullable = false)
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

	@Column(name = "DDMStructureId")
	private Long dDMStructureId;

	@Column(name = "recordSetKey", length = 75)
	private String recordSetKey;

	@Column(name = "version", length = 75)
	private String version;

	@Lob
	@Column(name = "name")
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "minDisplayRows")
	private Integer minDisplayRows;

	@Column(name = "scope")
	private Integer scope;

	@Lob
	@Column(name = "settings_")
	private String settings;

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

	public Long getDDMStructureId() {
		return dDMStructureId;
	}

	public void setDDMStructureId(Long dDMStructureId) {
		this.dDMStructureId = dDMStructureId;
	}

	public String getRecordSetKey() {
		return recordSetKey;
	}

	public void setRecordSetKey(String recordSetKey) {
		this.recordSetKey = recordSetKey;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMinDisplayRows() {
		return minDisplayRows;
	}

	public void setMinDisplayRows(Integer minDisplayRows) {
		this.minDisplayRows = minDisplayRows;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}