package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_travel_agent")
public class TAffiliateTravelAgent {
	@Id
	@Column(name = "intAffiliateTagentId", nullable = false)
	private Integer id;

	@Column(name = "vchFirstName", length = 120)
	private String vchFirstName;

	@Column(name = "vchLastName", length = 120)
	private String vchLastName;

	@Column(name = "tinGender")
	private Byte tinGender;

	@Column(name = "vchDob", length = 24)
	private String vchDob;

	@Column(name = "vchCompanyName", length = 128)
	private String vchCompanyName;

	@Column(name = "vchJobTitle", length = 128)
	private String vchJobTitle;

	@Column(name = "vchReferenceNumberId", length = 15)
	private String vchReferenceNumberId;

	@Column(name = "vchReferenceNumber", length = 50)
	private String vchReferenceNumber;

	@Column(name = "vchBusinessProfile", length = 120)
	private String vchBusinessProfile;

	@Column(name = "vchEmailId", length = 128)
	private String vchEmailId;

	@Column(name = "vchPhone", length = 15)
	private String vchPhone;

	@Column(name = "intCountryId")
	private Integer intCountryId;

	@Column(name = "vchUserName", length = 120)
	private String vchUserName;

	@Column(name = "vchPassword", length = 256)
	private String vchPassword;

	@Column(name = "vchAffiliateAgentPhoto", length = 256)
	private String vchAffiliateAgentPhoto;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Lob
	@Column(name = "vchAddress")
	private String vchAddress;

	@Column(name = "vchNoOfVisitOdisha", length = 15)
	private String vchNoOfVisitOdisha;

	@Column(name = "vchNoOfSellingOdisha", length = 15)
	private String vchNoOfSellingOdisha;

	@Column(name = "vchNoOfBookingOdisha", length = 15)
	private String vchNoOfBookingOdisha;

	@Column(name = "vchNoOfBookingIndia", length = 15)
	private String vchNoOfBookingIndia;

	@Column(name = "intCatId", length = 50)
	private String intCatId;

	@Column(name = "vchWebsiteAddress", length = 200)
	private String vchWebsiteAddress;

	@Column(name = "vchCountryCode", length = 45)
	private String vchCountryCode;

	@Column(name = "dtmTrainingEndDate")
	private Instant dtmTrainingEndDate;

	@Column(name = "intProgressStatus")
	private Integer intProgressStatus;

	@Column(name = "vchApplicationNo", length = 45)
	private String vchApplicationNo;

	@Column(name = "vchRemarks", length = 200)
	private String vchRemarks;

	@Column(name = "dtmActionTakenOn")
	private Instant dtmActionTakenOn;

	@Column(name = "bitPassForgetStatus")
	private Boolean bitPassForgetStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchFirstName() {
		return vchFirstName;
	}

	public void setVchFirstName(String vchFirstName) {
		this.vchFirstName = vchFirstName;
	}

	public String getVchLastName() {
		return vchLastName;
	}

	public void setVchLastName(String vchLastName) {
		this.vchLastName = vchLastName;
	}

	public Byte getTinGender() {
		return tinGender;
	}

	public void setTinGender(Byte tinGender) {
		this.tinGender = tinGender;
	}

	public String getVchDob() {
		return vchDob;
	}

	public void setVchDob(String vchDob) {
		this.vchDob = vchDob;
	}

	public String getVchCompanyName() {
		return vchCompanyName;
	}

	public void setVchCompanyName(String vchCompanyName) {
		this.vchCompanyName = vchCompanyName;
	}

	public String getVchJobTitle() {
		return vchJobTitle;
	}

	public void setVchJobTitle(String vchJobTitle) {
		this.vchJobTitle = vchJobTitle;
	}

	public String getVchReferenceNumberId() {
		return vchReferenceNumberId;
	}

	public void setVchReferenceNumberId(String vchReferenceNumberId) {
		this.vchReferenceNumberId = vchReferenceNumberId;
	}

