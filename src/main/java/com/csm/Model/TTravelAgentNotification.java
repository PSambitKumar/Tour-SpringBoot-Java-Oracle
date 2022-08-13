package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_travel_agent_notification")
public class TTravelAgentNotification {
	@Id
	@Column(name = "intAgentNotificationId", nullable = false)
	private Integer id;

	@Column(name = "vchNotificationNo", length = 64)
	private String vchNotificationNo;

	@Column(name = "vchNotificationHeading", length = 128)
	private String vchNotificationHeading;

	@Column(name = "vchNotificationDetails", length = 512)
	private String vchNotificationDetails;

	@Column(name = "vchNotificationDocument", length = 264)
	private String vchNotificationDocument;

	@Column(name = "intPublishStatus")
	private Integer intPublishStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchNotificationNo() {
		return vchNotificationNo;
	}

	public void setVchNotificationNo(String vchNotificationNo) {
		this.vchNotificationNo = vchNotificationNo;
	}

	public String getVchNotificationHeading() {
		return vchNotificationHeading;
	}

	public void setVchNotificationHeading(String vchNotificationHeading) {
		this.vchNotificationHeading = vchNotificationHeading;
	}

	public String getVchNotificationDetails() {
		return vchNotificationDetails;
	}

	public void setVchNotificationDetails(String vchNotificationDetails) {
		this.vchNotificationDetails = vchNotificationDetails;
	}

	public String getVchNotificationDocument() {
		return vchNotificationDocument;
	}

	public void setVchNotificationDocument(String vchNotificationDocument) {
		this.vchNotificationDocument = vchNotificationDocument;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
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

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}