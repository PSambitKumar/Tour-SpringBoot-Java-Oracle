package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTaskAssignment {
	@Id
	@Column(name = "kaleoTaskAssignmentId", nullable = false)
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

	@Column(name = "kaleoClassName", length = 200)
	private String kaleoClassName;

	@Column(name = "kaleoClassPK")
	private Long kaleoClassPK;

	@Column(name = "kaleoDefinitionVersionId")
	private Long kaleoDefinitionVersionId;

	@Column(name = "kaleoNodeId")
	private Long kaleoNodeId;

	@Column(name = "assigneeClassName", length = 200)
	private String assigneeClassName;

	@Column(name = "assigneeClassPK")
	private Long assigneeClassPK;

	@Column(name = "assigneeActionId", length = 75)
	private String assigneeActionId;

	@Lob
	@Column(name = "assigneeScript")
	private String assigneeScript;

	@Column(name = "assigneeScriptLanguage", length = 75)
	private String assigneeScriptLanguage;

	@Lob
	@Column(name = "assigneeScriptRequiredContexts")
	private String assigneeScriptRequiredContexts;

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

	public String getKaleoClassName() {
		return kaleoClassName;
	}

	public void setKaleoClassName(String kaleoClassName) {
		this.kaleoClassName = kaleoClassName;
	}

	public Long getKaleoClassPK() {
		return kaleoClassPK;
	}

	public void setKaleoClassPK(Long kaleoClassPK) {
		this.kaleoClassPK = kaleoClassPK;
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

	public String getAssigneeActionId() {
		return assigneeActionId;
	}

	public void setAssigneeActionId(String assigneeActionId) {
		this.assigneeActionId = assigneeActionId;
	}

	public String getAssigneeScript() {
		return assigneeScript;
	}

	public void setAssigneeScript(String assigneeScript) {
		this.assigneeScript = assigneeScript;
	}

	public String getAssigneeScriptLanguage() {
		return assigneeScriptLanguage;
	}

	public void setAssigneeScriptLanguage(String assigneeScriptLanguage) {
		this.assigneeScriptLanguage = assigneeScriptLanguage;
	}

	public String getAssigneeScriptRequiredContexts() {
		return assigneeScriptRequiredContexts;
	}

	public void setAssigneeScriptRequiredContexts(String assigneeScriptRequiredContexts) {
		this.assigneeScriptRequiredContexts = assigneeScriptRequiredContexts;
	}

}