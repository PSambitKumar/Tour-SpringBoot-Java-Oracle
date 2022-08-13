package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_things_to_do")
public class TThingsToDo {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intDestinationId")
	private Integer intDestinationId;

	@Column(name = "vchAcvtivities", length = 500)
	private String vchAcvtivities;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCeratedBy")
	private Integer intCeratedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntDestinationId() {
		return intDestinationId;
	}

	public void setIntDestinationId(Integer intDestinationId) {
		this.intDestinationId = intDestinationId;
	}

	public String getVchAcvtivities() {
		return vchAcvtivities;
	}

	public void setVchAcvtivities(String vchAcvtivities) {
		this.vchAcvtivities = vchAcvtivities;
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

	public Integer getIntCeratedBy() {
		return intCeratedBy;
	}

	public void setIntCeratedBy(Integer intCeratedBy) {
		this.intCeratedBy = intCeratedBy;
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

}