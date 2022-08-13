package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_manage_events")
public class TManageEvent {
	@Id
	@Column(name = "intEventId", nullable = false)
	private Integer id;

	@Column(name = "vchEventName")
	private String vchEventName;

	@Column(name = "vchEventAlias", length = 200)
	private String vchEventAlias;

	@Column(name = "vchBannerImage", length = 200)
	private String vchBannerImage;

	@Column(name = "vchThumbImage", length = 200)
	private String vchThumbImage;

	@Column(name = "vchShortDesc", length = 500)
	private String vchShortDesc;

	@Column(name = "vchEventVanue", length = 200)
	private String vchEventVanue;

	@Column(name = "dtmStartDate")
	private LocalDate dtmStartDate;

	@Column(name = "dtmEndDate")
	private LocalDate dtmEndDate;

	@Column(name = "vchURL", length = 200)
	private String vchURL;

	@Column(name = "vchGalleryHeading", length = 200)
	private String vchGalleryHeading;

	@Column(name = "vchGalleryDesc", length = 500)
	private String vchGalleryDesc;

	@Lob
	@Column(name = "vchOthers")
	private String vchOthers;

	@Column(name = "intPublishStatus")
	private Integer intPublishStatus;

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

	public String getVchEventName() {
		return vchEventName;
	}

	public void setVchEventName(String vchEventName) {
		this.vchEventName = vchEventName;
	}

	public String getVchEventAlias() {
		return vchEventAlias;
	}

	public void setVchEventAlias(String vchEventAlias) {
		this.vchEventAlias = vchEventAlias;
	}

	public String getVchBannerImage() {
		return vchBannerImage;
	}

	public void setVchBannerImage(String vchBannerImage) {
		this.vchBannerImage = vchBannerImage;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
	}

	public String getVchEventVanue() {
		return vchEventVanue;
	}

	public void setVchEventVanue(String vchEventVanue) {
		this.vchEventVanue = vchEventVanue;
	}

	public LocalDate getDtmStartDate() {
		return dtmStartDate;
	}

	public void setDtmStartDate(LocalDate dtmStartDate) {
		this.dtmStartDate = dtmStartDate;
	}

	public LocalDate getDtmEndDate() {
		return dtmEndDate;
	}

	public void setDtmEndDate(LocalDate dtmEndDate) {
		this.dtmEndDate = dtmEndDate;
	}

	public String getVchURL() {
		return vchURL;
	}

	public void setVchURL(String vchURL) {
		this.vchURL = vchURL;
	}

	public String getVchGalleryHeading() {
		return vchGalleryHeading;
	}

	public void setVchGalleryHeading(String vchGalleryHeading) {
		this.vchGalleryHeading = vchGalleryHeading;
	}

	public String getVchGalleryDesc() {
		return vchGalleryDesc;
	}

	public void setVchGalleryDesc(String vchGalleryDesc) {
		this.vchGalleryDesc = vchGalleryDesc;
	}

	public String getVchOthers() {
		return vchOthers;
	}

	public void setVchOthers(String vchOthers) {
		this.vchOthers = vchOthers;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
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