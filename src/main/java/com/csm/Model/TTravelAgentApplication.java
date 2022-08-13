package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_travel_agent_application")
public class TTravelAgentApplication {
	@Id
	@Column(name = "intAgentAppId", nullable = false)
	private Integer id;

	@Column(name = "intAgentId", nullable = false)
	private Integer intAgentId;

	@Column(name = "vchAppNo", length = 45)
	private String vchAppNo;

	@Column(name = "intFirmtype")
	private Integer intFirmtype;

	@Column(name = "yrYearFounded")
	private Integer yrYearFounded;

	@Column(name = "yrYearRegistered")
	private Integer yrYearRegistered;

	@Column(name = "vchCompanyCertificate", length = 100)
	private String vchCompanyCertificate;

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

	@Column(name = "intApprovalStatus")
	private Integer intApprovalStatus;

	@Column(name = "intTotalFeildsCount")
	private Integer intTotalFeildsCount;

	@Column(name = "intPendingWith")
	private Integer intPendingWith;

	@Column(name = "intNextATA")
	private Integer intNextATA;

	@Column(name = "intRedommended")
	private Integer intRedommended;

	@Column(name = "intActionTakenBy")
	private Integer intActionTakenBy;

	@Column(name = "dtmActionTakenOn")
	private Instant dtmActionTakenOn;

	@Column(name = "vchRemarks", length = 512)
	private String vchRemarks;

	@Column(name = "dtmAccreditedFrom")
	private LocalDate dtmAccreditedFrom;

	@Column(name = "dtmAccreditedTo")
	private LocalDate dtmAccreditedTo;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgentId() {
		return intAgentId;
	}

	public void setIntAgentId(Integer intAgentId) {
		this.intAgentId = intAgentId;
	}

	public String getVchAppNo() {
		return vchAppNo;
	}

	public void setVchAppNo(String vchAppNo) {
		this.vchAppNo = vchAppNo;
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

	public Integer getIntApprovalStatus() {
		return intApprovalStatus;
	}

	public void setIntApprovalStatus(Integer intApprovalStatus) {
		this.intApprovalStatus = intApprovalStatus;
	}

	public Integer getIntTotalFeildsCount() {
		return intTotalFeildsCount;
	}

	public void setIntTotalFeildsCount(Integer intTotalFeildsCount) {
		this.intTotalFeildsCount = intTotalFeildsCount;
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

	public Integer getIntRedommended() {
		return intRedommended;
	}

	public void setIntRedommended(Integer intRedommended) {
		this.intRedommended = intRedommended;
	}

	public Integer getIntActionTakenBy() {
		return intActionTakenBy;
	}

	public void setIntActionTakenBy(Integer intActionTakenBy) {
		this.intActionTakenBy = intActionTakenBy;
	}

	public Instant getDtmActionTakenOn() {
		return dtmActionTakenOn;
	}

	public void setDtmActionTakenOn(Instant dtmActionTakenOn) {
		this.dtmActionTakenOn = dtmActionTakenOn;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
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

}