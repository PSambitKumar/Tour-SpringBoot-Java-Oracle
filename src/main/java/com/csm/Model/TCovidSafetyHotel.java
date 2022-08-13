package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_hotels")
public class TCovidSafetyHotel {
	@Id
	@Column(name = "intHotelId", nullable = false)
	private Integer id;

	@Lob
	@Column(name = "vchHotelName")
	private String vchHotelName;

	@Lob
	@Column(name = "vchHotelDescription")
	private String vchHotelDescription;

	@Column(name = "vchCovidZoneType")
	private Character vchCovidZoneType;

	@Lob
	@Column(name = "vchThumbFilePathOne")
	private String vchThumbFilePathOne;

	@Lob
	@Column(name = "vchThumbFilePathTwo")
	private String vchThumbFilePathTwo;

	@Lob
	@Column(name = "vchThumbFilePathThree")
	private String vchThumbFilePathThree;

	@Lob
	@Column(name = "vchThumbFilePathFour")
	private String vchThumbFilePathFour;

	@Lob
	@Column(name = "vchHotelUrl")
	private String vchHotelUrl;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intPublishStatus")
	private Integer intPublishStatus;

	@Lob
	@Column(name = "vchThumbImage")
	private String vchThumbImage;

	@Lob
	@Column(name = "vchAlias")
	private String vchAlias;

	@Lob
	@Column(name = "vchLargeFilePathOne")
	private String vchLargeFilePathOne;

	@Lob
	@Column(name = "vchLargeFilePathTwo")
	private String vchLargeFilePathTwo;

	@Lob
	@Column(name = "vchLargeFilePathThree")
	private String vchLargeFilePathThree;

	@Lob
	@Column(name = "vchLargeFilePathFour")
	private String vchLargeFilePathFour;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchHotelName() {
		return vchHotelName;
	}

	public void setVchHotelName(String vchHotelName) {
		this.vchHotelName = vchHotelName;
	}

	public String getVchHotelDescription() {
		return vchHotelDescription;
	}

	public void setVchHotelDescription(String vchHotelDescription) {
		this.vchHotelDescription = vchHotelDescription;
	}

	public Character getVchCovidZoneType() {
		return vchCovidZoneType;
	}

	public void setVchCovidZoneType(Character vchCovidZoneType) {
		this.vchCovidZoneType = vchCovidZoneType;
	}

	public String getVchThumbFilePathOne() {
		return vchThumbFilePathOne;
	}

	public void setVchThumbFilePathOne(String vchThumbFilePathOne) {
		this.vchThumbFilePathOne = vchThumbFilePathOne;
	}

	public String getVchThumbFilePathTwo() {
		return vchThumbFilePathTwo;
	}

	public void setVchThumbFilePathTwo(String vchThumbFilePathTwo) {
		this.vchThumbFilePathTwo = vchThumbFilePathTwo;
	}

	public String getVchThumbFilePathThree() {
		return vchThumbFilePathThree;
	}

	public void setVchThumbFilePathThree(String vchThumbFilePathThree) {
		this.vchThumbFilePathThree = vchThumbFilePathThree;
	}

	public String getVchThumbFilePathFour() {
		return vchThumbFilePathFour;
	}

	public void setVchThumbFilePathFour(String vchThumbFilePathFour) {
		this.vchThumbFilePathFour = vchThumbFilePathFour;
	}

	public String getVchHotelUrl() {
		return vchHotelUrl;
	}

	public void setVchHotelUrl(String vchHotelUrl) {
		this.vchHotelUrl = vchHotelUrl;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
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

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

	public String getVchLargeFilePathOne() {
		return vchLargeFilePathOne;
	}

	public void setVchLargeFilePathOne(String vchLargeFilePathOne) {
		this.vchLargeFilePathOne = vchLargeFilePathOne;
	}

	public String getVchLargeFilePathTwo() {
		return vchLargeFilePathTwo;
	}

	public void setVchLargeFilePathTwo(String vchLargeFilePathTwo) {
		this.vchLargeFilePathTwo = vchLargeFilePathTwo;
	}

	public String getVchLargeFilePathThree() {
		return vchLargeFilePathThree;
	}

	public void setVchLargeFilePathThree(String vchLargeFilePathThree) {
		this.vchLargeFilePathThree = vchLargeFilePathThree;
	}

	public String getVchLargeFilePathFour() {
		return vchLargeFilePathFour;
	}

	public void setVchLargeFilePathFour(String vchLargeFilePathFour) {
		this.vchLargeFilePathFour = vchLargeFilePathFour;
	}

}