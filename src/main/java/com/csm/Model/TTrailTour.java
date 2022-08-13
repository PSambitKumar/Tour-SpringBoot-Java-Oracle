package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_trail_tour")
public class TTrailTour {
	@Id
	@Column(name = "INT_TRAIL_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_CATEGORY_ID")
	private Integer intCategoryId;

	@Column(name = "VCH_DESTINATION")
	private String vchDestination;

	@Column(name = "VCH_URL")
	private String vchUrl;

	@Column(name = "VCH_IMAGE", length = 200)
	private String vchImage;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPublishStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchDestination() {
		return vchDestination;
	}

	public void setVchDestination(String vchDestination) {
		this.vchDestination = vchDestination;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
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

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

}