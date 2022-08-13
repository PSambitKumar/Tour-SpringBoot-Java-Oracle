package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_travel_agent_trail_day_wise")
public class TTravelAgentTrailDayWise {
	@Id
	@Column(name = "intTrailDaysId", nullable = false)
	private Integer id;

	@Column(name = "intTrailTourId")
	private Integer intTrailTourId;

	@Column(name = "intDays")
	private Integer intDays;

	@Column(name = "vchFromTime", length = 56)
	private String vchFromTime;

	@Column(name = "vchToTime", length = 56)
	private String vchToTime;

	@Column(name = "intDestinationId")
	private Integer intDestinationId;

	@Column(name = "intDestinationType")
	private Integer intDestinationType;

	@Column(name = "vchDetails", length = 700)
	private String vchDetails;

	@Column(name = "vchImage", length = 256)
	private String vchImage;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTrailTourId() {
		return intTrailTourId;
	}

	public void setIntTrailTourId(Integer intTrailTourId) {
		this.intTrailTourId = intTrailTourId;
	}

	public Integer getIntDays() {
		return intDays;
	}

	public void setIntDays(Integer intDays) {
		this.intDays = intDays;
	}

	public String getVchFromTime() {
		return vchFromTime;
	}

	public void setVchFromTime(String vchFromTime) {
		this.vchFromTime = vchFromTime;
	}

	public String getVchToTime() {
		return vchToTime;
	}

	public void setVchToTime(String vchToTime) {
		this.vchToTime = vchToTime;
	}

	public Integer getIntDestinationId() {
		return intDestinationId;
	}

	public void setIntDestinationId(Integer intDestinationId) {
		this.intDestinationId = intDestinationId;
	}

	public Integer getIntDestinationType() {
		return intDestinationType;
	}

	public void setIntDestinationType(Integer intDestinationType) {
		this.intDestinationType = intDestinationType;
	}

	public String getVchDetails() {
		return vchDetails;
	}

	public void setVchDetails(String vchDetails) {
		this.vchDetails = vchDetails;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
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