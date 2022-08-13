package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_sand_art_registration")
public class TSandArtRegistration {
	@Id
	@Column(name = "intSandArtId", nullable = false)
	private Integer id;

	@Column(name = "vchArtistName", nullable = false, length = 200)
	private String vchArtistName;

	@Column(name = "vchPhoto", nullable = false, length = 257)
	private String vchPhoto;

	@Lob
	@Column(name = "vchAddressOne", nullable = false)
	private String vchAddressOne;

	@Lob
	@Column(name = "vchAddressTwo")
	private String vchAddressTwo;

	@Column(name = "intCountryId", nullable = false)
	private Integer intCountryId;

	@Column(name = "vchState", length = 50)
	private String vchState;

	@Column(name = "vchCity", length = 50)
	private String vchCity;

	@Column(name = "vchPhoneNo", length = 15)
	private String vchPhoneNo;

	@Column(name = "vchFaxNo", length = 30)
	private String vchFaxNo;

	@Column(name = "vchMobileCountryCode", length = 5)
	private String vchMobileCountryCode;

	@Column(name = "vchMobileNo", length = 15)
	private String vchMobileNo;

	@Column(name = "vchAltMobileCountryCode", length = 5)
	private String vchAltMobileCountryCode;

	@Column(name = "VchAltMobileNo", length = 15)
	private String vchAltMobileNo;

	@Column(name = "vchEmailId", length = 150)
	private String vchEmailId;

	@Lob
	@Column(name = "vchFestivalName")
	private String vchFestivalName;

	@Lob
	@Column(name = "vchArtFestCertificate")
	private String vchArtFestCertificate;

	@Lob
	@Column(name = "vchArtFestImage")
	private String vchArtFestImage;

	@Column(name = "intRuleRegulationStatus")
	private Integer intRuleRegulationStatus;

	@Column(name = "intApprovalStatus")
	private Integer intApprovalStatus;

	@Column(name = "vchRemarks", length = 200)
	private String vchRemarks;

	@Column(name = "intSentMail")
	private Integer intSentMail;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmActionTakenOn")
	private Instant dtmActionTakenOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchArtistName() {
		return vchArtistName;
	}

	public void setVchArtistName(String vchArtistName) {
		this.vchArtistName = vchArtistName;
	}

	public String getVchPhoto() {
		return vchPhoto;
	}

	public void setVchPhoto(String vchPhoto) {
		this.vchPhoto = vchPhoto;
	}

	public String getVchAddressOne() {
		return vchAddressOne;
	}

	public void setVchAddressOne(String vchAddressOne) {
		this.vchAddressOne = vchAddressOne;
	}

	public String getVchAddressTwo() {
		return vchAddressTwo;
	}

	public void setVchAddressTwo(String vchAddressTwo) {
		this.vchAddressTwo = vchAddressTwo;
	}

	public Integer getIntCountryId() {
		return intCountryId;
	}

	public void setIntCountryId(Integer intCountryId) {
		this.intCountryId = intCountryId;
	}

	public String getVchState() {
		return vchState;
	}

	public void setVchState(String vchState) {
		this.vchState = vchState;
	}

	public String getVchCity() {
		return vchCity;
	}

	public void setVchCity(String vchCity) {
		this.vchCity = vchCity;
	}

	public String getVchPhoneNo() {
		return vchPhoneNo;
	}

	public void setVchPhoneNo(String vchPhoneNo) {
		this.vchPhoneNo = vchPhoneNo;
	}

	public String getVchFaxNo() {
		return vchFaxNo;
	}

	public void setVchFaxNo(String vchFaxNo) {
		this.vchFaxNo = vchFaxNo;
	}

	public String getVchMobileCountryCode() {
		return vchMobileCountryCode;
	}

	public void setVchMobileCountryCode(String vchMobileCountryCode) {
		this.vchMobileCountryCode = vchMobileCountryCode;
	}

	public String getVchMobileNo() {
		return vchMobileNo;
	}

	public void setVchMobileNo(String vchMobileNo) {
		this.vchMobileNo = vchMobileNo;
	}

	public String getVchAltMobileCountryCode() {
		return vchAltMobileCountryCode;
	}

	public void setVchAltMobileCountryCode(String vchAltMobileCountryCode) {
		this.vchAltMobileCountryCode = vchAltMobileCountryCode;
	}

	public String getVchAltMobileNo() {
		return vchAltMobileNo;
	}

	public void setVchAltMobileNo(String vchAltMobileNo) {
		this.vchAltMobileNo = vchAltMobileNo;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchFestivalName() {
		return vchFestivalName;
	}

	public void setVchFestivalName(String vchFestivalName) {
		this.vchFestivalName = vchFestivalName;
	}

	public String getVchArtFestCertificate() {
		return vchArtFestCertificate;
	}

	public void setVchArtFestCertificate(String vchArtFestCertificate) {
		this.vchArtFestCertificate = vchArtFestCertificate;
	}

	public String getVchArtFestImage() {
		return vchArtFestImage;
	}

	public void setVchArtFestImage(String vchArtFestImage) {
		this.vchArtFestImage = vchArtFestImage;
	}

	public Integer getIntRuleRegulationStatus() {
		return intRuleRegulationStatus;
	}

	public void setIntRuleRegulationStatus(Integer intRuleRegulationStatus) {
		this.intRuleRegulationStatus = intRuleRegulationStatus;
	}

	public Integer getIntApprovalStatus() {
		return intApprovalStatus;
	}

	public void setIntApprovalStatus(Integer intApprovalStatus) {
		this.intApprovalStatus = intApprovalStatus;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

	public Integer getIntSentMail() {
		return intSentMail;
	}

	public void setIntSentMail(Integer intSentMail) {
		this.intSentMail = intSentMail;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getDtmActionTakenOn() {
		return dtmActionTakenOn;
	}

	public void setDtmActionTakenOn(Instant dtmActionTakenOn) {
		this.dtmActionTakenOn = dtmActionTakenOn;
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

}