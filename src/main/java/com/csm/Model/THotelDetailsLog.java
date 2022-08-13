package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "t_hotel_details_log")
public class THotelDetailsLog {
	@Id
	@Column(name = "intAgentHotelLogId", nullable = false)
	private Integer id;

	@Column(name = "intAgentHotelId", nullable = false)
	private Integer intAgentHotelId;

	@Column(name = "intAgentId", nullable = false)
	private Integer intAgentId;

	@Column(name = "vchLandMark", length = 256)
	private String vchLandMark;

	@Column(name = "vchCheckInTime")
	private LocalTime vchCheckInTime;

	@Column(name = "vchCheckOutTime")
	private LocalTime vchCheckOutTime;

	@Column(name = "vchStarRating")
	private Integer vchStarRating;

	@Column(name = "vchThumbImage", length = 256)
	private String vchThumbImage;

	@Column(name = "vchFromAirport", length = 256)
	private String vchFromAirport;

	@Column(name = "vchFromRailway", length = 256)
	private String vchFromRailway;

	@Column(name = "vchFromBusstop", length = 256)
	private String vchFromBusstop;

	@Column(name = "pendingAt")
	private Integer pendingAt;

	@Column(name = "nextATA")
	private Integer nextATA;

	@Column(name = "intHotelStatus")
	private Integer intHotelStatus;

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

	@Column(name = "intDistrictId")
	private Integer intDistrictId;

	@Column(name = "intCityId")
	private Integer intCityId;

	@Column(name = "vchLocation", length = 45)
	private String vchLocation;

	@Column(name = "intHotelType")
	private Integer intHotelType;

	@Column(name = "vchHotelName", length = 45)
	private String vchHotelName;

	@Column(name = "vchContactPerson", length = 45)
	private String vchContactPerson;

	@Lob
	@Column(name = "vchAddress")
	private String vchAddress;

	@Column(name = "vchTelephoneNo", length = 28)
	private String vchTelephoneNo;

	@Column(name = "vchFaxNo", length = 28)
	private String vchFaxNo;

	@Column(name = "vchCoordinates", length = 64)
	private String vchCoordinates;

	@Column(name = "vchMobileNo", length = 16)
	private String vchMobileNo;

	@Column(name = "vchEmailId", length = 128)
	private String vchEmailId;

	@Column(name = "vchWebsite", length = 128)
	private String vchWebsite;

	@Lob
	@Column(name = "vchDetails")
	private String vchDetails;

	@Column(name = "pendingAtBy")
	private Integer pendingAtBy;

	@Column(name = "nextATABy")
	private Integer nextATABy;

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

	public Integer getIntAgentId() {
		return intAgentId;
	}

	public void setIntAgentId(Integer intAgentId) {
		this.intAgentId = intAgentId;
	}

	public String getVchLandMark() {
		return vchLandMark;
	}

	public void setVchLandMark(String vchLandMark) {
		this.vchLandMark = vchLandMark;
	}

	public LocalTime getVchCheckInTime() {
		return vchCheckInTime;
	}

	public void setVchCheckInTime(LocalTime vchCheckInTime) {
		this.vchCheckInTime = vchCheckInTime;
	}

	public LocalTime getVchCheckOutTime() {
		return vchCheckOutTime;
	}

	public void setVchCheckOutTime(LocalTime vchCheckOutTime) {
		this.vchCheckOutTime = vchCheckOutTime;
	}

	public Integer getVchStarRating() {
		return vchStarRating;
	}

	public void setVchStarRating(Integer vchStarRating) {
		this.vchStarRating = vchStarRating;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchFromAirport() {
		return vchFromAirport;
	}

	public void setVchFromAirport(String vchFromAirport) {
		this.vchFromAirport = vchFromAirport;
	}

	public String getVchFromRailway() {
		return vchFromRailway;
	}

	public void setVchFromRailway(String vchFromRailway) {
		this.vchFromRailway = vchFromRailway;
	}

	public String getVchFromBusstop() {
		return vchFromBusstop;
	}

	public void setVchFromBusstop(String vchFromBusstop) {
		this.vchFromBusstop = vchFromBusstop;
	}

	public Integer getPendingAt() {
		return pendingAt;
	}

	public void setPendingAt(Integer pendingAt) {
		this.pendingAt = pendingAt;
	}

	public Integer getNextATA() {
		return nextATA;
	}

	public void setNextATA(Integer nextATA) {
		this.nextATA = nextATA;
	}

	public Integer getIntHotelStatus() {
		return intHotelStatus;
	}

	public void setIntHotelStatus(Integer intHotelStatus) {
		this.intHotelStatus = intHotelStatus;
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

	public Integer getIntDistrictId() {
		return intDistrictId;
	}

	public void setIntDistrictId(Integer intDistrictId) {
		this.intDistrictId = intDistrictId;
	}

	public Integer getIntCityId() {
		return intCityId;
	}

	public void setIntCityId(Integer intCityId) {
		this.intCityId = intCityId;
	}

	public String getVchLocation() {
		return vchLocation;
	}

	public void setVchLocation(String vchLocation) {
		this.vchLocation = vchLocation;
	}

	public Integer getIntHotelType() {
		return intHotelType;
	}

	public void setIntHotelType(Integer intHotelType) {
		this.intHotelType = intHotelType;
	}

	public String getVchHotelName() {
		return vchHotelName;
	}

	public void setVchHotelName(String vchHotelName) {
		this.vchHotelName = vchHotelName;
	}

	public String getVchContactPerson() {
		return vchContactPerson;
	}

	public void setVchContactPerson(String vchContactPerson) {
		this.vchContactPerson = vchContactPerson;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchTelephoneNo() {
		return vchTelephoneNo;
	}

	public void setVchTelephoneNo(String vchTelephoneNo) {
		this.vchTelephoneNo = vchTelephoneNo;
	}

	public String getVchFaxNo() {
		return vchFaxNo;
	}

	public void setVchFaxNo(String vchFaxNo) {
		this.vchFaxNo = vchFaxNo;
	}

	public String getVchCoordinates() {
		return vchCoordinates;
	}

	public void setVchCoordinates(String vchCoordinates) {
		this.vchCoordinates = vchCoordinates;
	}

	public String getVchMobileNo() {
		return vchMobileNo;
	}

	public void setVchMobileNo(String vchMobileNo) {
		this.vchMobileNo = vchMobileNo;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchWebsite() {
		return vchWebsite;
	}

	public void setVchWebsite(String vchWebsite) {
		this.vchWebsite = vchWebsite;
	}

	public String getVchDetails() {
		return vchDetails;
	}

	public void setVchDetails(String vchDetails) {
		this.vchDetails = vchDetails;
	}

	public Integer getPendingAtBy() {
		return pendingAtBy;
	}

	public void setPendingAtBy(Integer pendingAtBy) {
		this.pendingAtBy = pendingAtBy;
	}

	public Integer getNextATABy() {
		return nextATABy;
	}

	public void setNextATABy(Integer nextATABy) {
		this.nextATABy = nextATABy;
	}

}