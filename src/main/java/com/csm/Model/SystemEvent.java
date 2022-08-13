package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class SystemEvent {
	@Id
	@Column(name = "systemEventId", nullable = false)
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

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "classUuid", length = 75)
	private String classUuid;

	@Column(name = "referrerClassNameId")
	private Long referrerClassNameId;

	@Column(name = "parentSystemEventId")
	private Long parentSystemEventId;

	@Column(name = "systemEventSetKey")
	private Long systemEventSetKey;

	@Column(name = "type_")
	private Integer type;

	@Lob
	@Column(name = "extraData")
	private String extraData;

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

	public Long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	public Long getClassPK() {
		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}

	public String getClassUuid() {
		return classUuid;
	}

	public void setClassUuid(String classUuid) {
		this.classUuid = classUuid;
	}

	public Long getReferrerClassNameId() {
		return referrerClassNameId;
	}

	public void setReferrerClassNameId(Long referrerClassNameId) {
		this.referrerClassNameId = referrerClassNameId;
	}

	public Long getParentSystemEventId() {
		return parentSystemEventId;
	}

	public void setParentSystemEventId(Long parentSystemEventId) {
		this.parentSystemEventId = parentSystemEventId;
	}

	public Long getSystemEventSetKey() {
		return systemEventSetKey;
	}

	public void setSystemEventSetKey(Long systemEventSetKey) {
		this.systemEventSetKey = systemEventSetKey;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

}