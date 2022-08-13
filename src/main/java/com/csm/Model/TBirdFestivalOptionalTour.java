package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_optional_tour")
public class TBirdFestivalOptionalTour {
	@Id
	@Column(name = "intOptionalTourId", nullable = false)
	private Integer id;

	@Column(name = "intAppId")
	private Integer intAppId;

	@Column(name = "vchPackage", length = 45)
	private String vchPackage;

	@Column(name = "intPackageOnePerson")
	private Integer intPackageOnePerson;

	@Column(name = "intNoOfTwinSharingRoom")
	private Integer intNoOfTwinSharingRoom;

	@Column(name = "intTwinFirstNight")
	private Integer intTwinFirstNight;

	@Column(name = "intNoOfTwinSharingRoom2")
	private Integer intNoOfTwinSharingRoom2;

	@Column(name = "intTwinSecondNight")
	private Integer intTwinSecondNight;

	@Column(name = "intNoOfDoubleBadedRoom")
	private Integer intNoOfDoubleBadedRoom;

	@Column(name = "intDoubleFirstNight")
	private Integer intDoubleFirstNight;

	@Column(name = "intNoOfDoubleBadedRoom2")
	private Integer intNoOfDoubleBadedRoom2;

	@Column(name = "intDoubleSecondNight")
	private Integer intDoubleSecondNight;

	@Column(name = "intNoofExtRoom")
	private Integer intNoofExtRoom;

	@Column(name = "intNoofExtRoom2")
	private Integer intNoofExtRoom2;

	@Column(name = "intTotalAmount")
	private Integer intTotalAmount;

	@Column(name = "intTotalGSTAmount")
	private Integer intTotalGSTAmount;

	@Column(name = "intTotalPayableAmount")
	private Integer intTotalPayableAmount;

	@Column(name = "intPaymentStatus")
	private Integer intPaymentStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAppId() {
		return intAppId;
	}

	public void setIntAppId(Integer intAppId) {
		this.intAppId = intAppId;
	}

	public String getVchPackage() {
		return vchPackage;
	}

	public void setVchPackage(String vchPackage) {
		this.vchPackage = vchPackage;
	}

	public Integer getIntPackageOnePerson() {
		return intPackageOnePerson;
	}

	public void setIntPackageOnePerson(Integer intPackageOnePerson) {
		this.intPackageOnePerson = intPackageOnePerson;
	}

	public Integer getIntNoOfTwinSharingRoom() {
		return intNoOfTwinSharingRoom;
	}

	public void setIntNoOfTwinSharingRoom(Integer intNoOfTwinSharingRoom) {
		this.intNoOfTwinSharingRoom = intNoOfTwinSharingRoom;
	}

	public Integer getIntTwinFirstNight() {
		return intTwinFirstNight;
	}

	public void setIntTwinFirstNight(Integer intTwinFirstNight) {
		this.intTwinFirstNight = intTwinFirstNight;
	}

	public Integer getIntNoOfTwinSharingRoom2() {
		return intNoOfTwinSharingRoom2;
	}

	public void setIntNoOfTwinSharingRoom2(Integer intNoOfTwinSharingRoom2) {
		this.intNoOfTwinSharingRoom2 = intNoOfTwinSharingRoom2;
	}

	public Integer getIntTwinSecondNight() {
		return intTwinSecondNight;
	}

	public void setIntTwinSecondNight(Integer intTwinSecondNight) {
		this.intTwinSecondNight = intTwinSecondNight;
	}

	public Integer getIntNoOfDoubleBadedRoom() {
		return intNoOfDoubleBadedRoom;
	}

	public void setIntNoOfDoubleBadedRoom(Integer intNoOfDoubleBadedRoom) {
		this.intNoOfDoubleBadedRoom = intNoOfDoubleBadedRoom;
	}

	public Integer getIntDoubleFirstNight() {
		return intDoubleFirstNight;
	}

	public void setIntDoubleFirstNight(Integer intDoubleFirstNight) {
		this.intDoubleFirstNight = intDoubleFirstNight;
	}

	public Integer getIntNoOfDoubleBadedRoom2() {
		return intNoOfDoubleBadedRoom2;
	}

	public void setIntNoOfDoubleBadedRoom2(Integer intNoOfDoubleBadedRoom2) {
		this.intNoOfDoubleBadedRoom2 = intNoOfDoubleBadedRoom2;
	}

	public Integer getIntDoubleSecondNight() {
		return intDoubleSecondNight;
	}

	public void setIntDoubleSecondNight(Integer intDoubleSecondNight) {
		this.intDoubleSecondNight = intDoubleSecondNight;
	}

	public Integer getIntNoofExtRoom() {
		return intNoofExtRoom;
	}

	public void setIntNoofExtRoom(Integer intNoofExtRoom) {
		this.intNoofExtRoom = intNoofExtRoom;
	}

	public Integer getIntNoofExtRoom2() {
		return intNoofExtRoom2;
	}

	public void setIntNoofExtRoom2(Integer intNoofExtRoom2) {
		this.intNoofExtRoom2 = intNoofExtRoom2;
	}

	public Integer getIntTotalAmount() {
		return intTotalAmount;
	}

	public void setIntTotalAmount(Integer intTotalAmount) {
		this.intTotalAmount = intTotalAmount;
	}

	public Integer getIntTotalGSTAmount() {
		return intTotalGSTAmount;
	}

	public void setIntTotalGSTAmount(Integer intTotalGSTAmount) {
		this.intTotalGSTAmount = intTotalGSTAmount;
	}

	public Integer getIntTotalPayableAmount() {
		return intTotalPayableAmount;
	}

	public void setIntTotalPayableAmount(Integer intTotalPayableAmount) {
		this.intTotalPayableAmount = intTotalPayableAmount;
	}

	public Integer getIntPaymentStatus() {
		return intPaymentStatus;
	}

	public void setIntPaymentStatus(Integer intPaymentStatus) {
		this.intPaymentStatus = intPaymentStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
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

}