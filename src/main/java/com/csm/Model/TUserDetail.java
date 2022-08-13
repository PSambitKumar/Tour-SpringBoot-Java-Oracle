package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_user_details")
public class TUserDetail {
	@Id
	@Column(name = "INT_USER_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Lob
	@Column(name = "ENM_USER_TYPE", nullable = false)
	private String enmUserType;

	@Column(name = "VCH_FULL_NAME", length = 128)
	private String vchFullName;

	@Column(name = "VCH_IMAGE", length = 500)
	private String vchImage;

	@Column(name = "VCH_PH_NO", length = 16)
	private String vchPhNo;

	@Column(name = "VCH_EMAIL", length = 64)
	private String vchEmail;

	@Column(name = "VCH_ADDRESS", length = 500)
	private String vchAddress;

	@Column(name = "VCH_PASSWORD", length = 64)
	private String vchPassword;

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

	@Column(name = "VCH_FACEBOOK_ID", length = 64)
	private String vchFacebookId;

	@Column(name = "INT_PUBLISH_STATUS")
	private Integer intPublishStatus;

	@Column(name = "VCH_PROJECT_IMAGE", length = 128)
	private String vchProjectImage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnmUserType() {
		return enmUserType;
	}

	public void setEnmUserType(String enmUserType) {
		this.enmUserType = enmUserType;
	}

	public String getVchFullName() {
		return vchFullName;
	}

	public void setVchFullName(String vchFullName) {
		this.vchFullName = vchFullName;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public String getVchPhNo() {
		return vchPhNo;
	}

	public void setVchPhNo(String vchPhNo) {
		this.vchPhNo = vchPhNo;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
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

	public String getVchFacebookId() {
		return vchFacebookId;
	}

	public void setVchFacebookId(String vchFacebookId) {
		this.vchFacebookId = vchFacebookId;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public String getVchProjectImage() {
		return vchProjectImage;
	}

	public void setVchProjectImage(String vchProjectImage) {
		this.vchProjectImage = vchProjectImage;
	}

}