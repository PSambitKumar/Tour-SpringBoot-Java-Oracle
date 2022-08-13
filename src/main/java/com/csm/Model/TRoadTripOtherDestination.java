package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_other_destination")
public class TRoadTripOtherDestination {
	@Id
	@Column(name = "intOtherDestId", nullable = false)
	private Integer id;

	@Column(name = "vchDestName", length = 128)
	private String vchDestName;

	@Column(name = "vchOTShortDescription", length = 256)
	private String vchOTShortDescription;

	@Column(name = "vchOTThumbImage", length = 256)
	private String vchOTThumbImage;

	@Column(name = "intDestrictId")
	private Integer intDestrictId;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "vchLatitudeLongitude", length = 256)
	private String vchLatitudeLongitude;

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

	public String getVchDestName() {
		return vchDestName;
	}

	public void setVchDestName(String vchDestName) {
		this.vchDestName = vchDestName;
	}

	public String getVchOTShortDescription() {
		return vchOTShortDescription;
	}

	public void setVchOTShortDescription(String vchOTShortDescription) {
		this.vchOTShortDescription = vchOTShortDescription;
	}

	public String getVchOTThumbImage() {
		return vchOTThumbImage;
	}

	public void setVchOTThumbImage(String vchOTThumbImage) {
		this.vchOTThumbImage = vchOTThumbImage;
	}

	public Integer getIntDestrictId() {
		return intDestrictId;
	}

	public void setIntDestrictId(Integer intDestrictId) {
		this.intDestrictId = intDestrictId;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public String getVchLatitudeLongitude() {
		return vchLatitudeLongitude;
	}

	public void setVchLatitudeLongitude(String vchLatitudeLongitude) {
		this.vchLatitudeLongitude = vchLatitudeLongitude;
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