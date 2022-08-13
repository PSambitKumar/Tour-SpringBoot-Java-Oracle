package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_coupan_taken")
public class TCoupanTaken {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intDealId")
	private Integer intDealId;

	@Column(name = "intUserId")
	private Integer intUserId;

	@Column(name = "intUserType")
	private Integer intUserType;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntDealId() {
		return intDealId;
	}

	public void setIntDealId(Integer intDealId) {
		this.intDealId = intDealId;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public Integer getIntUserType() {
		return intUserType;
	}

	public void setIntUserType(Integer intUserType) {
		this.intUserType = intUserType;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}