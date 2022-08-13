package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_application_other_visitor")
public class TBirdFestivalApplicationOtherVisitor {
	@Id
	@Column(name = "intOtherVisitorId", nullable = false)
	private Integer id;

	@Column(name = "intAppId")
	private Integer intAppId;

	@Column(name = "vchOtherName", length = 128)
	private String vchOtherName;

	@Column(name = "vchOtherAge", length = 45)
	private String vchOtherAge;

	@Column(name = "intOtherGender")
	private Integer intOtherGender;

	@Column(name = "vchOtherDoc", length = 265)
	private String vchOtherDoc;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

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

	public String getVchOtherName() {
		return vchOtherName;
	}

	public void setVchOtherName(String vchOtherName) {
		this.vchOtherName = vchOtherName;
	}

	public String getVchOtherAge() {
		return vchOtherAge;
	}

	public void setVchOtherAge(String vchOtherAge) {
		this.vchOtherAge = vchOtherAge;
	}

	public Integer getIntOtherGender() {
		return intOtherGender;
	}

	public void setIntOtherGender(Integer intOtherGender) {
		this.intOtherGender = intOtherGender;
	}

	public String getVchOtherDoc() {
		return vchOtherDoc;
	}

	public void setVchOtherDoc(String vchOtherDoc) {
		this.vchOtherDoc = vchOtherDoc;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}