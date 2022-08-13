package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_feedback_reply")
public class TFeedbackReply {
	@Id
	@Column(name = "INT_REPLY_ID", nullable = false)
	private Integer id;

	@Column(name = "INT_FEEDBACK_ID")
	private Integer intFeedbackId;

	@Column(name = "VCH_SUBJECT", length = 128)
	private String vchSubject;

	@Lob
	@Column(name = "VCH_MESSAGE")
	private String vchMessage;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntFeedbackId() {
		return intFeedbackId;
	}

	public void setIntFeedbackId(Integer intFeedbackId) {
		this.intFeedbackId = intFeedbackId;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}