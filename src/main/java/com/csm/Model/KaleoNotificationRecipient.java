package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoNotificationRecipient {
	@Id
	@Column(name = "kaleoNotificationRecipientId", nullable = false)
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

	@Column(name = "kaleoNotificationId")
	private Long kaleoNotificationId;

	@Column(name = "recipientClassName", length = 200)
	private String recipientClassName;

	@Column(name = "recipientClassPK")
	private Long recipientClassPK;

	@Column(name = "recipientRoleType")
	private Integer recipientRoleType;

	@Lob
	@Column(name = "recipientScript")
	private String recipientScript;

	@Column(name = "recipientScriptLanguage", length = 75)
	private String recipientScriptLanguage;

	@Lob
	@Column(name = "recipientScriptContexts")
	private String recipientScriptContexts;

	@Column(name = "address")
	private String address;

	@Column(name = "notificationReceptionType", length = 3)
	private String notificationReceptionType;

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

	public Long getKaleoNotificationId() {
		return kaleoNotificationId;
	}

	public void setKaleoNotificationId(Long kaleoNotificationId) {
		this.kaleoNotificationId = kaleoNotificationId;
	}

	public String getRecipientClassName() {
		return recipientClassName;
	}

	public void setRecipientClassName(String recipientClassName) {
		this.recipientClassName = recipientClassName;
	}

	public Long getRecipientClassPK() {
		return recipientClassPK;
	}

	public void setRecipientClassPK(Long recipientClassPK) {
		this.recipientClassPK = recipientClassPK;
	}

	public Integer getRecipientRoleType() {
		return recipientRoleType;
	}

	public void setRecipientRoleType(Integer recipientRoleType) {
		this.recipientRoleType = recipientRoleType;
	}

	public String getRecipientScript() {
		return recipientScript;
	}

	public void setRecipientScript(String recipientScript) {
		this.recipientScript = recipientScript;
	}

	public String getRecipientScriptLanguage() {
		return recipientScriptLanguage;
	}

	public void setRecipientScriptLanguage(String recipientScriptLanguage) {
		this.recipientScriptLanguage = recipientScriptLanguage;
	}

	public String getRecipientScriptContexts() {
		return recipientScriptContexts;
	}

	public void setRecipientScriptContexts(String recipientScriptContexts) {
		this.recipientScriptContexts = recipientScriptContexts;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNotificationReceptionType() {
		return notificationReceptionType;
	}

	public void setNotificationReceptionType(String notificationReceptionType) {
		this.notificationReceptionType = notificationReceptionType;
	}

}