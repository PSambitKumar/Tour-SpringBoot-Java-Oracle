package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_trail_tour_locations")
public class TTrailTourLocation {
	@Id
	@Column(name = "intLocationId", nullable = false)
	private Integer id;

	@Column(name = "intTrailId")
	private Integer intTrailId;

	@Column(name = "itnCategoryId")
	private Integer itnCategoryId;

	@Column(name = "vchLocationName")
	private String vchLocationName;

	@Lob
	@Column(name = "vchHighlights")
	private String vchHighlights;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

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

	public Integer getIntTrailId() {
		return intTrailId;
	}

	public void setIntTrailId(Integer intTrailId) {
		this.intTrailId = intTrailId;
	}

	public Integer getItnCategoryId() {
		return itnCategoryId;
	}

	public void setItnCategoryId(Integer itnCategoryId) {
		this.itnCategoryId = itnCategoryId;
	}

	public String getVchLocationName() {
		return vchLocationName;
	}

	public void setVchLocationName(String vchLocationName) {
		this.vchLocationName = vchLocationName;
	}

	public String getVchHighlights() {
		return vchHighlights;
	}

	public void setVchHighlights(String vchHighlights) {
		this.vchHighlights = vchHighlights;
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