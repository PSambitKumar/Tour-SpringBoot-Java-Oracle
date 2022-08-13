package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_payment")
public class TBirdFestivalPayment {
	@Id
	@Column(name = "intPaymentId", nullable = false)
	private Integer id;

	@Column(name = "intAppId")
	private Integer intAppId;

	@Column(name = "vchOrderId", length = 45)
	private String vchOrderId;

	@Column(name = "intPaymentAmount")
	private Integer intPaymentAmount;

	@Column(name = "vchTrackingId", length = 64)
	private String vchTrackingId;

	@Column(name = "vchTransactionId", length = 64)
	private String vchTransactionId;

	@Column(name = "vchOrderStatus", length = 64)
	private String vchOrderStatus;

	@Column(name = "dtmPaymentDate", length = 128)
	private String dtmPaymentDate;

	@Column(name = "vchResponseCode", length = 56)
	private String vchResponseCode;

	@Column(name = "vchResponseDescription", length = 500)
	private String vchResponseDescription;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "vchFailureMessage", length = 264)
	private String vchFailureMessage;

	@Column(name = "vchPaymentMode", length = 64)
	private String vchPaymentMode;

	@Column(name = "vchStatusCode", length = 164)
	private String vchStatusCode;

	@Column(name = "vchStatusMessage", length = 264)
	private String vchStatusMessage;

	@Column(name = "vchCurrency", length = 45)
	private String vchCurrency;

	@Column(name = "vchCardName", length = 45)
	private String vchCardName;

	@Column(name = "intReturnStatus")
	private Integer intReturnStatus;

	@Column(name = "intPaymentType")
	private Integer intPaymentType;

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

	public String getVchOrderId() {
		return vchOrderId;
	}

	public void setVchOrderId(String vchOrderId) {
		this.vchOrderId = vchOrderId;
	}

	public Integer getIntPaymentAmount() {
		return intPaymentAmount;
	}

	public void setIntPaymentAmount(Integer intPaymentAmount) {
		this.intPaymentAmount = intPaymentAmount;
	}

	public String getVchTrackingId() {
		return vchTrackingId;
	}

	public void setVchTrackingId(String vchTrackingId) {
		this.vchTrackingId = vchTrackingId;
	}

	public String getVchTransactionId() {
		return vchTransactionId;
	}

	public void setVchTransactionId(String vchTransactionId) {
		this.vchTransactionId = vchTransactionId;
	}

	public String getVchOrderStatus() {
		return vchOrderStatus;
	}

	public void setVchOrderStatus(String vchOrderStatus) {
		this.vchOrderStatus = vchOrderStatus;
	}

	public String getDtmPaymentDate() {
		return dtmPaymentDate;
	}

	public void setDtmPaymentDate(String dtmPaymentDate) {
		this.dtmPaymentDate = dtmPaymentDate;
	}

	public String getVchResponseCode() {
		return vchResponseCode;
	}

	public void setVchResponseCode(String vchResponseCode) {
		this.vchResponseCode = vchResponseCode;
	}

	public String getVchResponseDescription() {
		return vchResponseDescription;
	}

	public void setVchResponseDescription(String vchResponseDescription) {
		this.vchResponseDescription = vchResponseDescription;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
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

	public String getVchFailureMessage() {
		return vchFailureMessage;
	}

	public void setVchFailureMessage(String vchFailureMessage) {
		this.vchFailureMessage = vchFailureMessage;
	}

	public String getVchPaymentMode() {
		return vchPaymentMode;
	}

	public void setVchPaymentMode(String vchPaymentMode) {
		this.vchPaymentMode = vchPaymentMode;
	}

	public String getVchStatusCode() {
		return vchStatusCode;
	}

	public void setVchStatusCode(String vchStatusCode) {
		this.vchStatusCode = vchStatusCode;
	}

	public String getVchStatusMessage() {
		return vchStatusMessage;
	}

	public void setVchStatusMessage(String vchStatusMessage) {
		this.vchStatusMessage = vchStatusMessage;
	}

	public String getVchCurrency() {
		return vchCurrency;
	}

	public void setVchCurrency(String vchCurrency) {
		this.vchCurrency = vchCurrency;
	}

	public String getVchCardName() {
		return vchCardName;
	}

	public void setVchCardName(String vchCardName) {
		this.vchCardName = vchCardName;
	}

	public Integer getIntReturnStatus() {
		return intReturnStatus;
	}

	public void setIntReturnStatus(Integer intReturnStatus) {
		this.intReturnStatus = intReturnStatus;
	}

	public Integer getIntPaymentType() {
		return intPaymentType;
	}

	public void setIntPaymentType(Integer intPaymentType) {
		this.intPaymentType = intPaymentType;
	}

}