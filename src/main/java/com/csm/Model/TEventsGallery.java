package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_events_gallery")
public class TEventsGallery {
	@Id
	@Column(name = "intEventsGalleryId", nullable = false)
	private Integer id;

	@Column(name = "intEventId")
	private Integer intEventId;

	@Column(name = "vchImageYear", length = 45)
	private String vchImageYear;

	@Column(name = "vchGalleryCaption", length = 200)
	private String vchGalleryCaption;

	@Column(name = "vchGalleryCaptionDetails")
	private String vchGalleryCaptionDetails;

	@Column(name = "vchGalleryImage")
	private String vchGalleryImage;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED")
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

	public String getVchImageYear() {
		return vchImageYear;
	}

	public void setVchImageYear(String vchImageYear) {
		this.vchImageYear = vchImageYear;
	}

	public String getVchGalleryCaption() {
		return vchGalleryCaption;
	}

	public void setVchGalleryCaption(String vchGalleryCaption) {
		this.vchGalleryCaption = vchGalleryCaption;
	}

	public String getVchGalleryCaptionDetails() {
		return vchGalleryCaptionDetails;
	}

	public void setVchGalleryCaptionDetails(String vchGalleryCaptionDetails) {
		this.vchGalleryCaptionDetails = vchGalleryCaptionDetails;
	}

	public String getVchGalleryImage() {
		return vchGalleryImage;
	}

	public void setVchGalleryImage(String vchGalleryImage) {
		this.vchGalleryImage = vchGalleryImage;
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