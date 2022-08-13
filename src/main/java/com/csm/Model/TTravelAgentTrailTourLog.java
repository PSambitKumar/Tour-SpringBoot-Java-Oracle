package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_travel_agent_trail_tour_log")
public class TTravelAgentTrailTourLog {
	@Id
	@Column(name = "intTrailTourLogId", nullable = false)
	private Integer id;

	@Column(name = "intTrailTourId")
	private Integer intTrailTourId;

	@Column(name = "intTravelAgentId")
	private Integer intTravelAgentId;

	@Column(name = "vchTrailName", length = 128)
	private String vchTrailName;

	@Column(name = "vchAlias", length = 256)
	private String vchAlias;

	@Column(name = "vchShortDescription", length = 256)
	private String vchShortDescription;

	@Column(name = "vchBannerImage", length = 256)
	private String vchBannerImage;

	@Column(name = "vchThumbImage", length = 256)
	private String vchThumbImage;

	@Column(name = "vchOffer", length = 5)
	private String vchOffer;

	@Column(name = "vchTagActivities", length = 256)
	private String vchTagActivities;

	@Column(name = "intTourType")
	private Integer intTourType;

	@Column(name = "intNoOfDays")
	private Integer intNoOfDays;

	@Column(name = "intNoOfNights")
	private Integer intNoOfNights;

	@Lob
	@Column(name = "vchInslusion")
	private String vchInslusion;

	@Lob
	@Column(name = "vchExclusion")
	private String vchExclusion;

	@Column(name = "intDraftStatus")
	private Integer intDraftStatus;

	@Column(name = "intPendingWith")
	private Integer intPendingWith;

	@Column(name = "intNextATA")
	private Integer intNextATA;

	@Column(name = "intActionTakenBy")
	private Integer intActionTakenBy;

	@Column(name = "intTrailStatus")
	private Integer intTrailStatus;

	@Column(name = "vchRemarks", length = 256)
	private String vchRemarks;

	@Column(name = "intViewCount")
	private Integer intViewCount;

	@Column(name = "intLikeCount")
	private Integer intLikeCount;

	@Column(name = "intCommentCount")
	private Integer intCommentCount;

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

	@Column(name = "intApprovelLevel")
	private Integer intApprovelLevel;

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

	public Integer getIntTravelAgentId() {
		return intTravelAgentId;
	}

	public void setIntTravelAgentId(Integer intTravelAgentId) {
		this.intTravelAgentId = intTravelAgentId;
	}

	public String getVchTrailName() {
		return vchTrailName;
	}

	public void setVchTrailName(String vchTrailName) {
		this.vchTrailName = vchTrailName;
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

	public String getVchBannerImage() {
		return vchBannerImage;
	}

	public void setVchBannerImage(String vchBannerImage) {
		this.vchBannerImage = vchBannerImage;
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

	public String getVchInslusion() {
		return vchInslusion;
	}

	public void setVchInslusion(String vchInslusion) {
		this.vchInslusion = vchInslusion;
	}

	public String getVchExclusion() {
		return vchExclusion;
	}

	public void setVchExclusion(String vchExclusion) {
		this.vchExclusion = vchExclusion;
	}

	public Integer getIntDraftStatus() {
		return intDraftStatus;
	}

	public void setIntDraftStatus(Integer intDraftStatus) {
		this.intDraftStatus = intDraftStatus;
	}

	public Integer getIntPendingWith() {
		return intPendingWith;
	}

	public void setIntPendingWith(Integer intPendingWith) {
		this.intPendingWith = intPendingWith;
	}

	public Integer getIntNextATA() {
		return intNextATA;
	}

	public void setIntNextATA(Integer intNextATA) {
		this.intNextATA = intNextATA;
	}

	public Integer getIntActionTakenBy() {
		return intActionTakenBy;
	}

	public void setIntActionTakenBy(Integer intActionTakenBy) {
		this.intActionTakenBy = intActionTakenBy;
	}

	public Integer getIntTrailStatus() {
		return intTrailStatus;
	}

	public void setIntTrailStatus(Integer intTrailStatus) {
		this.intTrailStatus = intTrailStatus;
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

	public Integer getIntCommentCount() {
		return intCommentCount;
	}

	public void setIntCommentCount(Integer intCommentCount) {
		this.intCommentCount = intCommentCount;
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

	public Integer getIntApprovelLevel() {
		return intApprovelLevel;
	}

	public void setIntApprovelLevel(Integer intApprovelLevel) {
		this.intApprovelLevel = intApprovelLevel;
	}

}