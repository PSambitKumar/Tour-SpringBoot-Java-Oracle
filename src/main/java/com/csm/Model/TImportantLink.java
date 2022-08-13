package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_important_link")
public class TImportantLink {
	@Id
	@Column(name = "intLinkId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "vchLinkName")
	private String vchLinkName;

	@Lob
	@Column(name = "vchURL")
	private String vchURL;

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

	public String getVchLinkName() {
		return vchLinkName;
	}

	public void setVchLinkName(String vchLinkName) {
		this.vchLinkName = vchLinkName;
	}

	public String getVchURL() {
		return vchURL;
	}

	public void setVchURL(String vchURL) {
		this.vchURL = vchURL;
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