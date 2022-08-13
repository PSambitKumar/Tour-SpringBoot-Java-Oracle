package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_roadtrip_booking_ecotour_accomodation")
public class TRoadtripBookingEcotourAccomodation {
	@Id
	@Column(name = "intEcotourBookingId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intCategoryId")
	private Integer intCategoryId;

	@Column(name = "vchCategoryName", length = 128)
	private String vchCategoryName;

	@Column(name = "vchServiceProviderType", length = 15)
	private String vchServiceProviderType;

	@Column(name = "intEcotourLocationId")
	private Integer intEcotourLocationId;

	@Column(name = "intAccommodationId")
	private Integer intAccommodationId;

	@Column(name = "intCottageId")
	private Integer intCottageId;

	@Column(name = "vchBasePrice", precision = 10, scale = 2)
	private BigDecimal vchBasePrice;

	@Column(name = "intExtraBed")
	private Integer intExtraBed;

	@Column(name = "vchExtraBedCharges", precision = 10, scale = 2)
	private BigDecimal vchExtraBedCharges;

	@Column(name = "vchTax", precision = 10, scale = 2)
	private BigDecimal vchTax;

	@Column(name = "vchPriceExcludingTax", precision = 10, scale = 2)
	private BigDecimal vchPriceExcludingTax;

	@Column(name = "vchPriceIncludingTax", precision = 10, scale = 2)
	private BigDecimal vchPriceIncludingTax;

	@Column(name = "vchDescription", length = 1024)
	private String vchDescription;

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

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchCategoryName() {
		return vchCategoryName;
	}

	public void setVchCategoryName(String vchCategoryName) {
		this.vchCategoryName = vchCategoryName;
	}

	public String getVchServiceProviderType() {
		return vchServiceProviderType;
	}

	public void setVchServiceProviderType(String vchServiceProviderType) {
		this.vchServiceProviderType = vchServiceProviderType;
	}

	public Integer getIntEcotourLocationId() {
		return intEcotourLocationId;
	}

	public void setIntEcotourLocationId(Integer intEcotourLocationId) {
		this.intEcotourLocationId = intEcotourLocationId;
	}

	public Integer getIntAccommodationId() {
		return intAccommodationId;
	}

	public void setIntAccommodationId(Integer intAccommodationId) {
		this.intAccommodationId = intAccommodationId;
	}

	public Integer getIntCottageId() {
		return intCottageId;
	}

	public void setIntCottageId(Integer intCottageId) {
		this.intCottageId = intCottageId;
	}

	public BigDecimal getVchBasePrice() {
		return vchBasePrice;
	}

	public void setVchBasePrice(BigDecimal vchBasePrice) {
		this.vchBasePrice = vchBasePrice;
	}

	public Integer getIntExtraBed() {
		return intExtraBed;
	}

	public void setIntExtraBed(Integer intExtraBed) {
		this.intExtraBed = intExtraBed;
	}

	public BigDecimal getVchExtraBedCharges() {
		return vchExtraBedCharges;
	}

	public void setVchExtraBedCharges(BigDecimal vchExtraBedCharges) {
		this.vchExtraBedCharges = vchExtraBedCharges;
	}

	public BigDecimal getVchTax() {
		return vchTax;
	}

	public void setVchTax(BigDecimal vchTax) {
		this.vchTax = vchTax;
	}

	public BigDecimal getVchPriceExcludingTax() {
		return vchPriceExcludingTax;
	}

	public void setVchPriceExcludingTax(BigDecimal vchPriceExcludingTax) {
		this.vchPriceExcludingTax = vchPriceExcludingTax;
	}

	public BigDecimal getVchPriceIncludingTax() {
		return vchPriceIncludingTax;
	}

	public void setVchPriceIncludingTax(BigDecimal vchPriceIncludingTax) {
		this.vchPriceIncludingTax = vchPriceIncludingTax;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
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