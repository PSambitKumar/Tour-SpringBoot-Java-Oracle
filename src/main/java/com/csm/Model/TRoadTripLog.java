package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_log")
public class TRoadTripLog {
	@Id
	@Column(name = "intTripLogId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intTravelAgentId")
	private Integer intTravelAgentId;

	@Column(name = "vchTripName", length = 256)
	private String vchTripName;

	@Column(name = "vchAlias", length = 256)
	private String vchAlias;

	@Lob
	@Column(name = "vchShortDescription")
	private String vchShortDescription;

	@Column(name = "vchThumbImage", length = 256)
	private String vchThumbImage;

	@Column(name = "vchOffer", length = 5)
	private String vchOffer;

	@Lob
	@Column(name = "vchTagActivities")
	private String vchTagActivities;

	@Column(name = "intTourType")
	private Integer intTourType;

	@Column(name = "intNoOfDays")
	private Integer intNoOfDays;

	@Column(name = "intNoOfNights")
	private Integer intNoOfNights;

	@Column(name = "intTripStatus")
	private Integer intTripStatus;

	@Column(name = "vchRemarks", length = 256)
	private String vchRemarks;

	@Column(name = "intViewCount")
	private Integer intViewCount;

	@Column(name = "intLikeCount")
	private Integer intLikeCount;

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

	@Column(name = "intPublishStatus")
	private Integer intPublishStatus;

	@Lob
	@Column(name = "vchProTips")
	private String vchProTips;

	@Column(name = "vchTripImage", length = 256)
	private String vchTripImage;

	@Column(name = "intStartPoint")
	private Integer intStartPoint;

	@Column(name = "intEndPoint")
	private Integer intEndPoint;

	@Column(name = "vchHighWayCover", length = 256)
	private String vchHighWayCover;

	@Column(name = "intRoadTripFormStatus")
	private Integer intRoadTripFormStatus;

	@Column(name = "vchTerrain", length = 200)
	private String vchTerrain;

	@Column(name = "vchWhoIsItFor", length = 100)
	private String vchWhoIsItFor;

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

	public Integer getIntTravelAgentId() {
		return intTravelAgentId;
	}

	public void setIntTravelAgentId(Integer intTravelAgentId) {
		this.intTravelAgentId = intTravelAgentId;
	}

	public String getVchTripName() {
		return vchTripName;
	}

	public void setVchTripName(String vchTripName) {
		this.vchTripName = vchTripName;
	}

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

	public String getVchShortDescription() {
		return vchShortDescription;
	}

	public void setVchShortDescription(String vchShortDescription) {
		this.vchShortDescription = vchShortDescription;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchOffer() {
		return vchOffer;
	}

	public void setVchOffer(String vchOffer) {
		this.vchOffer = vchOffer;
	}

	public String getVchTagActivities() {
		return vchTagActivities;
	}

	public void setVchTagActivities(String vchTagActivities) {
		this.vchTagActivities = vchTagActivities;
	}

	public Integer getIntTourType() {
		return intTourType;
	}

	public void setIntTourType(Integer intTourType) {
		this.intTourType = intTourType;
	}

	public Integer getIntNoOfDays() {
		return intNoOfDays;
	}

	public void setIntNoOfDays(Integer intNoOfDays) {
		this.intNoOfDays = intNoOfDays;
	}

	public Integer getIntNoOfNights() {
		return intNoOfNights;
	}

	public void setIntNoOfNights(Integer intNoOfNights) {
		this.intNoOfNights = intNoOfNights;
	}

	public Integer getIntTripStatus() {
		return intTripStatus;
	}

	public void setIntTripStatus(Integer intTripStatus) {
		this.intTripStatus = intTripStatus;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

	public Integer getIntViewCount() {
		return intViewCount;
	}

	public void setIntViewCount(Integer intViewCount) {
		this.intViewCount = intViewCount;
	}

	public Integer getIntLikeCount() {
		return intLikeCount;
	}

	public void setIntLikeCount(Integer intLikeCount) {
		this.intLikeCount = intLikeCount;
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

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public String getVchProTips() {
		return vchProTips;
	}

	public void setVchProTips(String vchProTips) {
		this.vchProTips = vchProTips;
	}

	public String getVchTripImage() {
		return vchTripImage;
	}

	public void setVchTripImage(String vchTripImage) {
		this.vchTripImage = vchTripImage;
	}

	public Integer getIntStartPoint() {
		return intStartPoint;
	}

	public void setIntStartPoint(Integer intStartPoint) {
		this.intStartPoint = intStartPoint;
	}

	public Integer getIntEndPoint() {
		return intEndPoint;
	}

	public void setIntEndPoint(Integer intEndPoint) {
		this.intEndPoint = intEndPoint;
	}

	public String getVchHighWayCover() {
		return vchHighWayCover;
	}

	public void setVchHighWayCover(String vchHighWayCover) {
		this.vchHighWayCover = vchHighWayCover;
	}

	public Integer getIntRoadTripFormStatus() {
		return intRoadTripFormStatus;
	}

	public void setIntRoadTripFormStatus(Integer intRoadTripFormStatus) {
		this.intRoadTripFormStatus = intRoadTripFormStatus;
	}

	public String getVchTerrain() {
		return vchTerrain;
	}

	public void setVchTerrain(String vchTerrain) {
		this.vchTerrain = vchTerrain;
	}

	public String getVchWhoIsItFor() {
		return vchWhoIsItFor;
	}

	public void setVchWhoIsItFor(String vchWhoIsItFor) {
		this.vchWhoIsItFor = vchWhoIsItFor;
	}

}