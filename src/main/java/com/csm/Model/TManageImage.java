package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_manage_image")
public class TManageImage {
	@Id
	@Column(name = "intImageId", nullable = false)
	private Integer id;

	@Column(name = "intApplicationId")
	private Integer intApplicationId;

	@Column(name = "intImageType")
	private Integer intImageType;

	@Column(name = "vchFileName", length = 150)
	private String vchFileName;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "vchGalleryCaption", length = 128)
	private String vchGalleryCaption;

	@Column(name = "intType")
	private Integer intType;

	@Column(name = "vchYoutubeUrl", length = 124)
	private String vchYoutubeUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntApplicationId() {
		return intApplicationId;
	}

	public void setIntApplicationId(Integer intApplicationId) {
		this.intApplicationId = intApplicationId;
	}

	public Integer getIntImageType() {
		return intImageType;
	}

	public void setIntImageType(Integer intImageType) {
		this.intImageType = intImageType;
	}

	public String getVchFileName() {
		return vchFileName;
	}

	public void setVchFileName(String vchFileName) {
		this.vchFileName = vchFileName;
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

	public String getVchGalleryCaption() {
		return vchGalleryCaption;
	}

	public void setVchGalleryCaption(String vchGalleryCaption) {
		this.vchGalleryCaption = vchGalleryCaption;
	}

	public Integer getIntType() {
		return intType;
	}

	public void setIntType(Integer intType) {
		this.intType = intType;
	}

	public String getVchYoutubeUrl() {
		return vchYoutubeUrl;
	}

	public void setVchYoutubeUrl(String vchYoutubeUrl) {
		this.vchYoutubeUrl = vchYoutubeUrl;
	}

}