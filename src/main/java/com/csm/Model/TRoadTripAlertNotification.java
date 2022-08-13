package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_alert_notification")
public class TRoadTripAlertNotification {
	@Id
	@Column(name = "intNotificationId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intDestinationId")
	private Integer intDestinationId;

	@Column(name = "vchLatitude", length = 150)
	private String vchLatitude;

	@Column(name = "vchLongitude", length = 150)
	private String vchLongitude;

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

	@Lob
	@Column(name = "vchAlertNotification")
	private String vchAlertNotification;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public Integer getIntDestinationId() {
		return intDestinationId;
	}

	public void setIntDestinationId(Integer intDestinationId) {
		this.intDestinationId = intDestinationId;
	}

	public String getVchLatitude() {
		return vchLatitude;
	}

	public void setVchLatitude(String vchLatitude) {
		this.vchLatitude = vchLatitude;
	}

	public String getVchLongitude() {
		return vchLongitude;
	}

	public void setVchLongitude(String vchLongitude) {
		this.vchLongitude = vchLongitude;
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

	public String getVchAlertNotification() {
		return vchAlertNotification;
	}

	public void setVchAlertNotification(String vchAlertNotification) {
		this.vchAlertNotification = vchAlertNotification;
	}

}