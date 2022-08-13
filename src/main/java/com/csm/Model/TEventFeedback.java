package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_event_feedback")
public class TEventFeedback {
	@Id
	@Column(name = "intEventFeedbackId", nullable = false)
	private Integer id;

	@Column(name = "vchName", nullable = false, length = 200)
	private String vchName;

	@Column(name = "vchEmailId", length = 150)
	private String vchEmailId;

	@Column(name = "vchPhoneNo", length = 15)
	private String vchPhoneNo;

	@Lob
	@Column(name = "vchAddress", nullable = false)
	private String vchAddress;

	@Lob
	@Column(name = "vchEventName", nullable = false)
	private String vchEventName;

	@Column(name = "intRateExpeirence")
	private Integer intRateExpeirence;

	@Column(name = "vchComments", length = 300)
	private String vchComments;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
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

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchPhoneNo() {
		return vchPhoneNo;
	}

	public void setVchPhoneNo(String vchPhoneNo) {
		this.vchPhoneNo = vchPhoneNo;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchEventName() {
		return vchEventName;
	}

	public void setVchEventName(String vchEventName) {
		this.vchEventName = vchEventName;
	}

	public Integer getIntRateExpeirence() {
		return intRateExpeirence;
	}

	public void setIntRateExpeirence(Integer intRateExpeirence) {
		this.intRateExpeirence = intRateExpeirence;
	}

	public String getVchComments() {
		return vchComments;
	}

	public void setVchComments(String vchComments) {
		this.vchComments = vchComments;
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