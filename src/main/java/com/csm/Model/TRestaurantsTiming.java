package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "t_restaurants_timing")
public class TRestaurantsTiming {
	@Id
	@Column(name = "intTimingId", nullable = false)
	private Integer id;

	@Column(name = "intRestaurantsId")
	private Integer intRestaurantsId;

	@Column(name = "intMealId")
	private Integer intMealId;

	@Column(name = "vchOpenTime")
	private LocalTime vchOpenTime;

	@Column(name = "vchCloseTime")
	private LocalTime vchCloseTime;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntRestaurantsId() {
		return intRestaurantsId;
	}

	public void setIntRestaurantsId(Integer intRestaurantsId) {
		this.intRestaurantsId = intRestaurantsId;
	}

	public Integer getIntMealId() {
		return intMealId;
	}

	public void setIntMealId(Integer intMealId) {
		this.intMealId = intMealId;
	}

	public LocalTime getVchOpenTime() {
		return vchOpenTime;
	}

	public void setVchOpenTime(LocalTime vchOpenTime) {
		this.vchOpenTime = vchOpenTime;
	}

	public LocalTime getVchCloseTime() {
		return vchCloseTime;
	}

	public void setVchCloseTime(LocalTime vchCloseTime) {
		this.vchCloseTime = vchCloseTime;
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

}