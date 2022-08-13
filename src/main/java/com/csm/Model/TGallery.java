package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_gallery")
public class TGallery {
	@Id
	@Column(name = "INT_GALLERY_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_HEADLINE_E", nullable = false, length = 200)
	private String vchHeadlineE;

	@Lob
	@Column(name = "VCH_HEADLINE_O")
	private String vchHeadlineO;

	@Column(name = "VCH_THUMB_IMAGE", length = 128)
	private String vchThumbImage;

	@Column(name = "VCH_LARGE_IMAGE", length = 128)
	private String vchLargeImage;

	@Column(name = "VCH_DESCRIPTION_E", length = 500)
	private String vchDescriptionE;

	@Lob
	@Column(name = "VCH_DESCRIPTION_O")
	private String vchDescriptionO;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	@Column(name = "VCH_URL", length = 258)
	private String vchUrl;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPublishStatus;

	@Column(name = "INT_ARCHIVE_STATUS", columnDefinition = "INT UNSIGNED not null")
	private Long intArchiveStatus;

	@Column(name = "INT_CATEGORY_ID", nullable = false)
	private Integer intCategoryId;

	@Column(name = "VCH_PORTAL_TYPE", length = 100)
	private String vchPortalType;

	@Column(name = "INT_TYPE_ID", columnDefinition = "TINYINT UNSIGNED")
	private Short intTypeId;

	@Column(name = "INT_VIDEO_LINK_TYPE", columnDefinition = "TINYINT UNSIGNED")
	private Short intVideoLinkType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchHeadlineE() {
		return vchHeadlineE;
	}

	public void setVchHeadlineE(String vchHeadlineE) {
		this.vchHeadlineE = vchHeadlineE;
	}

	public String getVchHeadlineO() {
		return vchHeadlineO;
	}

	public void setVchHeadlineO(String vchHeadlineO) {
		this.vchHeadlineO = vchHeadlineO;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchLargeImage() {
		return vchLargeImage;
	}

	public void setVchLargeImage(String vchLargeImage) {
		this.vchLargeImage = vchLargeImage;
	}

	public String getVchDescriptionE() {
		return vchDescriptionE;
	}

	public void setVchDescriptionE(String vchDescriptionE) {
		this.vchDescriptionE = vchDescriptionE;
	}

	public String getVchDescriptionO() {
		return vchDescriptionO;
	}

	public void setVchDescriptionO(String vchDescriptionO) {
		this.vchDescriptionO = vchDescriptionO;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
	}

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Long getIntArchiveStatus() {
		return intArchiveStatus;
	}

	public void setIntArchiveStatus(Long intArchiveStatus) {
		this.intArchiveStatus = intArchiveStatus;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchPortalType() {
		return vchPortalType;
	}

	public void setVchPortalType(String vchPortalType) {
		this.vchPortalType = vchPortalType;
	}

	public Short getIntTypeId() {
		return intTypeId;
	}

	public void setIntTypeId(Short intTypeId) {
		this.intTypeId = intTypeId;
	}

	public Short getIntVideoLinkType() {
		return intVideoLinkType;
	}

	public void setIntVideoLinkType(Short intVideoLinkType) {
		this.intVideoLinkType = intVideoLinkType;
	}

}