package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "m_ecotour_cottage")
public class MEcotourCottage {
	@Id
	@Column(name = "intCottageId", nullable = false)
	private Integer id;

	@Column(name = "intLocationId", nullable = false)
	private Integer intLocationId;

	@Column(name = "intCottageMasterId", length = 45)
	private String intCottageMasterId;

	@Column(name = "decPrice", precision = 10, scale = 2)
	private BigDecimal decPrice;

	@Column(name = "decTransactionCharge", precision = 10, scale = 2)
	private BigDecimal decTransactionCharge;

	@Column(name = "decTax", precision = 10, scale = 2)
	private BigDecimal decTax;

	@Column(name = "decTotalPrice", precision = 10, scale = 2)
	private BigDecimal decTotalPrice;

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

	public String getIntCottageMasterId() {
		return intCottageMasterId;
	}

	public void setIntCottageMasterId(String intCottageMasterId) {
		this.intCottageMasterId = intCottageMasterId;
	}

	public BigDecimal getDecPrice() {
		return decPrice;
	}

	public void setDecPrice(BigDecimal decPrice) {
		this.decPrice = decPrice;
	}

	public BigDecimal getDecTransactionCharge() {
		return decTransactionCharge;
	}

	public void setDecTransactionCharge(BigDecimal decTransactionCharge) {
		this.decTransactionCharge = decTransactionCharge;
	}

	public BigDecimal getDecTax() {
		return decTax;
	}

	public void setDecTax(BigDecimal decTax) {
		this.decTax = decTax;
	}

	public BigDecimal getDecTotalPrice() {
		return decTotalPrice;
	}

	public void setDecTotalPrice(BigDecimal decTotalPrice) {
		this.decTotalPrice = decTotalPrice;
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