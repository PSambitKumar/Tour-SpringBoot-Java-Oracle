package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_citizen_discussion")
public class TCitizenDiscussion {
	@Id
	@Column(name = "INT_DISCUSS_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_USER_ID", columnDefinition = "INT UNSIGNED")
	private Long intUserId;

	@Column(name = "INT_TOPIC_ID", columnDefinition = "INT UNSIGNED")
	private Long intTopicId;

	@Column(name = "INT_PARENT_ID")
	private Integer intParentId;

	@Column(name = "VCH_FULL_NAME", length = 128)
	private String vchFullName;

	@Column(name = "VCH_MOB_NO", length = 16)
	private String vchMobNo;

	@Column(name = "VCH_EMAIL", length = 64)
	private String vchEmail;

	@Lob
	@Column(name = "VCH_MESSAGE")
	private String vchMessage;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "INT_UPDATED_BY")
	private Integer intUpdatedBy;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	@Column(name = "INT_PUBLISH_STATUS")
	private Integer intPublishStatus;

	@Column(name = "INT_LIKES")
	private Long intLikes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Long intUserId) {
		this.intUserId = intUserId;
	}

	public Long getIntTopicId() {
		return intTopicId;
	}

	public void setIntTopicId(Long intTopicId) {
		this.intTopicId = intTopicId;
	}

	public Integer getIntParentId() {
		return intParentId;
	}

	public void setIntParentId(Integer intParentId) {
		this.intParentId = intParentId;
	}

	public String getVchFullName() {
		return vchFullName;
	}

	public void setVchFullName(String vchFullName) {
		this.vchFullName = vchFullName;
	}

	public String getVchMobNo() {
		return vchMobNo;
	}

	public void setVchMobNo(String vchMobNo) {
		this.vchMobNo = vchMobNo;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchMessage() {
		return vchMessage;
	}

	public void setVchMessage(String vchMessage) {
		this.vchMessage = vchMessage;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Long getIntLikes() {
		return intLikes;
	}

	public void setIntLikes(Long intLikes) {
		this.intLikes = intLikes;
	}

}