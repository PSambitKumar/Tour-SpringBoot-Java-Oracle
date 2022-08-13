package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_travel_agent_category")
public class TAffiliateTravelAgentCategory {
	@Id
	@Column(name = "intCatId", nullable = false)
	private Integer id;

	@Column(name = "vchCategoryName", length = 200)
	private String vchCategoryName;

	@Column(name = "intCatType")
	private Integer intCatType;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchCategoryName() {
		return vchCategoryName;
	}

	public void setVchCategoryName(String vchCategoryName) {
		this.vchCategoryName = vchCategoryName;
	}

	public Integer getIntCatType() {
		return intCatType;
	}

	public void setIntCatType(Integer intCatType) {
		this.intCatType = intCatType;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}