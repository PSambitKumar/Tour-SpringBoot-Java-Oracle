package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SocialActivity {
	@Id
	@Column(name = "activityId", nullable = false)
	private Long id;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "createDate")
	private Long createDate;

	@Column(name = "activitySetId")
	private Long activitySetId;

	@Column(name = "mirrorActivityId")
	private Long mirrorActivityId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "parentClassNameId")
	private Long parentClassNameId;

	@Column(name = "parentClassPK")
	private Long parentClassPK;

	@Column(name = "type_")
	private Integer type;

	@Lob
	@Column(name = "extraData")
	private String extraData;

	@Column(name = "receiverUserId")
	private Long receiverUserId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getActivitySetId() {
		return activitySetId;
	}

	public void setActivitySetId(Long activitySetId) {
		this.activitySetId = activitySetId;
	}

	public Long getMirrorActivityId() {
		return mirrorActivityId;
	}

	public void setMirrorActivityId(Long mirrorActivityId) {
		this.mirrorActivityId = mirrorActivityId;
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

	public Long getParentClassNameId() {
		return parentClassNameId;
	}

	public void setParentClassNameId(Long parentClassNameId) {
		this.parentClassNameId = parentClassNameId;
	}

	public Long getParentClassPK() {
		return parentClassPK;
	}

	public void setParentClassPK(Long parentClassPK) {
		this.parentClassPK = parentClassPK;
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

}