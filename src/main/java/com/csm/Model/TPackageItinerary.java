package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_package_itinerary")
public class TPackageItinerary {
	@Id
	@Column(name = "intPackageItinerary", nullable = false)
	private Integer id;

	@Column(name = "intPackageId")
	private Integer intPackageId;

	@Column(name = "vchHeading", length = 264)
	private String vchHeading;

	@Column(name = "vchPackagePrice", precision = 10, scale = 2)
	private BigDecimal vchPackagePrice;

	@Column(name = "tinGST")
	private Byte tinGST;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntPackageId() {
		return intPackageId;
	}

	public void setIntPackageId(Integer intPackageId) {
		this.intPackageId = intPackageId;
	}

	public String getVchHeading() {
		return vchHeading;
	}

	public void setVchHeading(String vchHeading) {
		this.vchHeading = vchHeading;
	}

	public BigDecimal getVchPackagePrice() {
		return vchPackagePrice;
	}

	public void setVchPackagePrice(BigDecimal vchPackagePrice) {
		this.vchPackagePrice = vchPackagePrice;
	}

	public Byte getTinGST() {
		return tinGST;
	}

	public void setTinGST(Byte tinGST) {
		this.tinGST = tinGST;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}