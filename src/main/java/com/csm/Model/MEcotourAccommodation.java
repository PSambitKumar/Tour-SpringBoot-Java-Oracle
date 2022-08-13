package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_ecotour_accommodations")
public class MEcotourAccommodation {
	@Id
	@Column(name = "intAccommodationId", nullable = false)
	private Integer id;

	@Column(name = "intLocationId", nullable = false)
	private Integer intLocationId;

	@Column(name = "intAccommodationMasterId")
	private Integer intAccommodationMasterId;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedOn")
	private Instant intUpdatedOn;

	@Column(name = "IntUpdatedBy")
	private Integer intUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public Integer getIntAccommodationMasterId() {
		return intAccommodationMasterId;
	}

	public void setIntAccommodationMasterId(Integer intAccommodationMasterId) {
		this.intAccommodationMasterId = intAccommodationMasterId;
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

	public Instant getIntUpdatedOn() {
		return intUpdatedOn;
	}

	public void setIntUpdatedOn(Instant intUpdatedOn) {
		this.intUpdatedOn = intUpdatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

}