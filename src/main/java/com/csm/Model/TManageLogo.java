package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_manage_logo")
public class TManageLogo {
	@Id
	@Column(name = "INT_LOGO_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_LOGO_TITLE", nullable = false, length = 50)
	private String vchLogoTitle;

	@Lob
	@Column(name = "VCH_LOGO_TITLE_O")
	private String vchLogoTitleO;

	@Column(name = "VCH_IMAGE", nullable = false, length = 50)
	private String vchImage;

	@Column(name = "VCH_DESCRIPTION_E", nullable = false, length = 500)
	private String vchDescriptionE;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED not null")
	private Long intPublishStatus;

	@Column(name = "INT_PREVILIGE_STATUS", columnDefinition = "INT UNSIGNED not null")
	private Long intPreviligeStatus;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY")
	private Integer intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "INT_APPROVAL_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intApprovalStatus;

	@Column(name = "VCH_IMAGE_H", nullable = false, length = 50)
	private String vchImageH;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchLogoTitle() {
		return vchLogoTitle;
	}

	public void setVchLogoTitle(String vchLogoTitle) {
		this.vchLogoTitle = vchLogoTitle;
	}

	public String getVchLogoTitleO() {
		return vchLogoTitleO;
	}

	public void setVchLogoTitleO(String vchLogoTitleO) {
		this.vchLogoTitleO = vchLogoTitleO;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public String getVchDescriptionE() {
		return vchDescriptionE;
	}

	public void setVchDescriptionE(String vchDescriptionE) {
		this.vchDescriptionE = vchDescriptionE;
	}

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Long getIntPreviligeStatus() {
		return intPreviligeStatus;
	}

	public void setIntPreviligeStatus(Long intPreviligeStatus) {
		this.intPreviligeStatus = intPreviligeStatus;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Long getIntApprovalStatus() {
		return intApprovalStatus;
	}

	public void setIntApprovalStatus(Long intApprovalStatus) {
		this.intApprovalStatus = intApprovalStatus;
	}

	public String getVchImageH() {
		return vchImageH;
	}

	public void setVchImageH(String vchImageH) {
		this.vchImageH = vchImageH;
	}

}