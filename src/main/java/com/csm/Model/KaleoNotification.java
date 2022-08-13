package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoNotification {
	@Id
	@Column(name = "kaleoNotificationId", nullable = false)
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

	@Column(name = "kaleoNodeName", length = 200)
	private String kaleoNodeName;

	@Column(name = "name", length = 200)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "executionType", length = 20)
	private String executionType;

	@Lob
	@Column(name = "template")
	private String template;

	@Column(name = "templateLanguage", length = 75)
	private String templateLanguage;

	@Column(name = "notificationTypes")
	private String notificationTypes;

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

	public String getKaleoNodeName() {
		return kaleoNodeName;
	}

	public void setKaleoNodeName(String kaleoNodeName) {
		this.kaleoNodeName = kaleoNodeName;
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

	public String getExecutionType() {
		return executionType;
	}

	public void setExecutionType(String executionType) {
		this.executionType = executionType;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getTemplateLanguage() {
		return templateLanguage;
	}

	public void setTemplateLanguage(String templateLanguage) {
		this.templateLanguage = templateLanguage;
	}

	public String getNotificationTypes() {
		return notificationTypes;
	}

	public void setNotificationTypes(String notificationTypes) {
		this.notificationTypes = notificationTypes;
	}

}