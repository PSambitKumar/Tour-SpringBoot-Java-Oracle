package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_web_img_report")
public class TWebImgReport {
	@Id
	@Column(name = "intReportId", nullable = false)
	private Integer id;

	@Column(name = "intGLId")
	private Integer intGLId;

	@Column(name = "intPLId")
	private Integer intPLId;

	@Column(name = "intSLId")
	private Integer intSLId;

	@Column(name = "intSubPageId")
	private Integer intSubPageId;

	@Column(name = "intImageType")
	private Integer intImageType;

	@Column(name = "vchImageURL")
	private String vchImageURL;

	@Column(name = "vchReportStatus", length = 200)
	private String vchReportStatus;

	@Column(name = "vchReportMessage", length = 100)
	private String vchReportMessage;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedflag")
	private Boolean bitDeletedflag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntGLId() {
		return intGLId;
	}

	public void setIntGLId(Integer intGLId) {
		this.intGLId = intGLId;
	}

	public Integer getIntPLId() {
		return intPLId;
	}

	public void setIntPLId(Integer intPLId) {
		this.intPLId = intPLId;
	}

	public Integer getIntSLId() {
		return intSLId;
	}

	public void setIntSLId(Integer intSLId) {
		this.intSLId = intSLId;
	}

	public Integer getIntSubPageId() {
		return intSubPageId;
	}

	public void setIntSubPageId(Integer intSubPageId) {
		this.intSubPageId = intSubPageId;
	}

	public Integer getIntImageType() {
		return intImageType;
	}

	public void setIntImageType(Integer intImageType) {
		this.intImageType = intImageType;
	}

	public String getVchImageURL() {
		return vchImageURL;
	}

	public void setVchImageURL(String vchImageURL) {
		this.vchImageURL = vchImageURL;
	}

	public String getVchReportStatus() {
		return vchReportStatus;
	}

	public void setVchReportStatus(String vchReportStatus) {
		this.vchReportStatus = vchReportStatus;
	}

	public String getVchReportMessage() {
		return vchReportMessage;
	}

	public void setVchReportMessage(String vchReportMessage) {
		this.vchReportMessage = vchReportMessage;
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

	public Boolean getBitDeletedflag() {
		return bitDeletedflag;
	}

	public void setBitDeletedflag(Boolean bitDeletedflag) {
		this.bitDeletedflag = bitDeletedflag;
	}

}