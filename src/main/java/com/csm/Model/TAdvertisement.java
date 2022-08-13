package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_advertisement")
public class TAdvertisement {
	@Id
	@Column(name = "intADId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "vchHeading")
	private String vchHeading;

	@Lob
	@Column(name = "vchURL")
	private String vchURL;

	@Column(name = "vchDescription", length = 300)
	private String vchDescription;

	@Column(name = "vchFileName", nullable = false, length = 100)
	private String vchFileName;

	@Column(name = "tinPublishStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinPublishStatus;

	@Column(name = "tinArcStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinArcStatus;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchHeading() {
		return vchHeading;
	}

	public void setVchHeading(String vchHeading) {
		this.vchHeading = vchHeading;
	}

	public String getVchURL() {
		return vchURL;
	}

	public void setVchURL(String vchURL) {
		this.vchURL = vchURL;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public String getVchFileName() {
		return vchFileName;
	}

	public void setVchFileName(String vchFileName) {
		this.vchFileName = vchFileName;
	}

	public Short getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Short tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

	public Short getTinArcStatus() {
		return tinArcStatus;
	}

	public void setTinArcStatus(Short tinArcStatus) {
		this.tinArcStatus = tinArcStatus;
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