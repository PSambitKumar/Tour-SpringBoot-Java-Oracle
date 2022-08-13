package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_feedback")
public class TFeedback {
	@Id
	@Column(name = "INT_FEEDBACK_ID", nullable = false)
	private Integer id;

	@Column(name = "VCH_NAME", length = 64)
	private String vchName;

	@Column(name = "VCH_EMAIL", length = 64)
	private String vchEmail;

	@Column(name = "VCH_PHONE", length = 16)
	private String vchPhone;

	@Column(name = "VCH_SUBJECT", length = 128)
	private String vchSubject;

	@Lob
	@Column(name = "VCH_MESSAGE")
	private String vchMessage;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY")
	private Integer intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

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

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchPhone() {
		return vchPhone;
	}

	public void setVchPhone(String vchPhone) {
		this.vchPhone = vchPhone;
	}

	public String getVchSubject() {
		return vchSubject;
	}

	public void setVchSubject(String vchSubject) {
		this.vchSubject = vchSubject;
	}

	public String getVchMessage() {
		return vchMessage;
	}

	public void setVchMessage(String vchMessage) {
		this.vchMessage = vchMessage;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}