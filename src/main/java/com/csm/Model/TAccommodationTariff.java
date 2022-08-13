package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_accommodation_tariff")
public class TAccommodationTariff {
	@Id
	@Column(name = "intTariffId", nullable = false)
	private Integer id;

	@Column(name = "intAccommodationId", nullable = false)
	private Integer intAccommodationId;

	@Column(name = "vchRoomType", length = 128)
	private String vchRoomType;

	@Column(name = "vchPrice", precision = 10, scale = 2)
	private BigDecimal vchPrice;

	@Column(name = "vchExtraPersonPrice", precision = 10, scale = 2)
	private BigDecimal vchExtraPersonPrice;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
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

	public Integer getIntAccommodationId() {
		return intAccommodationId;
	}

	public void setIntAccommodationId(Integer intAccommodationId) {
		this.intAccommodationId = intAccommodationId;
	}

	public String getVchRoomType() {
		return vchRoomType;
	}

	public void setVchRoomType(String vchRoomType) {
		this.vchRoomType = vchRoomType;
	}

	public BigDecimal getVchPrice() {
		return vchPrice;
	}

	public void setVchPrice(BigDecimal vchPrice) {
		this.vchPrice = vchPrice;
	}

	public BigDecimal getVchExtraPersonPrice() {
		return vchExtraPersonPrice;
	}

	public void setVchExtraPersonPrice(BigDecimal vchExtraPersonPrice) {
		this.vchExtraPersonPrice = vchExtraPersonPrice;
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