package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTimerInstanceToken {
	@Id
	@Column(name = "kaleoTimerInstanceTokenId", nullable = false)
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

	@Column(name = "kaleoTimerId")
	private Long kaleoTimerId;

	@Column(name = "kaleoTimerName", length = 200)
	private String kaleoTimerName;

	@Column(name = "blocking")
	private Byte blocking;

	@Column(name = "completionUserId")
	private Long completionUserId;

	@Column(name = "completed")
	private Byte completed;

	@Column(name = "completionDate")
	private Instant completionDate;

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

	public Long getKaleoTimerId() {
		return kaleoTimerId;
	}

	public void setKaleoTimerId(Long kaleoTimerId) {
		this.kaleoTimerId = kaleoTimerId;
	}

	public String getKaleoTimerName() {
		return kaleoTimerName;
	}

	public void setKaleoTimerName(String kaleoTimerName) {
		this.kaleoTimerName = kaleoTimerName;
	}

	public Byte getBlocking() {
		return blocking;
	}

	public void setBlocking(Byte blocking) {
		this.blocking = blocking;
	}

	public Long getCompletionUserId() {
		return completionUserId;
	}

	public void setCompletionUserId(Long completionUserId) {
		this.completionUserId = completionUserId;
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

	public String getWorkflowContext() {
		return workflowContext;
	}

	public void setWorkflowContext(String workflowContext) {
		this.workflowContext = workflowContext;
	}

}