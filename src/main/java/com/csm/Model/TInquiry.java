package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_inquiry")
public class TInquiry {
	@Id
	@Column(name = "intInquiryId", nullable = false)
	private Integer id;

	@Column(name = "intInquiryById")
	private Integer intInquiryById;

	@Column(name = "intInquiryByType")
	private Integer intInquiryByType;

	@Column(name = "intInquiryForId")
	private Integer intInquiryForId;

	@Column(name = "intInquiryForType")
	private Integer intInquiryForType;

	@Column(name = "intInquiryTour")
	private Integer intInquiryTour;

	@Column(name = "vchMessage", length = 200)
	private String vchMessage;

	@Column(name = "intReadStatus")
	private Integer intReadStatus;

	@Column(name = "dtmCrreatedOn")
	private Instant dtmCrreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intBookingStatus")
	private Integer intBookingStatus;

	@Column(name = "intNoOfVisitor")
	private Integer intNoOfVisitor;

	@Column(name = "vchAmount", precision = 10, scale = 2)
	private BigDecimal vchAmount;

	@Column(name = "vchDateofTrail")
	private LocalDate vchDateofTrail;

	@Column(name = "vchBookingUpdateOn")
	private Instant vchBookingUpdateOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntInquiryById() {
		return intInquiryById;
	}

	public void setIntInquiryById(Integer intInquiryById) {
		this.intInquiryById = intInquiryById;
	}

	public Integer getIntInquiryByType() {
		return intInquiryByType;
	}

	public void setIntInquiryByType(Integer intInquiryByType) {
		this.intInquiryByType = intInquiryByType;
	}

	public Integer getIntInquiryForId() {
		return intInquiryForId;
	}

	public void setIntInquiryForId(Integer intInquiryForId) {
		this.intInquiryForId = intInquiryForId;
	}

	public Integer getIntInquiryForType() {
		return intInquiryForType;
	}

	public void setIntInquiryForType(Integer intInquiryForType) {
		this.intInquiryForType = intInquiryForType;
	}

	public Integer getIntInquiryTour() {
		return intInquiryTour;
	}

	public void setIntInquiryTour(Integer intInquiryTour) {
		this.intInquiryTour = intInquiryTour;
	}

	public String getVchMessage() {
		return vchMessage;
	}

	public void setVchMessage(String vchMessage) {
		this.vchMessage = vchMessage;
	}

	public Integer getIntReadStatus() {
		return intReadStatus;
	}

	public void setIntReadStatus(Integer intReadStatus) {
		this.intReadStatus = intReadStatus;
	}

	public Instant getDtmCrreatedOn() {
		return dtmCrreatedOn;
	}

	public void setDtmCrreatedOn(Instant dtmCrreatedOn) {
		this.dtmCrreatedOn = dtmCrreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntBookingStatus() {
		return intBookingStatus;
	}

	public void setIntBookingStatus(Integer intBookingStatus) {
		this.intBookingStatus = intBookingStatus;
	}

	public Integer getIntNoOfVisitor() {
		return intNoOfVisitor;
	}

	public void setIntNoOfVisitor(Integer intNoOfVisitor) {
		this.intNoOfVisitor = intNoOfVisitor;
	}

	public BigDecimal getVchAmount() {
		return vchAmount;
	}

	public void setVchAmount(BigDecimal vchAmount) {
		this.vchAmount = vchAmount;
	}

	public LocalDate getVchDateofTrail() {
		return vchDateofTrail;
	}

	public void setVchDateofTrail(LocalDate vchDateofTrail) {
		this.vchDateofTrail = vchDateofTrail;
	}

	public Instant getVchBookingUpdateOn() {
		return vchBookingUpdateOn;
	}

	public void setVchBookingUpdateOn(Instant vchBookingUpdateOn) {
		this.vchBookingUpdateOn = vchBookingUpdateOn;
	}

}