package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_events_other_links")
public class TEventsOtherLink {
	@Id
	@Column(name = "intEventsOtherLinks", nullable = false)
	private Integer id;

	@Column(name = "intEventId")
	private Integer intEventId;

	@Column(name = "vchHeading", length = 200)
	private String vchHeading;

	@Column(name = "vchImage", length = 300)
	private String vchImage;

	@Column(name = "intUrlType")
	private Integer intUrlType;

	@Column(name = "intPageId")
	private Integer intPageId;

	@Column(name = "vchUrl", length = 200)
	private String vchUrl;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntEventId() {
		return intEventId;
	}

	public void setIntEventId(Integer intEventId) {
		this.intEventId = intEventId;
	}

	public String getVchHeading() {
		return vchHeading;
	}

	public void setVchHeading(String vchHeading) {
		this.vchHeading = vchHeading;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public Integer getIntUrlType() {
		return intUrlType;
	}

	public void setIntUrlType(Integer intUrlType) {
		this.intUrlType = intUrlType;
	}

	public Integer getIntPageId() {
		return intPageId;
	}

	public void setIntPageId(Integer intPageId) {
		this.intPageId = intPageId;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
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

}