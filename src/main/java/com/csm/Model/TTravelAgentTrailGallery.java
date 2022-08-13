package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_travel_agent_trail_gallery")
public class TTravelAgentTrailGallery {
	@Id
	@Column(name = "intTrailGalleryId", nullable = false)
	private Integer id;

	@Column(name = "intTrailTourId")
	private Integer intTrailTourId;

	@Column(name = "vchGalleryImage", length = 256)
	private String vchGalleryImage;

	@Column(name = "vchGalleryHeading", length = 128)
	private String vchGalleryHeading;

	@Column(name = "intGalleryType")
	private Integer intGalleryType;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTrailTourId() {
		return intTrailTourId;
	}

	public void setIntTrailTourId(Integer intTrailTourId) {
		this.intTrailTourId = intTrailTourId;
	}

	public String getVchGalleryImage() {
		return vchGalleryImage;
	}

	public void setVchGalleryImage(String vchGalleryImage) {
		this.vchGalleryImage = vchGalleryImage;
	}

	public String getVchGalleryHeading() {
		return vchGalleryHeading;
	}

	public void setVchGalleryHeading(String vchGalleryHeading) {
		this.vchGalleryHeading = vchGalleryHeading;
	}

	public Integer getIntGalleryType() {
		return intGalleryType;
	}

	public void setIntGalleryType(Integer intGalleryType) {
		this.intGalleryType = intGalleryType;
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

}