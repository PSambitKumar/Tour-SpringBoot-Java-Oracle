package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_user_notification")
public class TUserNotification {
	@Id
	@Column(name = "INT_NOT_ID", nullable = false)
	private Integer id;

	@Column(name = "INT_BDAY_ID")
	private Integer intBdayId;

	@Column(name = "INT_REGD_ID")
	private Integer intRegdId;

	@Column(name = "VCH_MESSAGE", length = 512)
	private String vchMessage;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "INT_CREATED_BY_PORTAL")
	private Integer intCreatedByPortal;

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

	public Integer getIntBdayId() {
		return intBdayId;
	}

	public void setIntBdayId(Integer intBdayId) {
		this.intBdayId = intBdayId;
	}

	public Integer getIntRegdId() {
		return intRegdId;
	}

	public void setIntRegdId(Integer intRegdId) {
		this.intRegdId = intRegdId;
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

	public Integer getIntCreatedByPortal() {
		return intCreatedByPortal;
	}

	public void setIntCreatedByPortal(Integer intCreatedByPortal) {
		this.intCreatedByPortal = intCreatedByPortal;
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