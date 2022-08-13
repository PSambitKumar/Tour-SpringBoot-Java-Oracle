package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_cabs_destination_master")
public class MCabsDestinationMaster {
	@Id
	@Column(name = "intcabId", nullable = false)
	private Integer id;

	@Column(name = "vchCabName", length = 100)
	private String vchCabName;

	@Column(name = "intCoverageKms")
	private Integer intCoverageKms;

	@Column(name = "intDurationHrs")
	private Integer intDurationHrs;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchCabName() {
		return vchCabName;
	}

	public void setVchCabName(String vchCabName) {
		this.vchCabName = vchCabName;
	}

	public Integer getIntCoverageKms() {
		return intCoverageKms;
	}

	public void setIntCoverageKms(Integer intCoverageKms) {
		this.intCoverageKms = intCoverageKms;
	}

	public Integer getIntDurationHrs() {
		return intDurationHrs;
	}

	public void setIntDurationHrs(Integer intDurationHrs) {
		this.intDurationHrs = intDurationHrs;
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

}