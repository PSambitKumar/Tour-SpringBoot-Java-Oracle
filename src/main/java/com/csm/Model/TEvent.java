package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_events")
public class TEvent {
	@Id
	@Column(name = "intEventId", nullable = false)
	private Integer id;

	@Column(name = "vchEventName", length = 64)
	private String vchEventName;

	@Column(name = "intAccountId")
	private Integer intAccountId;

	@Column(name = "intCatId")
	private Integer intCatId;

	@Column(name = "tinEventType")
	private Byte tinEventType;

	@Column(name = "dtmFromDate")
	private LocalDate dtmFromDate;

	@Column(name = "dtmToDate")
	private LocalDate dtmToDate;

	@Column(name = "intRecurringType")
	private Integer intRecurringType;

	@Column(name = "intDay")
	private Integer intDay;

	@Column(name = "vchHolidayImg", length = 64)
	private String vchHolidayImg;

	@Column(name = "intNotifyFromDay")
	private Integer intNotifyFromDay;

	@Lob
	@Column(name = "vchDescription")
	private String vchDescription;

	@Column(name = "stmCreatedOn")
	private Instant stmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "INT_PUBLISH_STATUS")
	private Boolean intPublishStatus;

	@Column(name = "vchDays", length = 254)
	private String vchDays;

	@Column(name = "fromTime", length = 64)
	private String fromTime;

	@Column(name = "toTime", length = 64)
	private String toTime;

	@Column(name = "vchVenue", length = 512)
	private String vchVenue;

	@Column(name = "vchTicket", length = 512)
	private String vchTicket;

	@Column(name = "vchContactInfo", length = 512)
	private String vchContactInfo;

	@Column(name = "intTourDot")
	private Integer intTourDot;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchEventName() {
		return vchEventName;
	}

	public void setVchEventName(String vchEventName) {
		this.vchEventName = vchEventName;
	}

	public Integer getIntAccountId() {
		return intAccountId;
	}

	public void setIntAccountId(Integer intAccountId) {
		this.intAccountId = intAccountId;
	}

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

	public Byte getTinEventType() {
		return tinEventType;
	}

	public void setTinEventType(Byte tinEventType) {
		this.tinEventType = tinEventType;
	}

	public LocalDate getDtmFromDate() {
		return dtmFromDate;
	}

	public void setDtmFromDate(LocalDate dtmFromDate) {
		this.dtmFromDate = dtmFromDate;
	}

	public LocalDate getDtmToDate() {
		return dtmToDate;
	}

	public void setDtmToDate(LocalDate dtmToDate) {
		this.dtmToDate = dtmToDate;
	}

	public Integer getIntRecurringType() {
		return intRecurringType;
	}

	public void setIntRecurringType(Integer intRecurringType) {
		this.intRecurringType = intRecurringType;
	}

	public Integer getIntDay() {
		return intDay;
	}

	public void setIntDay(Integer intDay) {
		this.intDay = intDay;
	}

	public String getVchHolidayImg() {
		return vchHolidayImg;
	}

	public void setVchHolidayImg(String vchHolidayImg) {
		this.vchHolidayImg = vchHolidayImg;
	}

	public Integer getIntNotifyFromDay() {
		return intNotifyFromDay;
	}

	public void setIntNotifyFromDay(Integer intNotifyFromDay) {
		this.intNotifyFromDay = intNotifyFromDay;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Boolean getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Boolean intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public String getVchDays() {
		return vchDays;
	}

	public void setVchDays(String vchDays) {
		this.vchDays = vchDays;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getVchVenue() {
		return vchVenue;
	}

	public void setVchVenue(String vchVenue) {
		this.vchVenue = vchVenue;
	}

	public String getVchTicket() {
		return vchTicket;
	}

	public void setVchTicket(String vchTicket) {
		this.vchTicket = vchTicket;
	}

	public String getVchContactInfo() {
		return vchContactInfo;
	}

	public void setVchContactInfo(String vchContactInfo) {
		this.vchContactInfo = vchContactInfo;
	}

	public Integer getIntTourDot() {
		return intTourDot;
	}

	public void setIntTourDot(Integer intTourDot) {
		this.intTourDot = intTourDot;
	}

}