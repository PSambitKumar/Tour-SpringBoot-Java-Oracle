package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_roadtrip_booking_visitors")
public class TRoadtripBookingVisitor {
	@Id
	@Column(name = "intVisitorid", nullable = false)
	private Integer id;

	@Column(name = "intRegUserId")
	private Integer intRegUserId;

	@Column(name = "vchVisitorName", length = 125)
	private String vchVisitorName;

	@Column(name = "vchVisitorEmail", length = 125)
	private String vchVisitorEmail;

	@Column(name = "vchVisitorPhone", length = 12)
	private String vchVisitorPhone;

	@Column(name = "vchVisitorAltPhone", length = 12)
	private String vchVisitorAltPhone;

	@Column(name = "intGender")
	private Integer intGender;

	@Column(name = "vchVisitorIdType", length = 15)
	private String vchVisitorIdType;

	@Column(name = "vchVisitorIdNumber", length = 52)
	private String vchVisitorIdNumber;

	@Column(name = "intVisitorNationalityId")
	private Integer intVisitorNationalityId;

	@Column(name = "intVisitorStateId")
	private Integer intVisitorStateId;

	@Column(name = "transaction_date")
	private Instant transactionDate;

	@Column(name = "tracking_id", length = 24)
	private String trackingId;

	@Column(name = "bank_ref_no", length = 24)
	private String bankRefNo;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

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

	public Integer getIntRegUserId() {
		return intRegUserId;
	}

	public void setIntRegUserId(Integer intRegUserId) {
		this.intRegUserId = intRegUserId;
	}

	public String getVchVisitorName() {
		return vchVisitorName;
	}

	public void setVchVisitorName(String vchVisitorName) {
		this.vchVisitorName = vchVisitorName;
	}

	public String getVchVisitorEmail() {
		return vchVisitorEmail;
	}

	public void setVchVisitorEmail(String vchVisitorEmail) {
		this.vchVisitorEmail = vchVisitorEmail;
	}

	public String getVchVisitorPhone() {
		return vchVisitorPhone;
	}

	public void setVchVisitorPhone(String vchVisitorPhone) {
		this.vchVisitorPhone = vchVisitorPhone;
	}

	public String getVchVisitorAltPhone() {
		return vchVisitorAltPhone;
	}

	public void setVchVisitorAltPhone(String vchVisitorAltPhone) {
		this.vchVisitorAltPhone = vchVisitorAltPhone;
	}

	public Integer getIntGender() {
		return intGender;
	}

	public void setIntGender(Integer intGender) {
		this.intGender = intGender;
	}

	public String getVchVisitorIdType() {
		return vchVisitorIdType;
	}

	public void setVchVisitorIdType(String vchVisitorIdType) {
		this.vchVisitorIdType = vchVisitorIdType;
	}

	public String getVchVisitorIdNumber() {
		return vchVisitorIdNumber;
	}

	public void setVchVisitorIdNumber(String vchVisitorIdNumber) {
		this.vchVisitorIdNumber = vchVisitorIdNumber;
	}

	public Integer getIntVisitorNationalityId() {
		return intVisitorNationalityId;
	}

	public void setIntVisitorNationalityId(Integer intVisitorNationalityId) {
		this.intVisitorNationalityId = intVisitorNationalityId;
	}

	public Integer getIntVisitorStateId() {
		return intVisitorStateId;
	}

	public void setIntVisitorStateId(Integer intVisitorStateId) {
		this.intVisitorStateId = intVisitorStateId;
	}

	public Instant getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Instant transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getBankRefNo() {
		return bankRefNo;
	}

	public void setBankRefNo(String bankRefNo) {
		this.bankRefNo = bankRefNo;
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