package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_restaurants")
public class TRestaurant {
	@Id
	@Column(name = "intRestaurantsId", nullable = false)
	private Integer id;

	@Column(name = "intAgentHotelId")
	private Integer intAgentHotelId;

	@Column(name = "vchRestaurantsName", length = 128)
	private String vchRestaurantsName;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchImage", length = 150)
	private String vchImage;

	@Column(name = "intTimingType")
	private Integer intTimingType;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intResturantType")
	private Integer intResturantType;

	@Column(name = "vchOtherResturantType", length = 100)
	private String vchOtherResturantType;

	@Column(name = "intPendingWith")
	private Integer intPendingWith;

	@Column(name = "intNextATA")
	private Integer intNextATA;

	@Column(name = "intActionTakenBy")
	private Integer intActionTakenBy;

	@Column(name = "intResturantStatus")
	private Integer intResturantStatus;

	@Column(name = "intPublishtStatus")
	private Integer intPublishtStatus;

	@Column(name = "intApprovalLevel")
	private Integer intApprovalLevel;

	@Column(name = "vchRemarks", length = 250)
	private String vchRemarks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgentHotelId() {
		return intAgentHotelId;
	}

	public void setIntAgentHotelId(Integer intAgentHotelId) {
		this.intAgentHotelId = intAgentHotelId;
	}

	public String getVchRestaurantsName() {
		return vchRestaurantsName;
	}

	public void setVchRestaurantsName(String vchRestaurantsName) {
		this.vchRestaurantsName = vchRestaurantsName;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public Integer getIntTimingType() {
		return intTimingType;
	}

	public void setIntTimingType(Integer intTimingType) {
		this.intTimingType = intTimingType;
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

	public Integer getIntResturantType() {
		return intResturantType;
	}

	public void setIntResturantType(Integer intResturantType) {
		this.intResturantType = intResturantType;
	}

	public String getVchOtherResturantType() {
		return vchOtherResturantType;
	}

	public void setVchOtherResturantType(String vchOtherResturantType) {
		this.vchOtherResturantType = vchOtherResturantType;
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

	public Integer getIntResturantStatus() {
		return intResturantStatus;
	}

	public void setIntResturantStatus(Integer intResturantStatus) {
		this.intResturantStatus = intResturantStatus;
	}

	public Integer getIntPublishtStatus() {
		return intPublishtStatus;
	}

	public void setIntPublishtStatus(Integer intPublishtStatus) {
		this.intPublishtStatus = intPublishtStatus;
	}

	public Integer getIntApprovalLevel() {
		return intApprovalLevel;
	}

	public void setIntApprovalLevel(Integer intApprovalLevel) {
		this.intApprovalLevel = intApprovalLevel;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

}