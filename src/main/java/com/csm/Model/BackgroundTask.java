package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class BackgroundTask {
	@Id
	@Column(name = "backgroundTaskId", nullable = false)
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

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "name")
	private String name;

	@Column(name = "servletContextNames")
	private String servletContextNames;

	@Column(name = "taskExecutorClassName", length = 200)
	private String taskExecutorClassName;

	@Lob
	@Column(name = "taskContextMap")
	private String taskContextMap;

	@Column(name = "completed")
	private Byte completed;

	@Column(name = "completionDate")
	private Instant completionDate;

	@Column(name = "status")
	private Integer status;

	@Lob
	@Column(name = "statusMessage")
	private String statusMessage;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServletContextNames() {
		return servletContextNames;
	}

	public void setServletContextNames(String servletContextNames) {
		this.servletContextNames = servletContextNames;
	}

	public String getTaskExecutorClassName() {
		return taskExecutorClassName;
	}

	public void setTaskExecutorClassName(String taskExecutorClassName) {
		this.taskExecutorClassName = taskExecutorClassName;
	}

	public String getTaskContextMap() {
		return taskContextMap;
	}

	public void setTaskContextMap(String taskContextMap) {
		this.taskContextMap = taskContextMap;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}