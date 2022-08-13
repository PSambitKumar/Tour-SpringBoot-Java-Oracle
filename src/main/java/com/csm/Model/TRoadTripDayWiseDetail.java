package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_day_wise_detail")
public class TRoadTripDayWiseDetail {
	@Id
	@Column(name = "intPitStopId", nullable = false)
	private Integer id;

	@Column(name = "intTripDaysId")
	private Integer intTripDaysId;

	@Column(name = "vchName", length = 250)
	private String vchName;

	@Column(name = "vchTagActivities", length = 100)
	private String vchTagActivities;

	@Lob
	@Column(name = "vchShortDesc")
	private String vchShortDesc;

	@Column(name = "vchDestinationId", length = 10)
	private String vchDestinationId;

	@Column(name = "vchStopageInterval", length = 25)
	private String vchStopageInterval;

	@Column(name = "vchStopageKm", length = 25)
	private String vchStopageKm;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

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

	public Integer getIntTripDaysId() {
		return intTripDaysId;
	}

	public void setIntTripDaysId(Integer intTripDaysId) {
		this.intTripDaysId = intTripDaysId;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchTagActivities() {
		return vchTagActivities;
	}

	public void setVchTagActivities(String vchTagActivities) {
		this.vchTagActivities = vchTagActivities;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
	}

	public String getVchDestinationId() {
		return vchDestinationId;
	}

	public void setVchDestinationId(String vchDestinationId) {
		this.vchDestinationId = vchDestinationId;
	}

	public String getVchStopageInterval() {
		return vchStopageInterval;
	}

	public void setVchStopageInterval(String vchStopageInterval) {
		this.vchStopageInterval = vchStopageInterval;
	}

	public String getVchStopageKm() {
		return vchStopageKm;
	}

	public void setVchStopageKm(String vchStopageKm) {
		this.vchStopageKm = vchStopageKm;
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