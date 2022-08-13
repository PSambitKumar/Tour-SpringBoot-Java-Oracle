package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_booking_summary")
public class TBookingSummary {
	@Id
	@Column(name = "intBookingId", nullable = false)
	private Integer id;

	@Column(name = "intUserId")
	private Integer intUserId;

	@Column(name = "intBookingType")
	private Integer intBookingType;

	@Column(name = "dtmBookingDate")
	private Instant dtmBookingDate;

	@Column(name = "dtmFromDate", length = 45)
	private String dtmFromDate;

	@Column(name = "dtmToDate", length = 45)
	private String dtmToDate;

	@Column(name = "intNoOfAdult")
	private Integer intNoOfAdult;

	@Column(name = "intNoOfChild")
	private Integer intNoOfChild;

	@Column(name = "vchNationality", length = 45)
	private String vchNationality;

	@Column(name = "vchBookingItemId", length = 45)
	private String vchBookingItemId;

	@Column(name = "vchTotalBookingAmount", length = 45)
	private String vchTotalBookingAmount;

	@Column(name = "intNoOfDays")
	private Integer intNoOfDays;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchName", length = 125)
	private String vchName;

	@Column(name = "vchEmail", length = 125)
	private String vchEmail;

	@Column(name = "vchMobile", length = 25)
	private String vchMobile;

	@Column(name = "vchAddress", length = 500)
	private String vchAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public Integer getIntBookingType() {
		return intBookingType;
	}

	public void setIntBookingType(Integer intBookingType) {
		this.intBookingType = intBookingType;
	}

	public Instant getDtmBookingDate() {
		return dtmBookingDate;
	}

	public void setDtmBookingDate(Instant dtmBookingDate) {
		this.dtmBookingDate = dtmBookingDate;
	}

	public String getDtmFromDate() {
		return dtmFromDate;
	}

	public void setDtmFromDate(String dtmFromDate) {
		this.dtmFromDate = dtmFromDate;
	}

	public String getDtmToDate() {
		return dtmToDate;
	}

	public void setDtmToDate(String dtmToDate) {
		this.dtmToDate = dtmToDate;
	}

	public Integer getIntNoOfAdult() {
		return intNoOfAdult;
	}

	public void setIntNoOfAdult(Integer intNoOfAdult) {
		this.intNoOfAdult = intNoOfAdult;
	}

	public Integer getIntNoOfChild() {
		return intNoOfChild;
	}

	public void setIntNoOfChild(Integer intNoOfChild) {
		this.intNoOfChild = intNoOfChild;
	}

	public String getVchNationality() {
		return vchNationality;
	}

	public void setVchNationality(String vchNationality) {
		this.vchNationality = vchNationality;
	}

	public String getVchBookingItemId() {
		return vchBookingItemId;
	}

	public void setVchBookingItemId(String vchBookingItemId) {
		this.vchBookingItemId = vchBookingItemId;
	}

	public String getVchTotalBookingAmount() {
		return vchTotalBookingAmount;
	}

	public void setVchTotalBookingAmount(String vchTotalBookingAmount) {
		this.vchTotalBookingAmount = vchTotalBookingAmount;
	}

	public Integer getIntNoOfDays() {
		return intNoOfDays;
	}

	public void setIntNoOfDays(Integer intNoOfDays) {
		this.intNoOfDays = intNoOfDays;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchMobile() {
		return vchMobile;
	}

	public void setVchMobile(String vchMobile) {
		this.vchMobile = vchMobile;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

}