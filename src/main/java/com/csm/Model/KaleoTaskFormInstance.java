package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTaskFormInstance {
	@Id
	@Column(name = "kaleoTaskFormInstanceId", nullable = false)
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

	@Column(name = "kaleoInstanceId")
	private Long kaleoInstanceId;

	@Column(name = "kaleoTaskId")
	private Long kaleoTaskId;

	@Column(name = "kaleoTaskInstanceTokenId")
	private Long kaleoTaskInstanceTokenId;

	@Column(name = "kaleoTaskFormId")
	private Long kaleoTaskFormId;

	@Lob
	@Column(name = "formValues")
	private String formValues;

	@Column(name = "formValueEntryGroupId")
	private Long formValueEntryGroupId;

	@Column(name = "formValueEntryId")
	private Long formValueEntryId;

	@Column(name = "formValueEntryUuid", length = 75)
	private String formValueEntryUuid;

	@Lob
	@Column(name = "metadata")
	private String metadata;

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

	public Long getKaleoTaskId() {
		return kaleoTaskId;
	}

	public void setKaleoTaskId(Long kaleoTaskId) {
		this.kaleoTaskId = kaleoTaskId;
	}

	public Long getKaleoTaskInstanceTokenId() {
		return kaleoTaskInstanceTokenId;
	}

	public void setKaleoTaskInstanceTokenId(Long kaleoTaskInstanceTokenId) {
		this.kaleoTaskInstanceTokenId = kaleoTaskInstanceTokenId;
	}

	public Long getKaleoTaskFormId() {
		return kaleoTaskFormId;
	}

	public void setKaleoTaskFormId(Long kaleoTaskFormId) {
		this.kaleoTaskFormId = kaleoTaskFormId;
	}

	public String getFormValues() {
		return formValues;
	}

	public void setFormValues(String formValues) {
		this.formValues = formValues;
	}

	public Long getFormValueEntryGroupId() {
		return formValueEntryGroupId;
	}

	public void setFormValueEntryGroupId(Long formValueEntryGroupId) {
		this.formValueEntryGroupId = formValueEntryGroupId;
	}

	public Long getFormValueEntryId() {
		return formValueEntryId;
	}

	public void setFormValueEntryId(Long formValueEntryId) {
		this.formValueEntryId = formValueEntryId;
	}

	public String getFormValueEntryUuid() {
		return formValueEntryUuid;
	}

	public void setFormValueEntryUuid(String formValueEntryUuid) {
		this.formValueEntryUuid = formValueEntryUuid;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

}