package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_deals_offers")
public class TDealsOffer {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intHotelId")
	private Integer intHotelId;

	@Column(name = "vchHeading", length = 100)
	private String vchHeading;

	@Column(name = "vchDescription", length = 200)
	private String vchDescription;

	@Column(name = "txtStartDt", length = 60)
	private String txtStartDt;

	@Column(name = "txtEndDt", length = 60)
	private String txtEndDt;

	@Column(name = "vchOfferCode", length = 26)
	private String vchOfferCode;

	@Column(name = "intNoOfPeople")
	private Integer intNoOfPeople;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intStatus")
	private Integer intStatus;

	@Column(name = "intNoOfPeopleTaken")
	private Integer intNoOfPeopleTaken;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntHotelId() {
		return intHotelId;
	}

	public void setIntHotelId(Integer intHotelId) {
		this.intHotelId = intHotelId;
	}

	public String getVchHeading() {
		return vchHeading;
	}

	public void setVchHeading(String vchHeading) {
		this.vchHeading = vchHeading;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public String getTxtStartDt() {
		return txtStartDt;
	}

	public void setTxtStartDt(String txtStartDt) {
		this.txtStartDt = txtStartDt;
	}

	public String getTxtEndDt() {
		return txtEndDt;
	}

	public void setTxtEndDt(String txtEndDt) {
		this.txtEndDt = txtEndDt;
	}

	public String getVchOfferCode() {
		return vchOfferCode;
	}

	public void setVchOfferCode(String vchOfferCode) {
		this.vchOfferCode = vchOfferCode;
	}

	public Integer getIntNoOfPeople() {
		return intNoOfPeople;
	}

	public void setIntNoOfPeople(Integer intNoOfPeople) {
		this.intNoOfPeople = intNoOfPeople;
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

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Integer getIntStatus() {
		return intStatus;
	}

	public void setIntStatus(Integer intStatus) {
		this.intStatus = intStatus;
	}

	public Integer getIntNoOfPeopleTaken() {
		return intNoOfPeopleTaken;
	}

	public void setIntNoOfPeopleTaken(Integer intNoOfPeopleTaken) {
		this.intNoOfPeopleTaken = intNoOfPeopleTaken;
	}

}