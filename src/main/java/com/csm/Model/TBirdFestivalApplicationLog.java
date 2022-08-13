package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_application_log")
public class TBirdFestivalApplicationLog {
	@Id
	@Column(name = "intAppLogId", nullable = false)
	private Integer id;

	@Column(name = "intAppId", nullable = false)
	private Integer intAppId;

	@Column(name = "intAppovalSatatus")
	private Integer intAppovalSatatus;

	@Column(name = "intApprovedBy")
	private Integer intApprovedBy;

	@Column(name = "vchRemarks", length = 125)
	private String vchRemarks;

	@Column(name = "intPaymentStatus")
	private Integer intPaymentStatus;

	@Column(name = "intPaymentId")
	private Integer intPaymentId;

	@Column(name = "intPaymentStatusOtherPackage")
	private Integer intPaymentStatusOtherPackage;

	@Column(name = "intPaymentIdOptionalTour")
	private Integer intPaymentIdOptionalTour;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAppId() {
		return intAppId;
	}

	public void setIntAppId(Integer intAppId) {
		this.intAppId = intAppId;
	}

	public Integer getIntAppovalSatatus() {
		return intAppovalSatatus;
	}

	public void setIntAppovalSatatus(Integer intAppovalSatatus) {
		this.intAppovalSatatus = intAppovalSatatus;
	}

	public Integer getIntApprovedBy() {
		return intApprovedBy;
	}

	public void setIntApprovedBy(Integer intApprovedBy) {
		this.intApprovedBy = intApprovedBy;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

	public Integer getIntPaymentStatus() {
		return intPaymentStatus;
	}

	public void setIntPaymentStatus(Integer intPaymentStatus) {
		this.intPaymentStatus = intPaymentStatus;
	}

	public Integer getIntPaymentId() {
		return intPaymentId;
	}

	public void setIntPaymentId(Integer intPaymentId) {
		this.intPaymentId = intPaymentId;
	}

	public Integer getIntPaymentStatusOtherPackage() {
		return intPaymentStatusOtherPackage;
	}

	public void setIntPaymentStatusOtherPackage(Integer intPaymentStatusOtherPackage) {
		this.intPaymentStatusOtherPackage = intPaymentStatusOtherPackage;
	}

	public Integer getIntPaymentIdOptionalTour() {
		return intPaymentIdOptionalTour;
	}

	public void setIntPaymentIdOptionalTour(Integer intPaymentIdOptionalTour) {
		this.intPaymentIdOptionalTour = intPaymentIdOptionalTour;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}