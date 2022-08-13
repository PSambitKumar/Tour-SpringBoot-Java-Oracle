package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_notify_travel_agent")
public class TNotifyTravelAgent {
	@Id
	@Column(name = "intNotifyAgentId", nullable = false)
	private Integer id;

	@Column(name = "intAgentNotificationId")
	private Integer intAgentNotificationId;

	@Column(name = "intAgentId")
	private Integer intAgentId;

	@Column(name = "intReadStatus")
	private Integer intReadStatus;

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

	public Integer getIntAgentNotificationId() {
		return intAgentNotificationId;
	}

	public void setIntAgentNotificationId(Integer intAgentNotificationId) {
		this.intAgentNotificationId = intAgentNotificationId;
	}

	public Integer getIntAgentId() {
		return intAgentId;
	}

	public void setIntAgentId(Integer intAgentId) {
		this.intAgentId = intAgentId;
	}

	public Integer getIntReadStatus() {
		return intReadStatus;
	}

	public void setIntReadStatus(Integer intReadStatus) {
		this.intReadStatus = intReadStatus;
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