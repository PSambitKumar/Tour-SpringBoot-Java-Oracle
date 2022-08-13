package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_booking_summary_accommodation")
public class TBookingSummaryAccommodation {
	@Id
	@Column(name = "intAccommodationId", nullable = false)
	private Integer id;

	@Column(name = "intBookingRefId", nullable = false)
	private Integer intBookingRefId;

	@Column(name = "intRoomTypeId")
	private Integer intRoomTypeId;

	@Column(name = "vchRoomTypeName", length = 45)
	private String vchRoomTypeName;

	@Column(name = "intNoOfRooms")
	private Integer intNoOfRooms;

	@Column(name = "vchRoomBasePrice", length = 45)
	private String vchRoomBasePrice;

	@Column(name = "vchTaxAmount", length = 45)
	private String vchTaxAmount;

	@Column(name = "vchTaxPercentage", length = 45)
	private String vchTaxPercentage;

	@Column(name = "vchTotalPrice", length = 45)
	private String vchTotalPrice;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmDateCreated")
	private Instant dtmDateCreated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntBookingRefId() {
		return intBookingRefId;
	}

	public void setIntBookingRefId(Integer intBookingRefId) {
		this.intBookingRefId = intBookingRefId;
	}

	public Integer getIntRoomTypeId() {
		return intRoomTypeId;
	}

	public void setIntRoomTypeId(Integer intRoomTypeId) {
		this.intRoomTypeId = intRoomTypeId;
	}

	public String getVchRoomTypeName() {
		return vchRoomTypeName;
	}

	public void setVchRoomTypeName(String vchRoomTypeName) {
		this.vchRoomTypeName = vchRoomTypeName;
	}

	public Integer getIntNoOfRooms() {
		return intNoOfRooms;
	}

	public void setIntNoOfRooms(Integer intNoOfRooms) {
		this.intNoOfRooms = intNoOfRooms;
	}

	public String getVchRoomBasePrice() {
		return vchRoomBasePrice;
	}

	public void setVchRoomBasePrice(String vchRoomBasePrice) {
		this.vchRoomBasePrice = vchRoomBasePrice;
	}

	public String getVchTaxAmount() {
		return vchTaxAmount;
	}

	public void setVchTaxAmount(String vchTaxAmount) {
		this.vchTaxAmount = vchTaxAmount;
	}

	public String getVchTaxPercentage() {
		return vchTaxPercentage;
	}

	public void setVchTaxPercentage(String vchTaxPercentage) {
		this.vchTaxPercentage = vchTaxPercentage;
	}

	public String getVchTotalPrice() {
		return vchTotalPrice;
	}

	public void setVchTotalPrice(String vchTotalPrice) {
		this.vchTotalPrice = vchTotalPrice;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmDateCreated() {
		return dtmDateCreated;
	}

	public void setDtmDateCreated(Instant dtmDateCreated) {
		this.dtmDateCreated = dtmDateCreated;
	}

}