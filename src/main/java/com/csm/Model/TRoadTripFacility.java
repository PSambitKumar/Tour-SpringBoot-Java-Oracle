package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_facilities")
public class TRoadTripFacility {
	@Id
	@Column(name = "intFacilityId", nullable = false)
	private Integer id;

	@Column(name = "vchFacilities", length = 128)
	private String vchFacilities;

	@Column(name = "intFacilitiesCategory")
	private Integer intFacilitiesCategory;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "vchIcon", length = 45)
	private String vchIcon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchFacilities() {
		return vchFacilities;
	}

	public void setVchFacilities(String vchFacilities) {
		this.vchFacilities = vchFacilities;
	}

	public Integer getIntFacilitiesCategory() {
		return intFacilitiesCategory;
	}

	public void setIntFacilitiesCategory(Integer intFacilitiesCategory) {
		this.intFacilitiesCategory = intFacilitiesCategory;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public String getVchIcon() {
		return vchIcon;
	}

	public void setVchIcon(String vchIcon) {
		this.vchIcon = vchIcon;
	}

}