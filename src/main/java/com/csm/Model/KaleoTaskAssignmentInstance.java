package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class KaleoTaskAssignmentInstance {
	@Id
	@Column(name = "kaleoTaskAssignmentInstanceId", nullable = false)
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

	@Column(name = "kaleoInstanceId")
	private Long kaleoInstanceId;

	@Column(name = "kaleoInstanceTokenId")
	private Long kaleoInstanceTokenId;

	@Column(name = "kaleoTaskInstanceTokenId")
	private Long kaleoTaskInstanceTokenId;

	@Column(name = "kaleoTaskId")
	private Long kaleoTaskId;

	@Column(name = "kaleoTaskName", length = 200)
	private String kaleoTaskName;

	@Column(name = "assigneeClassName", length = 200)
	private String assigneeClassName;

	@Column(name = "assigneeClassPK")
	private Long assigneeClassPK;

	@Column(name = "completed")
	private Byte completed;

	@Column(name = "completionDate")
	private Instant completionDate;

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

	public Long getKaleoInstanceId() {
		return kaleoInstanceId;
	}

	public void setKaleoInstanceId(Long kaleoInstanceId) {
		this.kaleoInstanceId = kaleoInstanceId;
	}

	public Long getKaleoInstanceTokenId() {
		return kaleoInstanceTokenId;
	}

	public void setKaleoInstanceTokenId(Long kaleoInstanceTokenId) {
		this.kaleoInstanceTokenId = kaleoInstanceTokenId;
	}

	public Long getKaleoTaskInstanceTokenId() {
		return kaleoTaskInstanceTokenId;
	}

	public void setKaleoTaskInstanceTokenId(Long kaleoTaskInstanceTokenId) {
		this.kaleoTaskInstanceTokenId = kaleoTaskInstanceTokenId;
	}

	public Long getKaleoTaskId() {
		return kaleoTaskId;
	}

	public void setKaleoTaskId(Long kaleoTaskId) {
		this.kaleoTaskId = kaleoTaskId;
	}

	public String getKaleoTaskName() {
		return kaleoTaskName;
	}

	public void setKaleoTaskName(String kaleoTaskName) {
		this.kaleoTaskName = kaleoTaskName;
	}

	public String getAssigneeClassName() {
		return assigneeClassName;
	}

	public void setAssigneeClassName(String assigneeClassName) {
		this.assigneeClassName = assigneeClassName;
	}

	public Long getAssigneeClassPK() {
		return assigneeClassPK;
	}

	public void setAssigneeClassPK(Long assigneeClassPK) {
		this.assigneeClassPK = assigneeClassPK;
	}

	public Byte getCompleted() {
		return completed;
	}

	public void setCompleted(Byte completed) {
		this.completed = completed;
	}

	public Instant getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Instant completionDate) {
		this.completionDate = completionDate;
	}

}