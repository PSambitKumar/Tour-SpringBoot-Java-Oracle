package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_cleaning_housekeeping")
public class TCovidSafetyCleaningHousekeeping {
	@Id
	@Column(name = "intProcedureId", nullable = false)
	private Integer id;

	@Column(name = "intHotelId")
	private Integer intHotelId;

	@Column(name = "vchAreaItem", length = 200)
	private String vchAreaItem;

	@Column(name = "vchEquipment", length = 200)
	private String vchEquipment;

	@Column(name = "vchFrequency", length = 200)
	private String vchFrequency;

	@Column(name = "vchMethodProcedure", length = 200)
	private String vchMethodProcedure;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntHotelId() {
		return intHotelId;
	}

	public void setIntHotelId(Integer intHotelId) {
		this.intHotelId = intHotelId;
	}

	public String getVchAreaItem() {
		return vchAreaItem;
	}

	public void setVchAreaItem(String vchAreaItem) {
		this.vchAreaItem = vchAreaItem;
	}

	public String getVchEquipment() {
		return vchEquipment;
	}

	public void setVchEquipment(String vchEquipment) {
		this.vchEquipment = vchEquipment;
	}

	public String getVchFrequency() {
		return vchFrequency;
	}

	public void setVchFrequency(String vchFrequency) {
		this.vchFrequency = vchFrequency;
	}

	public String getVchMethodProcedure() {
		return vchMethodProcedure;
	}

	public void setVchMethodProcedure(String vchMethodProcedure) {
		this.vchMethodProcedure = vchMethodProcedure;
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

}