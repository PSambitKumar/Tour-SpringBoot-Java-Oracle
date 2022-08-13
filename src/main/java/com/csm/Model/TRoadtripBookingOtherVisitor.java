package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_roadtrip_booking_other_visitors")
public class TRoadtripBookingOtherVisitor {
	@Id
	@Column(name = "intOtherVisitorId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "vchVisitorName", length = 128)
	private String vchVisitorName;

	@Column(name = "intGender")
	private Integer intGender;

	@Column(name = "intNationalityId")
	private Integer intNationalityId;

	@Column(name = "intStateId")
	private Integer intStateId;

	@Column(name = "vchPhone", length = 15)
	private String vchPhone;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

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

	public String getVchVisitorName() {
		return vchVisitorName;
	}

	public void setVchVisitorName(String vchVisitorName) {
		this.vchVisitorName = vchVisitorName;
	}

	public Integer getIntGender() {
		return intGender;
	}

	public void setIntGender(Integer intGender) {
		this.intGender = intGender;
	}

	public Integer getIntNationalityId() {
		return intNationalityId;
	}

	public void setIntNationalityId(Integer intNationalityId) {
		this.intNationalityId = intNationalityId;
	}

	public Integer getIntStateId() {
		return intStateId;
	}

	public void setIntStateId(Integer intStateId) {
		this.intStateId = intStateId;
	}

	public String getVchPhone() {
		return vchPhone;
	}

	public void setVchPhone(String vchPhone) {
		this.vchPhone = vchPhone;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
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

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

}