package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_tour_guide")
public class TTourGuide {
	@Id
	@Column(name = "intGuideId", nullable = false)
	private Integer id;

	@Column(name = "vchFName")
	private String vchFName;

	@Column(name = "vhcLName")
	private String vhcLName;

	@Column(name = "vhcEmail")
	private String vhcEmail;

	@Column(name = "vhcPhone", length = 128)
	private String vhcPhone;

	@Column(name = "vchWebsite")
	private String vchWebsite;

	@Column(name = "intAffiliatedTo")
	private Integer intAffiliatedTo;

	@Column(name = "itnDistrictId")
	private Integer itnDistrictId;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "vchCity")
	private String vchCity;

	@Lob
	@Column(name = "vchAddress")
	private String vchAddress;

	@Column(name = "tinGender")
	private Byte tinGender;

	@Column(name = "tinPublishStatus")
	private Byte tinPublishStatus;

	@Column(name = "tinArchiveStatus")
	private Byte tinArchiveStatus;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

	@Column(name = "intSerialNo")
	private Integer intSerialNo;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchFName() {
		return vchFName;
	}

	public void setVchFName(String vchFName) {
		this.vchFName = vchFName;
	}

	public String getVhcLName() {
		return vhcLName;
	}

	public void setVhcLName(String vhcLName) {
		this.vhcLName = vhcLName;
	}

	public String getVhcEmail() {
		return vhcEmail;
	}

	public void setVhcEmail(String vhcEmail) {
		this.vhcEmail = vhcEmail;
	}

	public String getVhcPhone() {
		return vhcPhone;
	}

	public void setVhcPhone(String vhcPhone) {
		this.vhcPhone = vhcPhone;
	}

	public String getVchWebsite() {
		return vchWebsite;
	}

	public void setVchWebsite(String vchWebsite) {
		this.vchWebsite = vchWebsite;
	}

	public Integer getIntAffiliatedTo() {
		return intAffiliatedTo;
	}

	public void setIntAffiliatedTo(Integer intAffiliatedTo) {
		this.intAffiliatedTo = intAffiliatedTo;
	}

	public Integer getItnDistrictId() {
		return itnDistrictId;
	}

	public void setItnDistrictId(Integer itnDistrictId) {
		this.itnDistrictId = itnDistrictId;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public String getVchCity() {
		return vchCity;
	}

	public void setVchCity(String vchCity) {
		this.vchCity = vchCity;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public Byte getTinGender() {
		return tinGender;
	}

	public void setTinGender(Byte tinGender) {
		this.tinGender = tinGender;
	}

	public Byte getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Byte tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

	public Byte getTinArchiveStatus() {
		return tinArchiveStatus;
	}

	public void setTinArchiveStatus(Byte tinArchiveStatus) {
		this.tinArchiveStatus = tinArchiveStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
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

	public Integer getIntSerialNo() {
		return intSerialNo;
	}

	public void setIntSerialNo(Integer intSerialNo) {
		this.intSerialNo = intSerialNo;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}