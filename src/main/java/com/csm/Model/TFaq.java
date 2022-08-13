package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_faq")
public class TFaq {
	@Id
	@Column(name = "intFaqId", nullable = false)
	private Integer id;

	@Column(name = "vchQuestionE", length = 256)
	private String vchQuestionE;

	@Column(name = "vchQuestionH", length = 320)
	private String vchQuestionH;

	@Lob
	@Column(name = "vchAnswerE")
	private String vchAnswerE;

	@Lob
	@Column(name = "vchAnswerH")
	private String vchAnswerH;

	@Column(name = "stmCreatedOn")
	private Instant stmCreatedOn;

	@Column(name = "intShowHome")
	private Short intShowHome;

	@Column(name = "tinArcStatus")
	private Byte tinArcStatus;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmArchieveOn")
	private Instant dtmArchieveOn;

	@Column(name = "tinPublishStatus")
	private Byte tinPublishStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchQuestionE() {
		return vchQuestionE;
	}

	public void setVchQuestionE(String vchQuestionE) {
		this.vchQuestionE = vchQuestionE;
	}

	public String getVchQuestionH() {
		return vchQuestionH;
	}

	public void setVchQuestionH(String vchQuestionH) {
		this.vchQuestionH = vchQuestionH;
	}

	public String getVchAnswerE() {
		return vchAnswerE;
	}

	public void setVchAnswerE(String vchAnswerE) {
		this.vchAnswerE = vchAnswerE;
	}

	public String getVchAnswerH() {
		return vchAnswerH;
	}

	public void setVchAnswerH(String vchAnswerH) {
		this.vchAnswerH = vchAnswerH;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
	}

	public Short getIntShowHome() {
		return intShowHome;
	}

	public void setIntShowHome(Short intShowHome) {
		this.intShowHome = intShowHome;
	}

	public Byte getTinArcStatus() {
		return tinArcStatus;
	}

	public void setTinArcStatus(Byte tinArcStatus) {
		this.tinArcStatus = tinArcStatus;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmArchieveOn() {
		return dtmArchieveOn;
	}

	public void setDtmArchieveOn(Instant dtmArchieveOn) {
		this.dtmArchieveOn = dtmArchieveOn;
	}

	public Byte getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Byte tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

}