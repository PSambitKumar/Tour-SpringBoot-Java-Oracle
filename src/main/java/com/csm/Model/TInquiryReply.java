package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_inquiry_reply")
public class TInquiryReply {
	@Id
	@Column(name = "intReplyId", nullable = false)
	private Integer id;

	@Column(name = "intInquiryId")
	private Integer intInquiryId;

	@Column(name = "intReplyById")
	private Integer intReplyById;

	@Column(name = "intReplyByType")
	private Integer intReplyByType;

	@Column(name = "intReplyToId")
	private Integer intReplyToId;

	@Column(name = "intReplyToType")
	private Integer intReplyToType;

	@Column(name = "vchSubject", length = 200)
	private String vchSubject;

	@Column(name = "vchMessage", length = 556)
	private String vchMessage;

	@Column(name = "dtmCrreatedOn")
	private Instant dtmCrreatedOn;

	@Column(name = "readStatus")
	private Byte readStatus;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntInquiryId() {
		return intInquiryId;
	}

	public void setIntInquiryId(Integer intInquiryId) {
		this.intInquiryId = intInquiryId;
	}

	public Integer getIntReplyById() {
		return intReplyById;
	}

	public void setIntReplyById(Integer intReplyById) {
		this.intReplyById = intReplyById;
	}

	public Integer getIntReplyByType() {
		return intReplyByType;
	}

	public void setIntReplyByType(Integer intReplyByType) {
		this.intReplyByType = intReplyByType;
	}

	public Integer getIntReplyToId() {
		return intReplyToId;
	}

	public void setIntReplyToId(Integer intReplyToId) {
		this.intReplyToId = intReplyToId;
	}

	public Integer getIntReplyToType() {
		return intReplyToType;
	}

	public void setIntReplyToType(Integer intReplyToType) {
		this.intReplyToType = intReplyToType;
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

	public Instant getDtmCrreatedOn() {
		return dtmCrreatedOn;
	}

	public void setDtmCrreatedOn(Instant dtmCrreatedOn) {
		this.dtmCrreatedOn = dtmCrreatedOn;
	}

	public Byte getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(Byte readStatus) {
		this.readStatus = readStatus;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}