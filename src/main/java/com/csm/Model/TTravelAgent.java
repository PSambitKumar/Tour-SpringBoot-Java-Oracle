package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_travel_agent")
public class TTravelAgent {
	@Id
	@Column(name = "intAgentId", nullable = false)
	private Integer id;

	@Column(name = "intUserType")
	private Integer intUserType;

	@Column(name = "vchOrganisationName", length = 128)
	private String vchOrganisationName;

	@Column(name = "vchContactPerson", length = 128)
	private String vchContactPerson;

	@Column(name = "vchPhoto", length = 256)
	private String vchPhoto;

	@Column(name = "intCountryId")
	private Integer intCountryId;

	@Column(name = "intStateId")
	private Integer intStateId;

	@Column(name = "vchCity", length = 128)
	private String vchCity;

	@Column(name = "vchOrganisationAddress", length = 512)
	private String vchOrganisationAddress;

	@Column(name = "vchTelephoneNo", length = 28)
	private String vchTelephoneNo;

	@Column(name = "vchFaxNo", length = 28)
	private String vchFaxNo;

	@Column(name = "vchEmailId", length = 128)
	private String vchEmailId;

	@Column(name = "vchMobileNo", length = 16)
	private String vchMobileNo;

	@Column(name = "vchWebsite", length = 128)
	private String vchWebsite;

	@Column(name = "vchCoordinates", length = 64)
	private String vchCoordinates;

	@Column(name = "vchUserName", length = 128)
	private String vchUserName;

	@Column(name = "vchPassword", length = 128)
	private String vchPassword;

	@Column(name = "dtmLastLogin")
	private Instant dtmLastLogin;

	@Column(name = "bitPassForgetStatus")
	private Boolean bitPassForgetStatus;

	@Column(name = "intActiveStatus")
	private Boolean intActiveStatus;

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

	@Column(name = "intMailVerification")
	private Integer intMailVerification;

	@Column(name = "vchDesignation", length = 128)
	private String vchDesignation;

	@Column(name = "intAgentDashboardHintStatus")
	private Integer intAgentDashboardHintStatus;

	@Column(name = "intAgentCreateHintStatus")
	private Integer intAgentCreateHintStatus;

	@Column(name = "intFirmtype")
	private Integer intFirmtype;

	@Column(name = "yrYearFounded")
	private Integer yrYearFounded;

	@Column(name = "yrYearRegistered")
	private Integer yrYearRegistered;

	@Column(name = "vchCompanyCertificate", length = 100)
	private String vchCompanyCertificate;

