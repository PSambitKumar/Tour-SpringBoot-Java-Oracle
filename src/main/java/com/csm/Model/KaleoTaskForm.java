package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTaskForm {
	@Id
	@Column(name = "kaleoTaskFormId", nullable = false)
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

	@Column(name = "kaleoDefinitionVersionId")
	private Long kaleoDefinitionVersionId;

	@Column(name = "kaleoNodeId")
	private Long kaleoNodeId;

	@Column(name = "kaleoTaskId")
	private Long kaleoTaskId;

	@Column(name = "kaleoTaskName", length = 200)
	private String kaleoTaskName;

	@Column(name = "name", length = 200)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "formCompanyId")
	private Long formCompanyId;

	@Lob
	@Column(name = "formDefinition")
	private String formDefinition;

	@Column(name = "formGroupId")
	private Long formGroupId;

	@Column(name = "formId")
	private Long formId;

	@Column(name = "formUuid", length = 75)
	private String formUuid;

	@Lob
	@Column(name = "metadata")
	private String metadata;

	@Column(name = "priority")
	private Integer priority;

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

	public Long getFormCompanyId() {
		return formCompanyId;
	}

	public void setFormCompanyId(Long formCompanyId) {
		this.formCompanyId = formCompanyId;
	}

	public String getFormDefinition() {
		return formDefinition;
	}

	public void setFormDefinition(String formDefinition) {
		this.formDefinition = formDefinition;
	}

	public Long getFormGroupId() {
		return formGroupId;
	}

	public void setFormGroupId(Long formGroupId) {
		this.formGroupId = formGroupId;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public String getFormUuid() {
		return formUuid;
	}

	public void setFormUuid(String formUuid) {
		this.formUuid = formUuid;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}