package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_promotional_banner")
public class TPromotionalBanner {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "vchCaption", length = 100)
	private String vchCaption;

	@Column(name = "vchUrl", length = 100)
	private String vchUrl;

	@Column(name = "vchImage", length = 100)
	private String vchImage;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intStatus")
	private Integer intStatus;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intCreatedby")
	private Integer intCreatedby;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchCaption() {
		return vchCaption;
	}

	public void setVchCaption(String vchCaption) {
		this.vchCaption = vchCaption;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntStatus() {
		return intStatus;
	}

	public void setIntStatus(Integer intStatus) {
		this.intStatus = intStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Integer getIntCreatedby() {
		return intCreatedby;
	}

	public void setIntCreatedby(Integer intCreatedby) {
		this.intCreatedby = intCreatedby;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

}