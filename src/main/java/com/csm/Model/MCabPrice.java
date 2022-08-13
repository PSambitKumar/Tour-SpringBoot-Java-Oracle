package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "m_cab_price")
public class MCabPrice {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intCabDestinationId")
	private Integer intCabDestinationId;

	@Column(name = "intCabId")
	private Integer intCabId;

	@Column(name = "decPrice", precision = 10, scale = 2)
	private BigDecimal decPrice;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

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

	public Integer getIntCabDestinationId() {
		return intCabDestinationId;
	}

	public void setIntCabDestinationId(Integer intCabDestinationId) {
		this.intCabDestinationId = intCabDestinationId;
	}

	public Integer getIntCabId() {
		return intCabId;
	}

	public void setIntCabId(Integer intCabId) {
		this.intCabId = intCabId;
	}

	public BigDecimal getDecPrice() {
		return decPrice;
	}

	public void setDecPrice(BigDecimal decPrice) {
		this.decPrice = decPrice;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

}