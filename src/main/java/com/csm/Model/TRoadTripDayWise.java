package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_day_wise")
public class TRoadTripDayWise {
	@Id
	@Column(name = "intTripDaysId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intDays")
	private Integer intDays;

	@Column(name = "vchTitle", length = 250)
	private String vchTitle;

	@Column(name = "vchApproxHours", length = 10)
	private String vchApproxHours;

	@Column(name = "vchHighwayInfo", length = 100)
	private String vchHighwayInfo;

	@Column(name = "intRoadConditionId")
	private Integer intRoadConditionId;

	@Column(name = "vchRoadConditionDescription", length = 45)
	private String vchRoadConditionDescription;

	@Column(name = "vchStartTime", length = 25)
	private String vchStartTime;

	@Column(name = "vchMaxKmCover", length = 25)
	private String vchMaxKmCover;

	@Lob
	@Column(name = "vchShortDesc")
	private String vchShortDesc;

	@Lob
	@Column(name = "vchItineraryImage")
	private String vchItineraryImage;

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

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public Integer getIntDays() {
		return intDays;
	}

	public void setIntDays(Integer intDays) {
		this.intDays = intDays;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchApproxHours() {
		return vchApproxHours;
	}

	public void setVchApproxHours(String vchApproxHours) {
		this.vchApproxHours = vchApproxHours;
	}

	public String getVchHighwayInfo() {
		return vchHighwayInfo;
	}

	public void setVchHighwayInfo(String vchHighwayInfo) {
		this.vchHighwayInfo = vchHighwayInfo;
	}

	public Integer getIntRoadConditionId() {
		return intRoadConditionId;
	}

	public void setIntRoadConditionId(Integer intRoadConditionId) {
		this.intRoadConditionId = intRoadConditionId;
	}

	public String getVchRoadConditionDescription() {
		return vchRoadConditionDescription;
	}

	public void setVchRoadConditionDescription(String vchRoadConditionDescription) {
		this.vchRoadConditionDescription = vchRoadConditionDescription;
	}

	public String getVchStartTime() {
		return vchStartTime;
	}

	public void setVchStartTime(String vchStartTime) {
		this.vchStartTime = vchStartTime;
	}

	public String getVchMaxKmCover() {
		return vchMaxKmCover;
	}

	public void setVchMaxKmCover(String vchMaxKmCover) {
		this.vchMaxKmCover = vchMaxKmCover;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
	}

	public String getVchItineraryImage() {
		return vchItineraryImage;
	}

	public void setVchItineraryImage(String vchItineraryImage) {
		this.vchItineraryImage = vchItineraryImage;
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