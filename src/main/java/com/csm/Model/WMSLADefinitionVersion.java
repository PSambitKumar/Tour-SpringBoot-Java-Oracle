package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class WMSLADefinitionVersion {
	@Id
	@Column(name = "wmSLADefinitionVersionId", nullable = false)
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

	@Column(name = "active_")
	private Byte active;

	@Column(name = "calendarKey", length = 75)
	private String calendarKey;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "duration")
	private Long duration;

	@Column(name = "name", length = 75)
	private String name;

	@Column(name = "pauseNodeKeys", length = 75)
	private String pauseNodeKeys;

	@Column(name = "processId")
	private Long processId;

	@Column(name = "processVersion", length = 75)
	private String processVersion;

	@Column(name = "startNodeKeys", length = 75)
	private String startNodeKeys;

	@Column(name = "stopNodeKeys", length = 75)
	private String stopNodeKeys;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "wmSLADefinitionId")
	private Long wmSLADefinitionId;

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

	public Byte getActive() {
		return active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

	public String getCalendarKey() {
		return calendarKey;
	}

	public void setCalendarKey(String calendarKey) {
		this.calendarKey = calendarKey;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPauseNodeKeys() {
		return pauseNodeKeys;
	}

	public void setPauseNodeKeys(String pauseNodeKeys) {
		this.pauseNodeKeys = pauseNodeKeys;
	}

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public String getProcessVersion() {
		return processVersion;
	}

	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}

	public String getStartNodeKeys() {
		return startNodeKeys;
	}

	public void setStartNodeKeys(String startNodeKeys) {
		this.startNodeKeys = startNodeKeys;
	}

	public String getStopNodeKeys() {
		return stopNodeKeys;
	}

	public void setStopNodeKeys(String stopNodeKeys) {
		this.stopNodeKeys = stopNodeKeys;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Long getWmSLADefinitionId() {
		return wmSLADefinitionId;
	}

	public void setWmSLADefinitionId(Long wmSLADefinitionId) {
		this.wmSLADefinitionId = wmSLADefinitionId;
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