package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KaleoTimer {
	@Id
	@Column(name = "kaleoTimerId", nullable = false)
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

	@Column(name = "name", length = 75)
	private String name;

	@Column(name = "blocking")
	private Byte blocking;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "duration")
	private Double duration;

	@Column(name = "scale", length = 75)
	private String scale;

	@Column(name = "recurrenceDuration")
	private Double recurrenceDuration;

	@Column(name = "recurrenceScale", length = 75)
	private String recurrenceScale;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getBlocking() {
		return blocking;
	}

	public void setBlocking(Byte blocking) {
		this.blocking = blocking;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public Double getRecurrenceDuration() {
		return recurrenceDuration;
	}

	public void setRecurrenceDuration(Double recurrenceDuration) {
		this.recurrenceDuration = recurrenceDuration;
	}

	public String getRecurrenceScale() {
		return recurrenceScale;
	}

	public void setRecurrenceScale(String recurrenceScale) {
		this.recurrenceScale = recurrenceScale;
	}

}