package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTransition {
	@Id
	@Column(name = "kaleoTransitionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 200)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "kaleoDefinitionVersionId")
	private Long kaleoDefinitionVersionId;

	@Column(name = "kaleoNodeId")
	private Long kaleoNodeId;

	@Column(name = "name", length = 200)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "sourceKaleoNodeId")
	private Long sourceKaleoNodeId;

	@Column(name = "sourceKaleoNodeName", length = 200)
	private String sourceKaleoNodeName;

	@Column(name = "targetKaleoNodeId")
	private Long targetKaleoNodeId;

	@Column(name = "targetKaleoNodeName", length = 200)
	private String targetKaleoNodeName;

	@Column(name = "defaultTransition")
	private Byte defaultTransition;

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

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getKaleoDefinitionVersionId() {
		return kaleoDefinitionVersionId;
	}

	public void setKaleoDefinitionVersionId(Long kaleoDefinitionVersionId) {
		this.kaleoDefinitionVersionId = kaleoDefinitionVersionId;
	}

	public Long getKaleoNodeId() {
		return kaleoNodeId;
	}

	public void setKaleoNodeId(Long kaleoNodeId) {
		this.kaleoNodeId = kaleoNodeId;
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

	public Long getSourceKaleoNodeId() {
		return sourceKaleoNodeId;
	}

	public void setSourceKaleoNodeId(Long sourceKaleoNodeId) {
		this.sourceKaleoNodeId = sourceKaleoNodeId;
	}

	public String getSourceKaleoNodeName() {
		return sourceKaleoNodeName;
	}

	public void setSourceKaleoNodeName(String sourceKaleoNodeName) {
		this.sourceKaleoNodeName = sourceKaleoNodeName;
	}

	public Long getTargetKaleoNodeId() {
		return targetKaleoNodeId;
	}

	public void setTargetKaleoNodeId(Long targetKaleoNodeId) {
		this.targetKaleoNodeId = targetKaleoNodeId;
	}

	public String getTargetKaleoNodeName() {
		return targetKaleoNodeName;
	}

	public void setTargetKaleoNodeName(String targetKaleoNodeName) {
		this.targetKaleoNodeName = targetKaleoNodeName;
	}

	public Byte getDefaultTransition() {
		return defaultTransition;
	}

	public void setDefaultTransition(Byte defaultTransition) {
		this.defaultTransition = defaultTransition;
	}

}