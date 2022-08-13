package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_application_details")
public class TBirdFestivalApplicationDetail {
	@Id
	@Column(name = "intDetailsId", nullable = false)
	private Integer id;

	@Column(name = "intAppId")
	private Integer intAppId;

	@Column(name = "vchYear", length = 125)
	private String vchYear;

	@Column(name = "vchAward", length = 125)
	private String vchAward;

	@Column(name = "vchAwardDoc", length = 125)
	private String vchAwardDoc;

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

	public Integer getIntAppId() {
		return intAppId;
	}

	public void setIntAppId(Integer intAppId) {
		this.intAppId = intAppId;
	}

	public String getVchYear() {
		return vchYear;
	}

	public void setVchYear(String vchYear) {
		this.vchYear = vchYear;
	}

	public String getVchAward() {
		return vchAward;
	}

	public void setVchAward(String vchAward) {
		this.vchAward = vchAward;
	}

	public String getVchAwardDoc() {
		return vchAwardDoc;
	}

	public void setVchAwardDoc(String vchAwardDoc) {
		this.vchAwardDoc = vchAwardDoc;
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