	@Column(name = "intDistrictId")
	private Integer intDistrictId;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "intApprovalStatus")
	private Integer intApprovalStatus;

	@Column(name = "vchApplicationNo", length = 45)
	private String vchApplicationNo;

	@Column(name = "intIsEmailSent")
	private Boolean intIsEmailSent;

	@Column(name = "intPendingWith")
	private Integer intPendingWith;

	@Column(name = "intNextATA")
	private Integer intNextATA;

	@Column(name = "intActionTakenBy")
	private Integer intActionTakenBy;

	@Column(name = "intRedommended")
	private Integer intRedommended;

	@Column(name = "vchRemarks", length = 512)
	private String vchRemarks;

	@Column(name = "dtmActionTakenOn")
	private Instant dtmActionTakenOn;

	@Column(name = "intTotalFeildsCount")
	private Integer intTotalFeildsCount;

	@Column(name = "vchTypeOfCeritficate", length = 128)
	private String vchTypeOfCeritficate;

	@Column(name = "vchOtherCertificateName", length = 256)
	private String vchOtherCertificateName;

	@Column(name = "vchApproximateArea", precision = 10, scale = 2)
	private BigDecimal vchApproximateArea;

	@Column(name = "vchRegisteredAddress", length = 256)
	private String vchRegisteredAddress;

	@Column(name = "vchTypeOfDocumentsDirector", length = 128)
	private String vchTypeOfDocumentsDirector;

	@Column(name = "vchOtherDocumentDirector", length = 128)
	private String vchOtherDocumentDirector;

	@Column(name = "vchDocumentDirector", length = 256)
	private String vchDocumentDirector;

	@Column(name = "vchNoEmployee")
	private Integer vchNoEmployee;

	@Column(name = "vchHotelierDemo", length = 115)
	private String vchHotelierDemo;

	@Column(name = "vchLastLoginIP", length = 28)
	private String vchLastLoginIP;

	@Column(name = "vchOfficePhoneType")
	private Integer vchOfficePhoneType;

	@Column(name = "dtmAccreditedFrom")
	private LocalDate dtmAccreditedFrom;

	@Column(name = "dtmAccreditedTo")
	private LocalDate dtmAccreditedTo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntUserType() {
		return intUserType;
	}

	public void setIntUserType(Integer intUserType) {
		this.intUserType = intUserType;
	}

	public String getVchOrganisationName() {
		return vchOrganisationName;
	}

	public void setVchOrganisationName(String vchOrganisationName) {
		this.vchOrganisationName = vchOrganisationName;
	}

	public String getVchContactPerson() {
		return vchContactPerson;
	}

	public void setVchContactPerson(String vchContactPerson) {
		this.vchContactPerson = vchContactPerson;
	}

	public String getVchPhoto() {
		return vchPhoto;
	}

	public void setVchPhoto(String vchPhoto) {
		this.vchPhoto = vchPhoto;
	}

	public Integer getIntCountryId() {
		return intCountryId;
	}

	public void setIntCountryId(Integer intCountryId) {
		this.intCountryId = intCountryId;
	}

	public Integer getIntStateId() {
		return intStateId;
	}

	public void setIntStateId(Integer intStateId) {
		this.intStateId = intStateId;
	}

	public String getVchCity() {
		return vchCity;
	}

	public void setVchCity(String vchCity) {
		this.vchCity = vchCity;
	}

	public String getVchOrganisationAddress() {
		return vchOrganisationAddress;
	}

	public void setVchOrganisationAddress(String vchOrganisationAddress) {
		this.vchOrganisationAddress = vchOrganisationAddress;
	}

	public String getVchTelephoneNo() {
		return vchTelephoneNo;
	}

	public void setVchTelephoneNo(String vchTelephoneNo) {
		this.vchTelephoneNo = vchTelephoneNo;
	}

	public String getVchFaxNo() {
		return vchFaxNo;
	}

	public void setVchFaxNo(String vchFaxNo) {
		this.vchFaxNo = vchFaxNo;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchMobileNo() {
		return vchMobileNo;
	}

	public void setVchMobileNo(String vchMobileNo) {
		this.vchMobileNo = vchMobileNo;
	}

	public String getVchWebsite() {
		return vchWebsite;
	}

	public void setVchWebsite(String vchWebsite) {
		this.vchWebsite = vchWebsite;
	}

	public String getVchCoordinates() {
		return vchCoordinates;
	}

	public void setVchCoordinates(String vchCoordinates) {
		this.vchCoordinates = vchCoordinates;
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

	public Instant getDtmLastLogin() {
		return dtmLastLogin;
	}

	public void setDtmLastLogin(Instant dtmLastLogin) {
		this.dtmLastLogin = dtmLastLogin;
	}

	public Boolean getBitPassForgetStatus() {
		return bitPassForgetStatus;
	}

	public void setBitPassForgetStatus(Boolean bitPassForgetStatus) {
		this.bitPassForgetStatus = bitPassForgetStatus;
	}

	public Boolean getIntActiveStatus() {
		return intActiveStatus;
	}

	public void setIntActiveStatus(Boolean intActiveStatus) {
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

	public Integer getIntMailVerification() {
		return intMailVerification;
	}

	public void setIntMailVerification(Integer intMailVerification) {
		this.intMailVerification = intMailVerification;
	}

	public String getVchDesignation() {
		return vchDesignation;
	}

	public void setVchDesignation(String vchDesignation) {
		this.vchDesignation = vchDesignation;
	}

	public Integer getIntAgentDashboardHintStatus() {
		return intAgentDashboardHintStatus;
	}

	public void setIntAgentDashboardHintStatus(Integer intAgentDashboardHintStatus) {
		this.intAgentDashboardHintStatus = intAgentDashboardHintStatus;
	}

	public Integer getIntAgentCreateHintStatus() {
		return intAgentCreateHintStatus;
	}

	public void setIntAgentCreateHintStatus(Integer intAgentCreateHintStatus) {
		this.intAgentCreateHintStatus = intAgentCreateHintStatus;
	}

	public Integer getIntFirmtype() {
		return intFirmtype;
	}

	public void setIntFirmtype(Integer intFirmtype) {
		this.intFirmtype = intFirmtype;
	}

	public Integer getYrYearFounded() {
		return yrYearFounded;
	}

	public void setYrYearFounded(Integer yrYearFounded) {
		this.yrYearFounded = yrYearFounded;
	}

	public Integer getYrYearRegistered() {
		return yrYearRegistered;
	}

	public void setYrYearRegistered(Integer yrYearRegistered) {
		this.yrYearRegistered = yrYearRegistered;
	}

	public String getVchCompanyCertificate() {
		return vchCompanyCertificate;
	}

	public void setVchCompanyCertificate(String vchCompanyCertificate) {
		this.vchCompanyCertificate = vchCompanyCertificate;
	}

	public Integer getIntDistrictId() {
		return intDistrictId;
	}

	public void setIntDistrictId(Integer intDistrictId) {
		this.intDistrictId = intDistrictId;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public Integer getIntApprovalStatus() {
		return intApprovalStatus;
	}

	public void setIntApprovalStatus(Integer intApprovalStatus) {
		this.intApprovalStatus = intApprovalStatus;
	}

	public String getVchApplicationNo() {
		return vchApplicationNo;
	}

	public void setVchApplicationNo(String vchApplicationNo) {
		this.vchApplicationNo = vchApplicationNo;
	}

	public Boolean getIntIsEmailSent() {
		return intIsEmailSent;
	}

	public void setIntIsEmailSent(Boolean intIsEmailSent) {
		this.intIsEmailSent = intIsEmailSent;
	}

	public Integer getIntPendingWith() {
		return intPendingWith;
	}

	public void setIntPendingWith(Integer intPendingWith) {
		this.intPendingWith = intPendingWith;
	}

	public Integer getIntNextATA() {
		return intNextATA;
	}

	public void setIntNextATA(Integer intNextATA) {
		this.intNextATA = intNextATA;
	}

	public Integer getIntActionTakenBy() {
		return intActionTakenBy;
	}

	public void setIntActionTakenBy(Integer intActionTakenBy) {
		this.intActionTakenBy = intActionTakenBy;
	}

	public Integer getIntRedommended() {
		return intRedommended;
	}

	public void setIntRedommended(Integer intRedommended) {
		this.intRedommended = intRedommended;
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

	public Integer getIntTotalFeildsCount() {
		return intTotalFeildsCount;
	}

	public void setIntTotalFeildsCount(Integer intTotalFeildsCount) {
		this.intTotalFeildsCount = intTotalFeildsCount;
	}

	public String getVchTypeOfCeritficate() {
		return vchTypeOfCeritficate;
	}

	public void setVchTypeOfCeritficate(String vchTypeOfCeritficate) {
		this.vchTypeOfCeritficate = vchTypeOfCeritficate;
	}

	public String getVchOtherCertificateName() {
		return vchOtherCertificateName;
	}

	public void setVchOtherCertificateName(String vchOtherCertificateName) {
		this.vchOtherCertificateName = vchOtherCertificateName;
	}

	public BigDecimal getVchApproximateArea() {
		return vchApproximateArea;
	}

	public void setVchApproximateArea(BigDecimal vchApproximateArea) {
		this.vchApproximateArea = vchApproximateArea;
	}

	public String getVchRegisteredAddress() {
		return vchRegisteredAddress;
	}

	public void setVchRegisteredAddress(String vchRegisteredAddress) {
		this.vchRegisteredAddress = vchRegisteredAddress;
	}

	public String getVchTypeOfDocumentsDirector() {
		return vchTypeOfDocumentsDirector;
	}

	public void setVchTypeOfDocumentsDirector(String vchTypeOfDocumentsDirector) {
		this.vchTypeOfDocumentsDirector = vchTypeOfDocumentsDirector;
	}

	public String getVchOtherDocumentDirector() {
		return vchOtherDocumentDirector;
	}

	public void setVchOtherDocumentDirector(String vchOtherDocumentDirector) {
		this.vchOtherDocumentDirector = vchOtherDocumentDirector;
	}

	public String getVchDocumentDirector() {
		return vchDocumentDirector;
	}

	public void setVchDocumentDirector(String vchDocumentDirector) {
		this.vchDocumentDirector = vchDocumentDirector;
	}

	public Integer getVchNoEmployee() {
		return vchNoEmployee;
	}

	public void setVchNoEmployee(Integer vchNoEmployee) {
		this.vchNoEmployee = vchNoEmployee;
	}

	public String getVchHotelierDemo() {
		return vchHotelierDemo;
	}

	public void setVchHotelierDemo(String vchHotelierDemo) {
		this.vchHotelierDemo = vchHotelierDemo;
	}

	public String getVchLastLoginIP() {
		return vchLastLoginIP;
	}

	public void setVchLastLoginIP(String vchLastLoginIP) {
		this.vchLastLoginIP = vchLastLoginIP;
	}

	public Integer getVchOfficePhoneType() {
		return vchOfficePhoneType;
	}

	public void setVchOfficePhoneType(Integer vchOfficePhoneType) {
		this.vchOfficePhoneType = vchOfficePhoneType;
	}

	public LocalDate getDtmAccreditedFrom() {
		return dtmAccreditedFrom;
	}

	public void setDtmAccreditedFrom(LocalDate dtmAccreditedFrom) {
		this.dtmAccreditedFrom = dtmAccreditedFrom;
	}

	public LocalDate getDtmAccreditedTo() {
		return dtmAccreditedTo;
	}

	public void setDtmAccreditedTo(LocalDate dtmAccreditedTo) {
		this.dtmAccreditedTo = dtmAccreditedTo;
	}

}