	public String getVchReferenceNumber() {
		return vchReferenceNumber;
	}

	public void setVchReferenceNumber(String vchReferenceNumber) {
		this.vchReferenceNumber = vchReferenceNumber;
	}

	public String getVchBusinessProfile() {
		return vchBusinessProfile;
	}

	public void setVchBusinessProfile(String vchBusinessProfile) {
		this.vchBusinessProfile = vchBusinessProfile;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchPhone() {
		return vchPhone;
	}

	public void setVchPhone(String vchPhone) {
		this.vchPhone = vchPhone;
	}

	public Integer getIntCountryId() {
		return intCountryId;
	}

	public void setIntCountryId(Integer intCountryId) {
		this.intCountryId = intCountryId;
	}

	public String getVchUserName() {
		return vchUserName;
	}

	public void setVchUserName(String vchUserName) {
		this.vchUserName = vchUserName;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
	}

	public String getVchAffiliateAgentPhoto() {
		return vchAffiliateAgentPhoto;
	}

	public void setVchAffiliateAgentPhoto(String vchAffiliateAgentPhoto) {
		this.vchAffiliateAgentPhoto = vchAffiliateAgentPhoto;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchNoOfVisitOdisha() {
		return vchNoOfVisitOdisha;
	}

	public void setVchNoOfVisitOdisha(String vchNoOfVisitOdisha) {
		this.vchNoOfVisitOdisha = vchNoOfVisitOdisha;
	}

	public String getVchNoOfSellingOdisha() {
		return vchNoOfSellingOdisha;
	}

	public void setVchNoOfSellingOdisha(String vchNoOfSellingOdisha) {
		this.vchNoOfSellingOdisha = vchNoOfSellingOdisha;
	}

	public String getVchNoOfBookingOdisha() {
		return vchNoOfBookingOdisha;
	}

	public void setVchNoOfBookingOdisha(String vchNoOfBookingOdisha) {
		this.vchNoOfBookingOdisha = vchNoOfBookingOdisha;
	}

	public String getVchNoOfBookingIndia() {
		return vchNoOfBookingIndia;
	}

	public void setVchNoOfBookingIndia(String vchNoOfBookingIndia) {
		this.vchNoOfBookingIndia = vchNoOfBookingIndia;
	}

	public String getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(String intCatId) {
		this.intCatId = intCatId;
	}

	public String getVchWebsiteAddress() {
		return vchWebsiteAddress;
	}

	public void setVchWebsiteAddress(String vchWebsiteAddress) {
		this.vchWebsiteAddress = vchWebsiteAddress;
	}

	public String getVchCountryCode() {
		return vchCountryCode;
	}

	public void setVchCountryCode(String vchCountryCode) {
		this.vchCountryCode = vchCountryCode;
	}

	public Instant getDtmTrainingEndDate() {
		return dtmTrainingEndDate;
	}

	public void setDtmTrainingEndDate(Instant dtmTrainingEndDate) {
		this.dtmTrainingEndDate = dtmTrainingEndDate;
	}

	public Integer getIntProgressStatus() {
		return intProgressStatus;
	}

	public void setIntProgressStatus(Integer intProgressStatus) {
		this.intProgressStatus = intProgressStatus;
	}

	public String getVchApplicationNo() {
		return vchApplicationNo;
	}

	public void setVchApplicationNo(String vchApplicationNo) {
		this.vchApplicationNo = vchApplicationNo;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

	public Instant getDtmActionTakenOn() {
		return dtmActionTakenOn;
	}

	public void setDtmActionTakenOn(Instant dtmActionTakenOn) {
		this.dtmActionTakenOn = dtmActionTakenOn;
	}

	public Boolean getBitPassForgetStatus() {
		return bitPassForgetStatus;
	}

	public void setBitPassForgetStatus(Boolean bitPassForgetStatus) {
		this.bitPassForgetStatus = bitPassForgetStatus;
	}

}