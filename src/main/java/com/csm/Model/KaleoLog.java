package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoLog {
	@Id
	@Column(name = "kaleoLogId", nullable = false)
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

	@Column(name = "kaleoInstanceId")
	private Long kaleoInstanceId;

	@Column(name = "kaleoInstanceTokenId")
	private Long kaleoInstanceTokenId;

	@Column(name = "kaleoTaskInstanceTokenId")
	private Long kaleoTaskInstanceTokenId;

	@Column(name = "kaleoNodeName", length = 200)
	private String kaleoNodeName;

	@Column(name = "terminalKaleoNode")
	private Byte terminalKaleoNode;

	@Column(name = "kaleoActionId")
	private Long kaleoActionId;

	@Column(name = "kaleoActionName", length = 200)
	private String kaleoActionName;

	@Lob
	@Column(name = "kaleoActionDescription")
	private String kaleoActionDescription;

	@Column(name = "previousKaleoNodeId")
	private Long previousKaleoNodeId;

	@Column(name = "previousKaleoNodeName", length = 200)
	private String previousKaleoNodeName;

	@Column(name = "previousAssigneeClassName", length = 200)
	private String previousAssigneeClassName;

	@Column(name = "previousAssigneeClassPK")
	private Long previousAssigneeClassPK;

	@Column(name = "currentAssigneeClassName", length = 200)
	private String currentAssigneeClassName;

	@Column(name = "currentAssigneeClassPK")
	private Long currentAssigneeClassPK;

	@Column(name = "type_", length = 50)
	private String type;

	@Lob
	@Column(name = "comment_")
	private String comment;

	@Column(name = "startDate")
	private Instant startDate;

	@Column(name = "endDate")
	private Instant endDate;

	@Column(name = "duration")
	private Long duration;

	@Lob
	@Column(name = "workflowContext")
	private String workflowContext;

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

	public String getKaleoNodeName() {
		return kaleoNodeName;
	}

	public void setKaleoNodeName(String kaleoNodeName) {
		this.kaleoNodeName = kaleoNodeName;
	}

	public Byte getTerminalKaleoNode() {
		return terminalKaleoNode;
	}

	public void setTerminalKaleoNode(Byte terminalKaleoNode) {
		this.terminalKaleoNode = terminalKaleoNode;
	}

	public Long getKaleoActionId() {
		return kaleoActionId;
	}

	public void setKaleoActionId(Long kaleoActionId) {
		this.kaleoActionId = kaleoActionId;
	}

	public String getKaleoActionName() {
		return kaleoActionName;
	}

	public void setKaleoActionName(String kaleoActionName) {
		this.kaleoActionName = kaleoActionName;
	}

	public String getKaleoActionDescription() {
		return kaleoActionDescription;
	}

	public void setKaleoActionDescription(String kaleoActionDescription) {
		this.kaleoActionDescription = kaleoActionDescription;
	}

	public Long getPreviousKaleoNodeId() {
		return previousKaleoNodeId;
	}

	public void setPreviousKaleoNodeId(Long previousKaleoNodeId) {
		this.previousKaleoNodeId = previousKaleoNodeId;
	}

	public String getPreviousKaleoNodeName() {
		return previousKaleoNodeName;
	}

	public void setPreviousKaleoNodeName(String previousKaleoNodeName) {
		this.previousKaleoNodeName = previousKaleoNodeName;
	}

	public String getPreviousAssigneeClassName() {
		return previousAssigneeClassName;
	}

	public void setPreviousAssigneeClassName(String previousAssigneeClassName) {
		this.previousAssigneeClassName = previousAssigneeClassName;
	}

	public Long getPreviousAssigneeClassPK() {
		return previousAssigneeClassPK;
	}

	public void setPreviousAssigneeClassPK(Long previousAssigneeClassPK) {
		this.previousAssigneeClassPK = previousAssigneeClassPK;
	}

	public String getCurrentAssigneeClassName() {
		return currentAssigneeClassName;
	}

	public void setCurrentAssigneeClassName(String currentAssigneeClassName) {
		this.currentAssigneeClassName = currentAssigneeClassName;
	}

	public Long getCurrentAssigneeClassPK() {
		return currentAssigneeClassPK;
	}

	public void setCurrentAssigneeClassPK(Long currentAssigneeClassPK) {
		this.currentAssigneeClassPK = currentAssigneeClassPK;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Instant getStartDate() {
		return startDate;
	}

	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}

	public Instant getEndDate() {
		return endDate;
	}

	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getWorkflowContext() {
		return workflowContext;
	}

	public void setWorkflowContext(String workflowContext) {
		this.workflowContext = workflowContext;
	}

}