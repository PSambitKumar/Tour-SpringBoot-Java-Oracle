package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SocialRequest {
	@Id
	@Column(name = "requestId", nullable = false)
	private Long id;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "createDate")
	private Long createDate;

	@Column(name = "modifiedDate")
	private Long modifiedDate;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "type_")
	private Integer type;

	@Lob
	@Column(name = "extraData")
	private String extraData;

	@Column(name = "receiverUserId")
	private Long receiverUserId;

	@Column(name = "status")
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Long getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
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

	public Long getReceiverUserId() {
		return receiverUserId;
	}

	public void setReceiverUserId(Long receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}