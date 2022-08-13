package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_biker_destination")
public class TBikerDestination {
	@Id
	@Column(name = "intDestId", nullable = false)
	private Integer id;

	@Column(name = "intRegistrationId")
	private Integer intRegistrationId;

	@Column(name = "intFromDestination")
	private Integer intFromDestination;

	@Column(name = "intToDestination")
	private Integer intToDestination;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntRegistrationId() {
		return intRegistrationId;
	}

	public void setIntRegistrationId(Integer intRegistrationId) {
		this.intRegistrationId = intRegistrationId;
	}

	public Integer getIntFromDestination() {
		return intFromDestination;
	}

	public void setIntFromDestination(Integer intFromDestination) {
		this.intFromDestination = intFromDestination;
	}

	public Integer getIntToDestination() {
		return intToDestination;
	}

	public void setIntToDestination(Integer intToDestination) {
		this.intToDestination = intToDestination;
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

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

}