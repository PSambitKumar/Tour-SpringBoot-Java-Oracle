package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_restaurants_cuisines")
public class TRestaurantsCuisine {
	@Id
	@Column(name = "intResCusionId", nullable = false)
	private Integer id;

	@Column(name = "intRestaurantsId")
	private Integer intRestaurantsId;

	@Column(name = "intCuisinesId")
	private Integer intCuisinesId;

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

	public Integer getIntCuisinesId() {
		return intCuisinesId;
	}

	public void setIntCuisinesId(Integer intCuisinesId) {
		this.intCuisinesId = intCuisinesId;
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