package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_location")
public class TLocation {
	@Id
	@Column(name = "intLocationId", nullable = false)
	private Integer id;

	@Column(name = "intDistrictId")
	private Integer intDistrictId;

	@Column(name = "vchLocationName", length = 128)
	private String vchLocationName;

	@Column(name = "vchLocationDesc", length = 500)
	private String vchLocationDesc;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 100)
	private String vchUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchIconName", length = 45)
	private String vchIconName;

	@Column(name = "vchPhoto", length = 45)
	private String vchPhoto;

	@Column(name = "vchLatitudeLongatude", length = 150)
	private String vchLatitudeLongatude;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchIconName() {
		return vchIconName;
	}

	public void setVchIconName(String vchIconName) {
		this.vchIconName = vchIconName;
	}

	public String getVchPhoto() {
		return vchPhoto;
	}

	public void setVchPhoto(String vchPhoto) {
		this.vchPhoto = vchPhoto;
	}

	public String getVchLatitudeLongatude() {
		return vchLatitudeLongatude;
	}

	public void setVchLatitudeLongatude(String vchLatitudeLongatude) {
		this.vchLatitudeLongatude = vchLatitudeLongatude;
	}

}