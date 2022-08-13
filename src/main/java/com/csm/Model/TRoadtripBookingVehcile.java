package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_roadtrip_booking_vehcile")
public class TRoadtripBookingVehcile {
	@Id
	@Column(name = "intVehcilebookingId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intCategoryId")
	private Integer intCategoryId;

	@Column(name = "vchCategoryName", length = 128)
	private String vchCategoryName;

	@Column(name = "vchDescription", length = 1024)
	private String vchDescription;

	@Column(name = "intTransportId")
	private Integer intTransportId;

	@Column(name = "vchBasePrice", precision = 10, scale = 2)
	private BigDecimal vchBasePrice;

	@Column(name = "vchVehiclePhoto", length = 256)
	private String vchVehiclePhoto;

	@Column(name = "vchVehicleCapacity", length = 25)
	private String vchVehicleCapacity;

	@Column(name = "vchBookingOption", length = 25)
	private String vchBookingOption;

	@Column(name = "vchDriverCharge", precision = 10, scale = 2)
	private BigDecimal vchDriverCharge;

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

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public Integer getIntTransportId() {
		return intTransportId;
	}

	public void setIntTransportId(Integer intTransportId) {
		this.intTransportId = intTransportId;
	}

	public BigDecimal getVchBasePrice() {
		return vchBasePrice;
	}

	public void setVchBasePrice(BigDecimal vchBasePrice) {
		this.vchBasePrice = vchBasePrice;
	}

	public String getVchVehiclePhoto() {
		return vchVehiclePhoto;
	}

	public void setVchVehiclePhoto(String vchVehiclePhoto) {
		this.vchVehiclePhoto = vchVehiclePhoto;
	}

	public String getVchVehicleCapacity() {
		return vchVehicleCapacity;
	}

	public void setVchVehicleCapacity(String vchVehicleCapacity) {
		this.vchVehicleCapacity = vchVehicleCapacity;
	}

	public String getVchBookingOption() {
		return vchBookingOption;
	}

	public void setVchBookingOption(String vchBookingOption) {
		this.vchBookingOption = vchBookingOption;
	}

	public BigDecimal getVchDriverCharge() {
		return vchDriverCharge;
	}

	public void setVchDriverCharge(BigDecimal vchDriverCharge) {
		this.vchDriverCharge = vchDriverCharge;
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