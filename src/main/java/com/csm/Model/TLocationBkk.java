package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "t_Location_bkk")
public class TLocationBkk {
	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "intDistrictId")
	private Integer intDistrictId;

	@Lob
	@Column(name = "vchLocationName")
	private String vchLocationName;

	@Lob
	@Column(name = "vchLocationDesc")
	private String vchLocationDesc;

	@Lob
	@Column(name = "dtmCreatedOn")
	private String dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Lob
	@Column(name = "dtmUpdatedOn")
	private String dtmUpdatedOn;

	@Lob
	@Column(name = "intUpdatedBy")
	private String intUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Integer bitDeletedFlag;

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public Integer getIntDistrictId() {
		return intDistrictId;
	}

	public void setIntDistrictId(Integer intDistrictId) {
		this.intDistrictId = intDistrictId;
	}

	public String getVchLocationName() {
		return vchLocationName;
	}

	public void setVchLocationName(String vchLocationName) {
		this.vchLocationName = vchLocationName;
	}

	public String getVchLocationDesc() {
		return vchLocationDesc;
	}

	public void setVchLocationDesc(String vchLocationDesc) {
		this.vchLocationDesc = vchLocationDesc;
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

	public String getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(String dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(String intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Integer getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Integer bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}