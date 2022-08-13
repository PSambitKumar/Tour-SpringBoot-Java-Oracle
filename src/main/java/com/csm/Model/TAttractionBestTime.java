package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_attraction_best_times")
public class TAttractionBestTime {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intAttrId")
	private Integer intAttrId;

	@Column(name = "intBestTimeFrom")
	private Integer intBestTimeFrom;

	@Column(name = "intBestTimeTo")
	private Integer intBestTimeTo;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAttrId() {
		return intAttrId;
	}

	public void setIntAttrId(Integer intAttrId) {
		this.intAttrId = intAttrId;
	}

	public Integer getIntBestTimeFrom() {
		return intBestTimeFrom;
	}

	public void setIntBestTimeFrom(Integer intBestTimeFrom) {
		this.intBestTimeFrom = intBestTimeFrom;
	}

	public Integer getIntBestTimeTo() {
		return intBestTimeTo;
	}

	public void setIntBestTimeTo(Integer intBestTimeTo) {
		this.intBestTimeTo = intBestTimeTo;
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

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
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

}