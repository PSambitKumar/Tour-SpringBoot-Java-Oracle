package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_ecotour_booking_details")
public class TEcotourBookingDetail {
	@Id
	@Column(name = "intbookingId", nullable = false)
	private Integer id;

	@Column(name = "intBookedBy")
	private Integer intBookedBy;

	@Column(name = "intDestination")
	private Integer intDestination;

	@Column(name = "intLocation")
	private Integer intLocation;

	@Column(name = "intAccommodation")
	private Integer intAccommodation;

	@Column(name = "intQuantitySelected")
	private Integer intQuantitySelected;

	@Column(name = "dtmCheckin")
	private LocalDate dtmCheckin;

	@Column(name = "dtmCheckout")
	private LocalDate dtmCheckout;

	@Column(name = "intAdult")
	private Integer intAdult;

	@Column(name = "intChild")
	private Integer intChild;

	@Column(name = "decPaidAmount", precision = 10, scale = 2)
	private BigDecimal decPaidAmount;

	@Column(name = "vchEcoTourRefno", length = 64)
	private String vchEcoTourRefno;

	@Column(name = "dtmBookingDate")
	private Instant dtmBookingDate;

	@Column(name = "intBookingStatus")
	private Integer intBookingStatus;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedBy")
	private Instant dtmCreatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntBookedBy() {
		return intBookedBy;
	}

	public void setIntBookedBy(Integer intBookedBy) {
		this.intBookedBy = intBookedBy;
	}

	public Integer getIntDestination() {
		return intDestination;
	}

	public void setIntDestination(Integer intDestination) {
		this.intDestination = intDestination;
	}

	public Integer getIntLocation() {
		return intLocation;
	}

	public void setIntLocation(Integer intLocation) {
		this.intLocation = intLocation;
	}

	public Integer getIntAccommodation() {
		return intAccommodation;
	}

	public void setIntAccommodation(Integer intAccommodation) {
		this.intAccommodation = intAccommodation;
	}

	public Integer getIntQuantitySelected() {
		return intQuantitySelected;
	}

	public void setIntQuantitySelected(Integer intQuantitySelected) {
		this.intQuantitySelected = intQuantitySelected;
	}

	public LocalDate getDtmCheckin() {
		return dtmCheckin;
	}

	public void setDtmCheckin(LocalDate dtmCheckin) {
		this.dtmCheckin = dtmCheckin;
	}

	public LocalDate getDtmCheckout() {
		return dtmCheckout;
	}

	public void setDtmCheckout(LocalDate dtmCheckout) {
		this.dtmCheckout = dtmCheckout;
	}

	public Integer getIntAdult() {
		return intAdult;
	}

	public void setIntAdult(Integer intAdult) {
		this.intAdult = intAdult;
	}

	public Integer getIntChild() {
		return intChild;
	}

	public void setIntChild(Integer intChild) {
		this.intChild = intChild;
	}

	public BigDecimal getDecPaidAmount() {
		return decPaidAmount;
	}

	public void setDecPaidAmount(BigDecimal decPaidAmount) {
		this.decPaidAmount = decPaidAmount;
	}

	public String getVchEcoTourRefno() {
		return vchEcoTourRefno;
	}

	public void setVchEcoTourRefno(String vchEcoTourRefno) {
		this.vchEcoTourRefno = vchEcoTourRefno;
	}

	public Instant getDtmBookingDate() {
		return dtmBookingDate;
	}

	public void setDtmBookingDate(Instant dtmBookingDate) {
		this.dtmBookingDate = dtmBookingDate;
	}

	public Integer getIntBookingStatus() {
		return intBookingStatus;
	}

	public void setIntBookingStatus(Integer intBookingStatus) {
		this.intBookingStatus = intBookingStatus;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmCreatedBy() {
		return dtmCreatedBy;
	}

	public void setDtmCreatedBy(Instant dtmCreatedBy) {
		this.dtmCreatedBy = dtmCreatedBy;
	}

}