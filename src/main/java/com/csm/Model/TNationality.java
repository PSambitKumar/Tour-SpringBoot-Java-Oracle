package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_nationality")
public class TNationality {
	@Id
	@Column(name = "intNationalityId", nullable = false)
	private Integer id;

	@Column(name = "vchNationality")
	private String vchNationality;

	@Column(name = "vchNationalityDetails", length = 500)
	private String vchNationalityDetails;

	@Column(name = "vchCountryCode", length = 45)
	private String vchCountryCode;

	@Column(name = "dtmCreatedOn", length = 50)
	private String dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchNationality() {
		return vchNationality;
	}

	public void setVchNationality(String vchNationality) {
		this.vchNationality = vchNationality;
	}

	public String getVchNationalityDetails() {
		return vchNationalityDetails;
	}

	public void setVchNationalityDetails(String vchNationalityDetails) {
		this.vchNationalityDetails = vchNationalityDetails;
	}

	public String getVchCountryCode() {
		return vchCountryCode;
	}

	public void setVchCountryCode(String vchCountryCode) {
		this.vchCountryCode = vchCountryCode;
	}

	public String getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(String dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}