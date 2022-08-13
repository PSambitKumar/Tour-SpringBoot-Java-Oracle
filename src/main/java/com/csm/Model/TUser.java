package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_users")
public class TUser {
	@Id
	@Column(name = "intRegUserId", nullable = false)
	private Integer id;

	@Column(name = "vchUniqueId", length = 100)
	private String vchUniqueId;

	@Column(name = "vchProfilePhoto", length = 256)
	private String vchProfilePhoto;

	@Column(name = "vchTitle", length = 45)
	private String vchTitle;

	@Column(name = "vchName", length = 125)
	private String vchName;

	@Column(name = "vchEmail", length = 125)
	private String vchEmail;

	@Column(name = "vchMobile", length = 25)
	private String vchMobile;

	@Column(name = "intGender")
	private Integer intGender;

	@Column(name = "vchProfession", length = 125)
	private String vchProfession;

	@Column(name = "vchNationality")
	private Integer vchNationality;

	@Column(name = "vchState")
	private Integer vchState;

	@Column(name = "vchPinCode", length = 10)
	private String vchPinCode;

	@Column(name = "vchCityName", length = 125)
	private String vchCityName;

	@Column(name = "vchDOB", length = 24)
	private String vchDOB;

	@Column(name = "intIdentyProof")
	private Integer intIdentyProof;

	@Column(name = "vchIdentyDoc", length = 256)
	private String vchIdentyDoc;

	@Column(name = "vchPassword", length = 256)
	private String vchPassword;

	@Column(name = "tinMailVerification")
	private Integer tinMailVerification;

	@Column(name = "dtmMailVerifiedOn")
	private Instant dtmMailVerifiedOn;

	@Column(name = "intActiveStatus")
	private Integer intActiveStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "bitPassForgetStatus")
	private Boolean bitPassForgetStatus;

	@Column(name = "vchOTP", length = 4)
	private String vchOTP;

	@Column(name = "firstLogin")
	private Character firstLogin;

	@Column(name = "registrationIP", length = 16)
	private String registrationIP;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchUniqueId() {
		return vchUniqueId;
	}

	public void setVchUniqueId(String vchUniqueId) {
		this.vchUniqueId = vchUniqueId;
	}

	public String getVchProfilePhoto() {
		return vchProfilePhoto;
	}

	public void setVchProfilePhoto(String vchProfilePhoto) {
		this.vchProfilePhoto = vchProfilePhoto;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchMobile() {
		return vchMobile;
	}

	public void setVchMobile(String vchMobile) {
		this.vchMobile = vchMobile;
	}

	public Integer getIntGender() {
		return intGender;
	}

	public void setIntGender(Integer intGender) {
		this.intGender = intGender;
	}

	public String getVchProfession() {
		return vchProfession;
	}

	public void setVchProfession(String vchProfession) {
		this.vchProfession = vchProfession;
	}

	public Integer getVchNationality() {
		return vchNationality;
	}

	public void setVchNationality(Integer vchNationality) {
		this.vchNationality = vchNationality;
	}

	public Integer getVchState() {
		return vchState;
	}

	public void setVchState(Integer vchState) {
		this.vchState = vchState;
	}

	public String getVchPinCode() {
		return vchPinCode;
	}

	public void setVchPinCode(String vchPinCode) {
		this.vchPinCode = vchPinCode;
	}

	public String getVchCityName() {
		return vchCityName;
	}

	public void setVchCityName(String vchCityName) {
		this.vchCityName = vchCityName;
	}

	public String getVchDOB() {
		return vchDOB;
	}

	public void setVchDOB(String vchDOB) {
		this.vchDOB = vchDOB;
	}

	public Integer getIntIdentyProof() {
		return intIdentyProof;
	}

	public void setIntIdentyProof(Integer intIdentyProof) {
		this.intIdentyProof = intIdentyProof;
	}

	public String getVchIdentyDoc() {
		return vchIdentyDoc;
	}

	public void setVchIdentyDoc(String vchIdentyDoc) {
		this.vchIdentyDoc = vchIdentyDoc;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
	}

	public Integer getTinMailVerification() {
		return tinMailVerification;
	}

	public void setTinMailVerification(Integer tinMailVerification) {
		this.tinMailVerification = tinMailVerification;
	}

	public Instant getDtmMailVerifiedOn() {
		return dtmMailVerifiedOn;
	}

	public void setDtmMailVerifiedOn(Instant dtmMailVerifiedOn) {
		this.dtmMailVerifiedOn = dtmMailVerifiedOn;
	}

	public Integer getIntActiveStatus() {
		return intActiveStatus;
	}

	public void setIntActiveStatus(Integer intActiveStatus) {
		this.intActiveStatus = intActiveStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
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

	public Boolean getBitPassForgetStatus() {
		return bitPassForgetStatus;
	}

	public void setBitPassForgetStatus(Boolean bitPassForgetStatus) {
		this.bitPassForgetStatus = bitPassForgetStatus;
	}

	public String getVchOTP() {
		return vchOTP;
	}

	public void setVchOTP(String vchOTP) {
		this.vchOTP = vchOTP;
	}

	public Character getFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(Character firstLogin) {
		this.firstLogin = firstLogin;
	}

	public String getRegistrationIP() {
		return registrationIP;
	}

	public void setRegistrationIP(String registrationIP) {
		this.registrationIP = registrationIP;
	}

}